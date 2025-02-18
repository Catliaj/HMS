package Models;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.border.BevelBorder;

public class customer_history extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					customer_history frame = new customer_history();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public customer_history() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1334, 782);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setLocationRelativeTo(null);

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lbl_Background = new JLabel("");
		lbl_Background.setIcon(new ImageIcon(Clerk_Dashboard.class.getResource("/Resources/CUSTOMER BACKGROUND.png")));
		lbl_Background.setBounds(0, 0, 1320, 745);
		contentPane.add(lbl_Background);
		
		JPanel panel = new JPanel();
		panel.setOpaque(false);
		panel.setBackground(new Color( 0, 0, 0, 0));
		panel.setBounds(0, 0, 1320, 745);
		lbl_Background.add(panel);
		panel.setLayout(null);
		
		JLabel lbl_Logo_Small = new JLabel("");
		lbl_Logo_Small.setIcon(new ImageIcon(Clerk_Dashboard.class.getResource("/Resources/GF_SMALL_LOGO_NoBR.png")));
		lbl_Logo_Small.setBounds(47, 14, 42, 52);
		panel.add(lbl_Logo_Small);
		
		JLabel lbl_CompanyName_1 = new JLabel("HOTEL");
		lbl_CompanyName_1.setVerticalAlignment(SwingConstants.TOP);
		lbl_CompanyName_1.setForeground(new Color(85, 45, 20));
		lbl_CompanyName_1.setFont(new Font("Corbel Light", Font.BOLD, 15));
		lbl_CompanyName_1.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_CompanyName_1.setBounds(9, 90, 118, 19);
		panel.add(lbl_CompanyName_1);
		
		JLabel lbl_CompanyName_2 = new JLabel("GOLDEN FIELDS");
		lbl_CompanyName_2.setVerticalAlignment(SwingConstants.TOP);
		lbl_CompanyName_2.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_CompanyName_2.setForeground(new Color(85, 45, 20));
		lbl_CompanyName_2.setFont(new Font("Corbel Light", Font.BOLD, 15));
		lbl_CompanyName_2.setBounds(9, 71, 118, 19);
		panel.add(lbl_CompanyName_2);
		
		JLabel lbl_Greetings = new JLabel("WELCOME DEAR CUSTOMER");
		lbl_Greetings.setVerticalAlignment(SwingConstants.TOP);
		lbl_Greetings.setHorizontalAlignment(SwingConstants.LEFT);
		lbl_Greetings.setForeground(new Color(85, 45, 20));
		lbl_Greetings.setFont(new Font("Corbel Light", Font.BOLD, 34));
		lbl_Greetings.setBounds(172, 24, 566, 39);
		panel.add(lbl_Greetings);
		
		JLabel lbl_CustomerName = new JLabel("First Name*");
		lbl_CustomerName.setVerticalAlignment(SwingConstants.TOP);
		lbl_CustomerName.setHorizontalAlignment(SwingConstants.LEFT);
		lbl_CustomerName.setForeground(new Color(85, 45, 20));
		lbl_CustomerName.setFont(new Font("Corbel Light", Font.BOLD, 34));
		lbl_CustomerName.setBounds(621, 24, 195, 39);
		panel.add(lbl_CustomerName);
		
		JPanel panel_Line = new JPanel();
		panel_Line.setBackground(new Color(85, 45, 20));
		panel_Line.setBounds(172, 58, 692, 2);
		panel.add(panel_Line);
		
		JButton btn_Booking = new JButton("BOOKING");
		btn_Booking.setForeground(new Color(85, 45, 20));
		btn_Booking.setFont(new Font("Corbel Light", Font.BOLD, 25));
		btn_Booking.setBackground(new Color(229, 167, 86));
		btn_Booking.setBorderPainted(false);
		btn_Booking.setFocusPainted(false);
		btn_Booking.setBounds(172, 67, 224, 56);
		panel.add(btn_Booking);
		
		btn_Booking.addActionListener(new ActionListener() {
		    @Override
		    public void actionPerformed(ActionEvent e) {
		        
		        dispose();
		        new customer_booking().setVisible(true);
		    }
		});
		
		JButton btn_Calendar = new JButton("HISTORY");
		btn_Calendar.setForeground(new Color(229, 167, 86));
		btn_Calendar.setFont(new Font("Corbel Light", Font.BOLD, 25));
		btn_Calendar.setBorderPainted(false);
		btn_Calendar.setFocusPainted(false);
		btn_Calendar.setBackground(new Color(139, 76, 33));
		btn_Calendar.setBounds(406, 67, 224, 56);
		panel.add(btn_Calendar);
		
		JButton btn_Exit = new JButton("EXIT");
		btn_Exit.setForeground(new Color(85, 45, 20));
		btn_Exit.setFont(new Font("Corbel Light", Font.BOLD, 25));
		btn_Exit.setFocusPainted(false);
		btn_Exit.setBorderPainted(false);
		btn_Exit.setBackground(new Color(229, 167, 86));
		btn_Exit.setBounds(640, 67, 190, 56);
		panel.add(btn_Exit);
		
		btn_Exit.addActionListener(new ActionListener() {
		    @Override
		    public void actionPerformed(ActionEvent e) {
		        
		        dispose();
		        new Login().setVisible(true);
		    }
		});
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(242, 209, 146));
		panel_1.setBorder(new LineBorder(new Color(85, 45, 20), 6));
		panel_1.setBounds(70, 166, 1180, 519);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setViewportBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		scrollPane.setBounds(20, 35, 1140, 450);
		panel_1.add(scrollPane);
		
		table = new JTable();
		table.setBackground(new Color(252, 230, 188));
		table.setForeground(new Color(85, 45, 20));
		table.setFont(new Font("Corbel Light", Font.BOLD, 15));
		table.setSurrendersFocusOnKeystroke(true);
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
			},
			new String[] {
				"ROOM", "ROOM TYPE", "PRICE", "CHECK-IN DATE", "CHECK-OUT DATE", "ROOM STATUS", "BOOKING STATUS", "ACTION"
			}
		));
		scrollPane.setViewportView(table);
		
		JTableHeader tableHeader = table.getTableHeader();
		tableHeader.setFont(new Font("Corbel Light", Font.BOLD, 17));
		tableHeader.setPreferredSize(new Dimension(tableHeader.getWidth(), 30));
		tableHeader.setBackground(new Color(85, 45, 20));
		tableHeader.setForeground(new Color(252, 230, 188));
		table.setRowHeight(25);
		table.setGridColor(new Color(85, 45, 20));
	}
}
