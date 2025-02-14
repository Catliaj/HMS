package Models;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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


public class Clerk_Login extends JFrame {

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
					Clerk_Login frame = new Clerk_Login();
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
	public Clerk_Login() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 699, 527);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setLocationRelativeTo(null);

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lbl_Background = new JLabel("");
		lbl_Background.setIcon(new ImageIcon(Clerk_Login.class.getResource("/Resources/CLERK BACKGROUND_Login.png")));
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
		
		JLabel lbl_ClerkLogin = new JLabel("CLERK LOGIN");
		lbl_ClerkLogin.setVerticalAlignment(SwingConstants.TOP);
		lbl_ClerkLogin.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_ClerkLogin.setForeground(new Color(85, 45, 20));
		lbl_ClerkLogin.setFont(new Font("Corbel Light", Font.BOLD, 22));
		lbl_ClerkLogin.setBounds(246, 190, 194, 26);
		panel.add(lbl_ClerkLogin);
		
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
		btn_Login.setBounds(289, 322, 108, 23);
		panel.add(btn_Login);
		
		btn_Login.addActionListener(new ActionListener() {
		    @Override
		    public void actionPerformed(ActionEvent e) {
		        
		        dispose();
		        new Clerk_Dashboard().setVisible(true);
		    }
		});
		
		JButton btn_Back = new JButton("BACK");
		btn_Back.setVerticalAlignment(SwingConstants.BOTTOM);
		btn_Back.setForeground(new Color(242, 209, 146));
		btn_Back.setFont(new Font("Corbel Light", Font.BOLD, 15));
		btn_Back.setFocusPainted(false);
		btn_Back.setBorder(BorderFactory.createLineBorder(new Color(139, 76, 33), 2));
		btn_Back.setBackground(new Color(85, 45, 20));
		btn_Back.setBounds(289, 350, 108, 23);
		panel.add(btn_Back);
		
		btn_Back.addActionListener(new ActionListener() {
		    @Override
		    public void actionPerformed(ActionEvent e) {
		        
		        dispose();
		        new Login().setVisible(true);
		    }
		});
	}
}
