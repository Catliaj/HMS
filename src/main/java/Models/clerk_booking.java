package Models;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

import Modules.ClerkBooking_Backend;


public class Clerk_Booking extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTable table;
    private ClerkBooking_Backend backend;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Clerk_Booking frame = new Clerk_Booking();
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
	public Clerk_Booking() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1334, 782);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setLocationRelativeTo(null);

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		backend = new ClerkBooking_Backend();
		
		JLabel lbl_Background = new JLabel("");
		lbl_Background.setIcon(new ImageIcon(Clerk_Dashboard.class.getResource("/Resources/CLERK BACKGROUND.png")));
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
		
		JLabel lbl_Greetings = new JLabel("WELCOME RELIABLE CLERK");
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
		lbl_CustomerName.setBounds(604, 24, 195, 39);
		panel.add(lbl_CustomerName);
		
		JPanel panel_Line = new JPanel();
		panel_Line.setBackground(new Color(85, 45, 20));
		panel_Line.setBounds(172, 58, 692, 2);
		panel.add(panel_Line);
		
		JButton btn_Dashboard = new JButton("DASHBOARD");
		btn_Dashboard.setForeground(new Color(85, 45, 20));
		btn_Dashboard.setFont(new Font("Corbel Light", Font.BOLD, 25));
		btn_Dashboard.setBackground(new Color(252, 230, 188));
		btn_Dashboard.setBorderPainted(false);
		btn_Dashboard.setFocusPainted(false);
		btn_Dashboard.setBounds(172, 66, 224, 56);
		panel.add(btn_Dashboard);
		
		btn_Dashboard.addActionListener(new ActionListener() {
		    @Override
		    public void actionPerformed(ActionEvent e) {
		        
		        dispose();
		        new Clerk_Dashboard().setVisible(true);
		    }
		});
		
		JButton btn_Booking = new JButton("BOOKING");
		btn_Booking.setForeground(new Color(252, 230, 188));
		btn_Booking.setFont(new Font("Corbel Light", Font.BOLD, 25));
		btn_Booking.setBorderPainted(false);
		btn_Booking.setFocusPainted(false);
		btn_Booking.setBackground(new Color(139, 76, 33));
		btn_Booking.setBounds(406, 67, 224, 56);
		panel.add(btn_Booking);
		
		JButton btn_Rooms = new JButton("ROOMS");
		btn_Rooms.setForeground(new Color(85, 45, 20));
		btn_Rooms.setFont(new Font("Corbel Light", Font.BOLD, 25));
		btn_Rooms.setBorderPainted(false);
		btn_Rooms.setFocusPainted(false);
		btn_Rooms.setBackground(new Color(252, 230, 188));
		btn_Rooms.setBounds(640, 66, 224, 56);
		panel.add(btn_Rooms);
		
		btn_Rooms.addActionListener(new ActionListener() {
		    @Override
		    public void actionPerformed(ActionEvent e) {
		        
		        dispose();
		        new Clerk_Rooms().setVisible(true);
		    }
		});
		
		JButton btn_Customers = new JButton("CUSTOMERS");
		btn_Customers.setForeground(new Color(85, 45, 20));
		btn_Customers.setFont(new Font("Corbel Light", Font.BOLD, 25));
		btn_Customers.setFocusPainted(false);
		btn_Customers.setBorderPainted(false);
		btn_Customers.setBackground(new Color(252, 230, 188));
		btn_Customers.setBounds(875, 66, 224, 56);
		panel.add(btn_Customers);
		
		btn_Customers.addActionListener(new ActionListener() {
		    @Override
		    public void actionPerformed(ActionEvent e) {
		        
		        dispose();
		        new Clerk_Customers().setVisible(true);
		    }
		});
		
		JButton btn_Exit = new JButton("EXIT");
		btn_Exit.setForeground(new Color(85, 45, 20));
		btn_Exit.setFont(new Font("Corbel Light", Font.BOLD, 25));
		btn_Exit.setFocusPainted(false);
		btn_Exit.setBorderPainted(false);
		btn_Exit.setBackground(new Color(252, 230, 188));
		btn_Exit.setBounds(1110, 66, 190, 56);
		panel.add(btn_Exit);
		
		btn_Exit.addActionListener(new ActionListener() {
		    @Override
		    public void actionPerformed(ActionEvent e) {
		        
		        dispose();
		        new Login().setVisible(true);
		    }
		});
		
		JComboBox comboBox = new JComboBox();
		comboBox.setForeground(new Color(139, 76, 33));
		comboBox.setFont(new Font("Corbel Light", Font.BOLD, 21));
		((JLabel) comboBox.getRenderer()).setVerticalAlignment(SwingConstants.TOP);
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Sort by ...", "Customers", "Rooms", "Check-in Date", "Check-out Date", "Status"}));
		comboBox.setBackground(new Color(252, 230, 188));
		comboBox.setBorder(BorderFactory.createLineBorder(new Color(139, 76, 33), 4));
		comboBox.setBounds(75, 160, 270, 39);
		panel.add(comboBox);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 204, 0));
		panel_1.setBorder(new LineBorder(new Color(85, 45, 20), 6));
		panel_1.setBounds(75, 221, 1171, 472);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(30, 22, 1109, 430);
		panel_1.add(scrollPane);
		
		table = new JTable();
		table.setBackground(new Color(252, 230, 188));
		table.setForeground(new Color(85, 45, 20));
		table.setFont(new Font("Corbel Light", Font.BOLD, 15));
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null, null, "Delete"},
				{null, null, null, null, null, null, null, "Delete"},
				{null, null, null, null, null, null, null, "Delete"},
				{null, null, null, null, null, null, null, "Delete"},
				{null, null, null, null, null, null, null, "Delete"},
			},
			new String[] {
				"Customer Name", "Room", "Room Type", "Price", "Check-in Date", "Check-out Date", "Room Status", ""
			}
		));
		scrollPane.setViewportView(table);
		populateTable();
		
		JTableHeader tableHeader = table.getTableHeader();
		tableHeader.setFont(new Font("Corbel Light", Font.BOLD, 17));
		tableHeader.setPreferredSize(new Dimension(tableHeader.getWidth(), 30));
		tableHeader.setBackground(new Color(85, 45, 20));
		tableHeader.setForeground(new Color(252, 230, 188));
		table.setRowHeight(25);
		table.setGridColor(new Color(85, 45, 20));
	
	}

	
	private void populateTable() {
        backend.populateBookingTable(table);
    }

}
