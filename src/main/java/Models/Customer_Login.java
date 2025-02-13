package Models;

import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.BorderFactory;
import javax.swing.JButton;

public class Customer_Login extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField_Username;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Customer_Login frame = new Customer_Login();
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
	public Customer_Login() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 699, 527);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setLocationRelativeTo(null);

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lbl_Background = new JLabel("");
		lbl_Background.setIcon(new ImageIcon(Customer_Login.class.getResource("/Resources/CUSTOMER BACKGROUND_Login.png")));
		lbl_Background.setBounds(0, 0, 685, 490);
		contentPane.add(lbl_Background);
		
		JPanel panel = new JPanel();
		panel.setOpaque(false);
		panel.setBackground(new Color( 0, 0, 0, 0));
		panel.setBounds(0, 0, 685, 490);
		lbl_Background.add(panel);
		panel.setLayout(null);
		
		JLabel lbl_Logo_Big = new JLabel("");
		lbl_Logo_Big.setIcon(new ImageIcon(Login.class.getResource("/Resources/GF_BIG_LOGO_NoBR.png")));
		lbl_Logo_Big.setBounds(316, 86, 54, 66);
		panel.add(lbl_Logo_Big);
		
		JLabel lbl_CompanyName = new JLabel("GOLDEN FIELDS HOTEL");
		lbl_CompanyName.setVerticalAlignment(SwingConstants.TOP);
		lbl_CompanyName.setForeground(new Color(85, 45, 20));
		lbl_CompanyName.setFont(new Font("Corbel Light", Font.BOLD, 22));
		lbl_CompanyName.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_CompanyName.setBounds(220, 162, 246, 26);
		panel.add(lbl_CompanyName);
		
		JPanel panel_Line = new JPanel();
		panel_Line.setBackground(new Color(85, 45, 20));
		panel_Line.setBounds(245, 185, 196, 2);
		panel.add(panel_Line);
		
		JLabel lbl_CustomerLogin = new JLabel("CUSTOMER LOGIN");
		lbl_CustomerLogin.setVerticalAlignment(SwingConstants.TOP);
		lbl_CustomerLogin.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_CustomerLogin.setForeground(new Color(85, 45, 20));
		lbl_CustomerLogin.setFont(new Font("Corbel Light", Font.BOLD, 22));
		lbl_CustomerLogin.setBounds(246, 190, 194, 26);
		panel.add(lbl_CustomerLogin);
		
		JLabel lbl_Username = new JLabel("Username:");
		lbl_Username.setVerticalAlignment(SwingConstants.TOP);
		lbl_Username.setHorizontalAlignment(SwingConstants.LEFT);
		lbl_Username.setForeground(new Color(85, 45, 20));
		lbl_Username.setFont(new Font("Corbel Light", Font.BOLD, 16));
		lbl_Username.setBounds(244, 227, 78, 15);
		panel.add(lbl_Username);
		
		textField_Username = new JTextField();
		textField_Username.setBackground(new Color(252, 230, 188));
		textField_Username.setForeground(new Color(85, 45, 20));
		textField_Username.setBorder(BorderFactory.createLineBorder(new Color(229, 167, 86), 2));
		textField_Username.setBounds(245, 243, 194, 23);
		panel.add(textField_Username);
		textField_Username.setColumns(10);
		
		JLabel lbl_Password = new JLabel("Password:");
		lbl_Password.setVerticalAlignment(SwingConstants.TOP);
		lbl_Password.setHorizontalAlignment(SwingConstants.LEFT);
		lbl_Password.setForeground(new Color(85, 45, 20));
		lbl_Password.setFont(new Font("Corbel Light", Font.BOLD, 16));
		lbl_Password.setBounds(245, 271, 78, 15);
		panel.add(lbl_Password);
		
		passwordField = new JPasswordField();
		passwordField.setBackground(new Color(252, 230, 188));
		passwordField.setForeground(new Color(85, 45, 20));
		passwordField.setBorder(BorderFactory.createLineBorder(new Color(229, 167, 86), 2));
		passwordField.setBounds(245, 286, 194, 23);
		panel.add(passwordField);
		
		JButton btn_Login = new JButton("LOG IN");
		btn_Login.setVerticalAlignment(SwingConstants.BOTTOM);
		btn_Login.setFocusPainted(false);
		btn_Login.setFont(new Font("Corbel Light", Font.BOLD, 15));
		btn_Login.setForeground(new Color(242, 209, 146));
		btn_Login.setBackground(new Color(85, 45, 20));
		btn_Login.setBorder(BorderFactory.createLineBorder(new Color(139, 76, 33), 2));
		btn_Login.setBounds(289, 332, 108, 23);
		panel.add(btn_Login);
		
		JButton btn_MakeAnAccount = new JButton("<html><u>Make an account</u></html>");
		btn_MakeAnAccount.setVerticalAlignment(SwingConstants.TOP);
		btn_MakeAnAccount.setFocusPainted(false);
		btn_MakeAnAccount.setForeground(new Color(85, 45, 20));
		btn_MakeAnAccount.setFont(new Font("Corbel Light", Font.BOLD, 10));
		btn_MakeAnAccount.setContentAreaFilled(false);
		btn_MakeAnAccount.setBorderPainted(false);
		btn_MakeAnAccount.setFocusPainted(false);
		btn_MakeAnAccount.setBounds(277, 353, 133, 26);
		panel.add(btn_MakeAnAccount);
	}
}
