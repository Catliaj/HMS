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
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

public class Clerk_Rooms extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTable table;
	private JTextField textField_Room;
	private JTextField textField_Type;
	private JTextField textField_RoomStatus;
	private JTextField textField_BookingStatus;
	private JTextField textField_Price;
	private JTextField textField_Photo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Clerk_Rooms frame = new Clerk_Rooms();
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
	public Clerk_Rooms() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1334, 782);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setLocationRelativeTo(null);

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
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
		btn_Booking.setForeground(new Color(85, 45, 20));
		btn_Booking.setFont(new Font("Corbel Light", Font.BOLD, 25));
		btn_Booking.setBorderPainted(false);
		btn_Booking.setFocusPainted(false);
		btn_Booking.setBackground(new Color(252, 230, 188));
		btn_Booking.setBounds(406, 66, 224, 56);
		panel.add(btn_Booking);
		
		btn_Booking.addActionListener(new ActionListener() {
		    @Override
		    public void actionPerformed(ActionEvent e) {
		        
		        dispose();
		        new Clerk_Booking().setVisible(true);
		    }
		});
		
		JButton btn_Rooms = new JButton("ROOMS");
		btn_Rooms.setForeground(new Color(252, 230, 188));
		btn_Rooms.setFont(new Font("Corbel Light", Font.BOLD, 25));
		btn_Rooms.setBorderPainted(false);
		btn_Rooms.setFocusPainted(false);
		btn_Rooms.setBackground(new Color(139, 76, 33));
		btn_Rooms.setBounds(640, 67, 224, 56);
		panel.add(btn_Rooms);

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
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBorder(new LineBorder(new Color(85, 45, 20), 6));
		panel_1.setBackground(new Color(255, 204, 0));
		panel_1.setBounds(53, 144, 358, 550);
		panel.add(panel_1);
		
		JLabel lbl_Room = new JLabel("Room:");
		lbl_Room.setVerticalAlignment(SwingConstants.TOP);
		lbl_Room.setHorizontalAlignment(SwingConstants.LEFT);
		lbl_Room.setForeground(new Color(85, 45, 20));
		lbl_Room.setFont(new Font("Corbel Light", Font.BOLD, 21));
		lbl_Room.setBounds(40, 45, 111, 22);
		panel_1.add(lbl_Room);
		
		textField_Room = new JTextField();
		textField_Room.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField_Room.setBackground(new Color(252, 230, 188));
		textField_Room.setForeground(new Color(85, 45, 20));
		textField_Room.setBorder(BorderFactory.createLineBorder(new Color(229, 167, 86), 2));
		textField_Room.setBounds(40, 67, 278, 33);
		panel_1.add(textField_Room);
		textField_Room.setColumns(10);
		
		JLabel lbl_RoomStatus = new JLabel("Room Status:");
		lbl_RoomStatus.setVerticalAlignment(SwingConstants.TOP);
		lbl_RoomStatus.setHorizontalAlignment(SwingConstants.LEFT);
		lbl_RoomStatus.setForeground(new Color(85, 45, 20));
		lbl_RoomStatus.setFont(new Font("Corbel Light", Font.BOLD, 21));
		lbl_RoomStatus.setBounds(40, 245, 126, 22);
		panel_1.add(lbl_RoomStatus);
		
		textField_RoomStatus = new JTextField();
		textField_RoomStatus.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField_RoomStatus.setForeground(new Color(85, 45, 20));
		textField_RoomStatus.setColumns(10);
		textField_RoomStatus.setBorder(BorderFactory.createLineBorder(new Color(229, 167, 86), 2));
		textField_RoomStatus.setBackground(new Color(252, 230, 188));
		textField_RoomStatus.setBounds(40, 267, 278, 33);
		panel_1.add(textField_RoomStatus);
		
		JLabel lbl_Type = new JLabel("Type:");
		lbl_Type.setVerticalAlignment(SwingConstants.TOP);
		lbl_Type.setHorizontalAlignment(SwingConstants.LEFT);
		lbl_Type.setForeground(new Color(85, 45, 20));
		lbl_Type.setFont(new Font("Corbel Light", Font.BOLD, 21));
		lbl_Type.setBounds(40, 112, 126, 22);
		panel_1.add(lbl_Type);
		
		textField_Type = new JTextField();
		textField_Type.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField_Type.setBackground(new Color(252, 230, 188));
		textField_Type.setForeground(new Color(85, 45, 20));
		textField_Type.setBorder(BorderFactory.createLineBorder(new Color(229, 167, 86), 2));
		textField_Type.setBounds(40, 134, 278, 33);
		panel_1.add(textField_Type);
		
		JLabel lbl_BookingStatus = new JLabel("Booking Status:");
		lbl_BookingStatus.setVerticalAlignment(SwingConstants.TOP);
		lbl_BookingStatus.setHorizontalAlignment(SwingConstants.LEFT);
		lbl_BookingStatus.setForeground(new Color(85, 45, 20));
		lbl_BookingStatus.setFont(new Font("Corbel Light", Font.BOLD, 21));
		lbl_BookingStatus.setBounds(40, 315, 150, 22);
		panel_1.add(lbl_BookingStatus);
		
		textField_BookingStatus = new JTextField();
		textField_BookingStatus.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField_BookingStatus.setForeground(new Color(85, 45, 20));
		textField_BookingStatus.setBorder(BorderFactory.createLineBorder(new Color(229, 167, 86), 2));
		textField_BookingStatus.setBackground(new Color(252, 230, 188));
		textField_BookingStatus.setBounds(40, 337, 278, 33);
		panel_1.add(textField_BookingStatus);
		
		JLabel lbl_Price = new JLabel("Price:");
		lbl_Price.setVerticalAlignment(SwingConstants.TOP);
		lbl_Price.setHorizontalAlignment(SwingConstants.LEFT);
		lbl_Price.setForeground(new Color(85, 45, 20));
		lbl_Price.setFont(new Font("Corbel Light", Font.BOLD, 21));
		lbl_Price.setBounds(40, 178, 111, 22);
		panel_1.add(lbl_Price);
		
		textField_Price = new JTextField();
		textField_Price.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField_Price.setForeground(new Color(85, 45, 20));
		textField_Price.setBorder(BorderFactory.createLineBorder(new Color(229, 167, 86), 2));
		textField_Price.setBackground(new Color(252, 230, 188));
		textField_Price.setBounds(40, 200, 278, 33);
		panel_1.add(textField_Price);
		
		JButton btn_Update = new JButton("UPDATE");
		btn_Update.setBounds(105, 486, 147, 31);
		panel_1.add(btn_Update);
		btn_Update.setVerticalAlignment(SwingConstants.BOTTOM);
		btn_Update.setFocusPainted(false);
		btn_Update.setFont(new Font("Corbel Light", Font.BOLD, 15));
		btn_Update.setForeground(new Color(242, 209, 146));
		btn_Update.setBackground(new Color(85, 45, 20));
		btn_Update.setBorder(BorderFactory.createLineBorder(new Color(139, 76, 33), 2));
		
		JButton btn_Add = new JButton("ADD");
		btn_Add.setVerticalAlignment(SwingConstants.BOTTOM);
		btn_Add.setFocusPainted(false);
		btn_Add.setForeground(new Color(242, 209, 146));
		btn_Add.setFont(new Font("Corbel Light", Font.BOLD, 15));
		btn_Add.setBorder(BorderFactory.createLineBorder(new Color(139, 76, 33), 2));
		btn_Add.setBackground(new Color(85, 45, 20));
		btn_Add.setBounds(105, 445, 147, 31);
		panel_1.add(btn_Add);
		
		JLabel lbl_Photo = new JLabel("Room Photo:");
		lbl_Photo.setVerticalAlignment(SwingConstants.TOP);
		lbl_Photo.setHorizontalAlignment(SwingConstants.LEFT);
		lbl_Photo.setForeground(new Color(85, 45, 20));
		lbl_Photo.setFont(new Font("Corbel Light", Font.BOLD, 21));
		lbl_Photo.setBounds(40, 380, 150, 22);
		panel_1.add(lbl_Photo);
		
		textField_Photo = new JTextField();
		textField_Photo.setForeground(new Color(85, 45, 20));
		textField_Photo.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField_Photo.setBorder(BorderFactory.createLineBorder(new Color(229, 167, 86), 2));
		textField_Photo.setBackground(new Color(252, 230, 188));
		textField_Photo.setBounds(40, 402, 278, 33);
		panel_1.add(textField_Photo);
		
		
		JComboBox comboBox = new JComboBox();
		comboBox.setForeground(new Color(139, 76, 33));
		comboBox.setFont(new Font("Corbel Light", Font.BOLD, 21));
		((JLabel) comboBox.getRenderer()).setVerticalAlignment(SwingConstants.TOP);
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Sort by ...", "Type", "Room Status", "Booking Status"}));
		comboBox.setBackground(new Color(252, 230, 188));
		comboBox.setBorder(BorderFactory.createLineBorder(new Color(139, 76, 33), 4));
		comboBox.setBounds(436, 142, 270, 39);
		panel.add(comboBox);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(255, 204, 0));
		panel_2.setBorder(new LineBorder(new Color(85, 45, 20), 6));
		panel_2.setBounds(436, 197, 831, 496);
		panel.add(panel_2);
		panel_2.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(20, 21, 790, 457);
		panel_2.add(scrollPane);
		
		table = new JTable();
		table.setBackground(new Color(252, 230, 188));
		table.setForeground(new Color(85, 45, 20));
		table.setFont(new Font("Corbel Light", Font.BOLD, 15));
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, "Delete"},
				{null, null, null, null, null, "Delete"},
				{null, null, null, null, null, "Delete"},
				{null, null, null, null, null, "Delete"},
				{null, null, null, null, null, "Delete"},
			},
			new String[] {
				"Room", "Room Type", "Price", "Room Status", "Booking Status", ""
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
