package Models;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.BevelBorder;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import com.toedter.calendar.JDateChooser;

public class double_bedroom extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField_15;
	private JTextField textField_16;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					double_bedroom frame = new double_bedroom();
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
	public double_bedroom() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1334, 782);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setLocationRelativeTo(null);

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lbl_Background = new JLabel("");
		lbl_Background.setIcon(new ImageIcon(customer_booking.class.getResource("/Resources/customer_bckg.png")));
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
		lbl_Greetings.setFont(new Font("Dubai", Font.BOLD, 34));
		lbl_Greetings.setBounds(173, 14, 566, 39);
		panel.add(lbl_Greetings);
		
		JLabel lbl_CustomerName = new JLabel("First Name*");
		lbl_CustomerName.setVerticalAlignment(SwingConstants.TOP);
		lbl_CustomerName.setHorizontalAlignment(SwingConstants.LEFT);
		lbl_CustomerName.setForeground(new Color(85, 45, 20));
		lbl_CustomerName.setFont(new Font("Dubai", Font.BOLD, 34));
		lbl_CustomerName.setBounds(620, 14, 195, 39);
		panel.add(lbl_CustomerName);
		
		JPanel panel_Line = new JPanel();
		panel_Line.setBackground(new Color(85, 45, 20));
		panel_Line.setBounds(172, 58, 692, 2);
		panel.add(panel_Line);
		
		JButton btn_Booking = new JButton("BOOKING");
		btn_Booking.setForeground(new Color(229, 167, 86));
		btn_Booking.setFont(new Font("Corbel Light", Font.BOLD, 25));
		btn_Booking.setBackground(new Color(139, 76, 33));
		btn_Booking.setBorderPainted(false);
		btn_Booking.setFocusPainted(false);
		btn_Booking.setBounds(172, 67, 224, 56);
		panel.add(btn_Booking);
		
		JButton btn_History = new JButton("HISTORY");
		btn_History.setForeground(new Color(85, 45, 20));
		btn_History.setFont(new Font("Corbel Light", Font.BOLD, 25));
		btn_History.setBorderPainted(false);
		btn_History.setFocusPainted(false);
		btn_History.setBackground(new Color(229, 167, 86));
		btn_History.setBounds(415, 66, 224, 56);
		panel.add(btn_History);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_1.setBackground(new Color(242, 209, 146));
		panel_1.setBounds(44, 163, 210, 66);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JButton btnNewButton = new JButton("SINGLE BED ROOM");
		btnNewButton.setBackground(new Color(229, 167, 86));
		btnNewButton.setFont(new Font("Dubai", Font.BOLD, 15));
		btnNewButton.setBounds(10, 10, 190, 46);
		panel_1.add(btnNewButton);
		
		JPanel panel_1_3_1 = new JPanel();
		panel_1_3_1.setBorder(new LineBorder(new Color(139, 76, 33), 7));
		panel_1_3_1.setBackground(new Color(242, 209, 146));
		panel_1_3_1.setBounds(956, 142, 343, 593);
		panel.add(panel_1_3_1);
		panel_1_3_1.setLayout(null);
		
		JLabel lblToBook = new JLabel("TO BOOK");
		lblToBook.setFont(new Font("Dubai", Font.BOLD, 20));
		lblToBook.setBounds(10, 10, 153, 40);
		panel_1_3_1.add(lblToBook);
		
		JLabel lblNewLabel_4 = new JLabel("ROOM:");
		lblNewLabel_4.setFont(new Font("Dubai", Font.BOLD, 20));
		lblNewLabel_4.setBounds(36, 60, 81, 40);
		panel_1_3_1.add(lblNewLabel_4);
		
		JLabel lblType = new JLabel("TYPE:");
		lblType.setFont(new Font("Dubai", Font.BOLD, 20));
		lblType.setBounds(36, 115, 81, 40);
		panel_1_3_1.add(lblType);
		
		JLabel lblPrice_2 = new JLabel("PRICE:");
		lblPrice_2.setFont(new Font("Dubai", Font.BOLD, 20));
		lblPrice_2.setBounds(36, 172, 81, 40);
		panel_1_3_1.add(lblPrice_2);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(137, 173, 86, 40);
		panel_1_3_1.add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(127, 118, 96, 40);
		panel_1_3_1.add(textField_7);
		
		JLabel lblNewLabel_2_2 = new JLabel("per night");
		lblNewLabel_2_2.setFont(new Font("Dubai", Font.BOLD, 20));
		lblNewLabel_2_2.setBounds(233, 179, 120, 27);
		panel_1_3_1.add(lblNewLabel_2_2);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(126, 63, 96, 40);
		panel_1_3_1.add(textField_8);
		
		JLabel lblNewLabel_2_2_1 = new JLabel("P");
		lblNewLabel_2_2_1.setFont(new Font("Dubai", Font.BOLD, 20));
		lblNewLabel_2_2_1.setBounds(113, 179, 120, 27);
		panel_1_3_1.add(lblNewLabel_2_2_1);
		
		JLabel lblStatus_2 = new JLabel("STATUS:");
		lblStatus_2.setFont(new Font("Dubai", Font.BOLD, 20));
		lblStatus_2.setBounds(36, 230, 81, 40);
		panel_1_3_1.add(lblStatus_2);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(127, 230, 173, 40);
		panel_1_3_1.add(textField_9);
		
		JLabel lblStatus_2_1 = new JLabel("CHECK-IN DATE:");
		lblStatus_2_1.setFont(new Font("Dubai", Font.BOLD, 20));
		lblStatus_2_1.setBounds(36, 294, 197, 40);
		panel_1_3_1.add(lblStatus_2_1);
		
		JDateChooser dateChooser = new JDateChooser();
		dateChooser.setBounds(46, 333, 215, 32);
		panel_1_3_1.add(dateChooser);
		
		JLabel lblStatus_2_1_1 = new JLabel("CHECK-OUT DATE:");
		lblStatus_2_1_1.setFont(new Font("Dubai", Font.BOLD, 20));
		lblStatus_2_1_1.setBounds(36, 364, 197, 40);
		panel_1_3_1.add(lblStatus_2_1_1);
		
		JDateChooser dateChooser_1 = new JDateChooser();
		dateChooser_1.setBounds(46, 403, 215, 32);
		panel_1_3_1.add(dateChooser_1);
		
		JLabel lblStatus_2_2 = new JLabel("COST:");
		lblStatus_2_2.setFont(new Font("Dubai", Font.BOLD, 20));
		lblStatus_2_2.setBounds(21, 454, 81, 40);
		panel_1_3_1.add(lblStatus_2_2);
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		textField_10.setBounds(112, 454, 173, 40);
		panel_1_3_1.add(textField_10);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBackground(new Color(135, 94, 31));
		panel_6.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_6.setBounds(95, 516, 154, 56);
		panel_1_3_1.add(panel_6);
		panel_6.setLayout(null);
		
		JButton btnNewButton_1 = new JButton("BOOK");
		btnNewButton_1.setBackground(new Color(245, 227, 192));
		btnNewButton_1.setForeground(new Color(0, 0, 0));
		btnNewButton_1.setFont(new Font("Dubai", Font.BOLD, 20));
		btnNewButton_1.setBounds(10, 10, 134, 36);
		panel_6.add(btnNewButton_1);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_1_1.setLayout(null);
		panel_1_1.setBackground(new Color(242, 209, 146));
		panel_1_1.setBounds(275, 163, 210, 66);
		panel.add(panel_1_1);
		
		JButton btnDoubleBedRoom = new JButton("DOUBLE BED ROOM");
		btnDoubleBedRoom.setBackground(new Color(229, 167, 86));
		btnDoubleBedRoom.setFont(new Font("Dubai", Font.BOLD, 15));
		btnDoubleBedRoom.setBounds(10, 10, 190, 46);
		panel_1_1.add(btnDoubleBedRoom);
		
		JPanel panel_1_1_1 = new JPanel();
		panel_1_1_1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_1_1_1.setLayout(null);
		panel_1_1_1.setBackground(new Color(242, 209, 146));
		panel_1_1_1.setBounds(507, 163, 210, 66);
		panel.add(panel_1_1_1);
		
		JButton btnNewButton_1_1 = new JButton("PREMIUM SUITE");
		btnNewButton_1_1.setBackground(new Color(229, 167, 86));
		btnNewButton_1_1.setFont(new Font("Dubai", Font.BOLD, 15));
		btnNewButton_1_1.setBounds(10, 10, 190, 46);
		panel_1_1_1.add(btnNewButton_1_1);
		
		JPanel panel_1_1_1_1 = new JPanel();
		panel_1_1_1_1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_1_1_1_1.setLayout(null);
		panel_1_1_1_1.setBackground(new Color(242, 209, 146));
		panel_1_1_1_1.setBounds(735, 163, 210, 66);
		panel.add(panel_1_1_1_1);
		
		JButton btnNewButton_1_1_1 = new JButton("DELUXE PENTHOUSE");
		btnNewButton_1_1_1.setBackground(new Color(229, 167, 86));
		btnNewButton_1_1_1.setFont(new Font("Dubai", Font.BOLD, 15));
		btnNewButton_1_1_1.setBounds(10, 10, 190, 46);
		panel_1_1_1_1.add(btnNewButton_1_1_1);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(48, 239, 897, 463);
		panel.add(scrollPane);
		
		JPanel panel_3 = new JPanel();
		panel_3.setLayout(null);
		panel_3.setBorder(new LineBorder(new Color(135, 94, 31), 5));
		panel_3.setBackground(new Color(242, 209, 146));
		scrollPane.setViewportView(panel_3);
		
		JPanel panel_4 = new JPanel();
		panel_4.setLayout(null);
		panel_4.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_4.setBackground(new Color(245, 227, 192));
		panel_4.setBounds(18, 10, 857, 211);
		panel_3.add(panel_4);
		
		JPanel panel_5 = new JPanel();
		panel_5.setLayout(null);
		panel_5.setBorder(new LineBorder(new Color(135, 94, 31), 5));
		panel_5.setBackground(new Color(228, 185, 103));
		panel_5.setBounds(272, 10, 575, 191);
		panel_4.add(panel_5);
		
		JLabel lblNewLabel_4_1 = new JLabel("ROOM:");
		lblNewLabel_4_1.setFont(new Font("Dubai", Font.BOLD, 20));
		lblNewLabel_4_1.setBounds(24, 10, 81, 40);
		panel_5.add(lblNewLabel_4_1);
		
		textField_11 = new JTextField();
		textField_11.setColumns(10);
		textField_11.setBounds(114, 13, 96, 40);
		panel_5.add(textField_11);
		
		JLabel lblStatus = new JLabel("STATUS:");
		lblStatus.setFont(new Font("Dubai", Font.BOLD, 20));
		lblStatus.setBounds(24, 125, 81, 40);
		panel_5.add(lblStatus);
		
		textField_12 = new JTextField();
		textField_12.setColumns(10);
		textField_12.setBounds(115, 125, 226, 40);
		panel_5.add(textField_12);
		
		JLabel lblPrice_2_1 = new JLabel("PRICE:");
		lblPrice_2_1.setFont(new Font("Dubai", Font.BOLD, 20));
		lblPrice_2_1.setBounds(24, 70, 81, 40);
		panel_5.add(lblPrice_2_1);
		
		JLabel lblNewLabel_2_2_1_1 = new JLabel("P");
		lblNewLabel_2_2_1_1.setFont(new Font("Dubai", Font.BOLD, 20));
		lblNewLabel_2_2_1_1.setBounds(101, 75, 120, 27);
		panel_5.add(lblNewLabel_2_2_1_1);
		
		textField_13 = new JTextField();
		textField_13.setColumns(10);
		textField_13.setBounds(125, 70, 86, 40);
		panel_5.add(textField_13);
		
		JLabel lblNewLabel_2_2_2 = new JLabel("per night");
		lblNewLabel_2_2_2.setFont(new Font("Dubai", Font.BOLD, 20));
		lblNewLabel_2_2_2.setBounds(221, 75, 120, 27);
		panel_5.add(lblNewLabel_2_2_2);
		
		JButton btn_select = new JButton("SELECT");
		btn_select.setForeground(new Color(242, 209, 146));
		btn_select.setFont(new Font("Dubai", Font.BOLD, 15));
		btn_select.setBackground(new Color(135, 94, 31));
		btn_select.setBounds(480, 10, 85, 171);
		panel_5.add(btn_select);
		
		JPanel panel_7 = new JPanel();
		panel_7.setBackground(new Color(228, 185, 103));
		panel_7.setLayout(null);
		panel_7.setBorder(new LineBorder(new Color(135, 94, 31), 5));
		panel_7.setBounds(10, 10, 252, 191);
		panel_4.add(panel_7);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(double_bedroom.class.getResource("/Resources/DB1.png")));
		lblNewLabel.setBounds(10, 10, 230, 171);
		panel_7.add(lblNewLabel);
		
		JPanel panel_4_1 = new JPanel();
		panel_4_1.setLayout(null);
		panel_4_1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_4_1.setBackground(new Color(245, 227, 192));
		panel_4_1.setBounds(18, 231, 857, 211);
		panel_3.add(panel_4_1);
		
		JPanel panel_5_1 = new JPanel();
		panel_5_1.setLayout(null);
		panel_5_1.setBorder(new LineBorder(new Color(135, 94, 31), 5));
		panel_5_1.setBackground(new Color(228, 185, 103));
		panel_5_1.setBounds(272, 10, 575, 191);
		panel_4_1.add(panel_5_1);
		
		JLabel lblNewLabel_4_1_1 = new JLabel("ROOM:");
		lblNewLabel_4_1_1.setFont(new Font("Dubai", Font.BOLD, 20));
		lblNewLabel_4_1_1.setBounds(24, 10, 81, 40);
		panel_5_1.add(lblNewLabel_4_1_1);
		
		textField_14 = new JTextField();
		textField_14.setColumns(10);
		textField_14.setBounds(114, 13, 96, 40);
		panel_5_1.add(textField_14);
		
		JLabel lblStatus_1 = new JLabel("STATUS:");
		lblStatus_1.setFont(new Font("Dubai", Font.BOLD, 20));
		lblStatus_1.setBounds(24, 125, 81, 40);
		panel_5_1.add(lblStatus_1);
		
		textField_15 = new JTextField();
		textField_15.setColumns(10);
		textField_15.setBounds(115, 125, 226, 40);
		panel_5_1.add(textField_15);
		
		JLabel lblPrice_2_1_1 = new JLabel("PRICE:");
		lblPrice_2_1_1.setFont(new Font("Dubai", Font.BOLD, 20));
		lblPrice_2_1_1.setBounds(24, 70, 81, 40);
		panel_5_1.add(lblPrice_2_1_1);
		
		JLabel lblNewLabel_2_2_1_1_1 = new JLabel("P");
		lblNewLabel_2_2_1_1_1.setFont(new Font("Dubai", Font.BOLD, 20));
		lblNewLabel_2_2_1_1_1.setBounds(101, 75, 120, 27);
		panel_5_1.add(lblNewLabel_2_2_1_1_1);
		
		textField_16 = new JTextField();
		textField_16.setColumns(10);
		textField_16.setBounds(125, 70, 86, 40);
		panel_5_1.add(textField_16);
		
		JLabel lblNewLabel_2_2_2_1 = new JLabel("per night");
		lblNewLabel_2_2_2_1.setFont(new Font("Dubai", Font.BOLD, 20));
		lblNewLabel_2_2_2_1.setBounds(221, 75, 120, 27);
		panel_5_1.add(lblNewLabel_2_2_2_1);
		
		JButton btn_select_1 = new JButton("SELECT");
		btn_select_1.setForeground(new Color(242, 209, 146));
		btn_select_1.setFont(new Font("Dubai", Font.BOLD, 15));
		btn_select_1.setBackground(new Color(135, 94, 31));
		btn_select_1.setBounds(480, 10, 85, 171);
		panel_5_1.add(btn_select_1);
		
		JPanel panel_7_1 = new JPanel();
		panel_7_1.setLayout(null);
		panel_7_1.setBorder(new LineBorder(new Color(135, 94, 31), 5));
		panel_7_1.setBackground(new Color(228, 185, 103));
		panel_7_1.setBounds(10, 10, 252, 191);
		panel_4_1.add(panel_7_1);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(double_bedroom.class.getResource("/Resources/DB2.png")));
		lblNewLabel_1.setBounds(10, 10, 230, 171);
		panel_7_1.add(lblNewLabel_1);
		

		

		

}
	}