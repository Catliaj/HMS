package Models;

import net.sf.jasperreports.engine.*;
import net.sf.jasperreports.view.JasperViewer;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.category.DefaultCategoryDataset;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

public class Sample_Report_And_Analysis {
    public static void main(String[] args) {
        // Create Frame
        JFrame frame = new JFrame("JasperReports Generator");
        frame.setSize(600, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        // Button to generate report
        JButton generateButton = new JButton("Generate Report");
        JTextArea statusArea = new JTextArea();
        statusArea.setEditable(false);

        generateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    // Load and Compile Jasper Report
                    String reportPath = "C:/Users/AcerN/eclipse-workspace/HMS/src/main/java/reports/Cherry.jrxml";
                    JasperReport jasperReport = JasperCompileManager.compileReport(reportPath);

                    // Fill Report with Sample Data
                    HashMap<String, Object> parameters = new HashMap<>();
                    parameters.put("ReportHeader", "Sample Report Header");

                    JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, parameters, new JREmptyDataSource());

                    // Show Report in Viewer
                    JasperViewer.viewReport(jasperPrint, false);
                    
                    statusArea.setText("Report generated successfully with sample data!");
                } catch (Exception ex) {
                    ex.printStackTrace();
                    statusArea.setText("Error: " + ex.getMessage());
                }
            }
        });

        // Create Sample Chart
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        dataset.addValue(10, "Category 1", "Data A");
        dataset.addValue(15, "Category 1", "Data B");
        dataset.addValue(20, "Category 1", "Data C");

        JFreeChart chart = ChartFactory.createBarChart(
                "Sample Chart", "Category", "Value", dataset);

        ChartPanel chartPanel = new ChartPanel(chart);

        // Add components to frame
        frame.add(generateButton, BorderLayout.NORTH);
        frame.add(chartPanel, BorderLayout.CENTER);
        frame.add(new JScrollPane(statusArea), BorderLayout.SOUTH);

        // Display GUI
        frame.setVisible(true);
    }
}
