package Models;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;

import java.awt.Color;

public class customer_registration extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField_Username;
	private JTextField textField_MiddleIn;
	private JTextField textField_Fname;
	private JTextField textField_Surname;
	private JTextField textField_Email;
	private JTextField textField_PhoneNum;
	private JTextField textField_Password;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					customer_registration frame = new customer_registration();
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
	public customer_registration() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 699, 527);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setLocationRelativeTo(null);

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lbl_Background = new JLabel("");
		lbl_Background.setIcon(new ImageIcon(customer_registration.class.getResource("/Resources/REGISTRATION BACKGROUND.png")));
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
		lbl_Logo_Big.setBounds(191, 97, 54, 66);
		panel.add(lbl_Logo_Big);
		
		JLabel lbl_CompanyName = new JLabel("GOLDEN FIELDS HOTEL");
		lbl_CompanyName.setVerticalAlignment(SwingConstants.TOP);
		lbl_CompanyName.setForeground(new Color(85, 45, 20));
		lbl_CompanyName.setFont(new Font("Corbel Light", Font.BOLD, 22));
		lbl_CompanyName.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_CompanyName.setBounds(248, 107, 246, 26);
		panel.add(lbl_CompanyName);
		
		JPanel panel_Line = new JPanel();
		panel_Line.setBackground(new Color(85, 45, 20));
		panel_Line.setBounds(251, 130, 241, 2);
		panel.add(panel_Line);
		
		JLabel lbl_CstmrRegister = new JLabel("CUSTOMER REGISTRATION");
		lbl_CstmrRegister.setVerticalAlignment(SwingConstants.TOP);
		lbl_CstmrRegister.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_CstmrRegister.setForeground(new Color(85, 45, 20));
		lbl_CstmrRegister.setFont(new Font("Corbel Light", Font.BOLD, 19));
		lbl_CstmrRegister.setBounds(255, 136, 232, 21);
		panel.add(lbl_CstmrRegister);
		
		JLabel lbl_Username = new JLabel("Username:");
		lbl_Username.setVerticalAlignment(SwingConstants.TOP);
		lbl_Username.setHorizontalAlignment(SwingConstants.LEFT);
		lbl_Username.setForeground(new Color(85, 45, 20));
		lbl_Username.setFont(new Font("Corbel Light", Font.BOLD, 16));
		lbl_Username.setBounds(145, 175, 78, 15);
		panel.add(lbl_Username);
		
		textField_Username = new JTextField();
		textField_Username.setBackground(new Color(252, 230, 188));
		textField_Username.setForeground(new Color(85, 45, 20));
		textField_Username.setBorder(BorderFactory.createLineBorder(new Color(229, 167, 86), 2));
		textField_Username.setBounds(145, 191, 194, 23);
		panel.add(textField_Username);
		textField_Username.setColumns(10);
		
		JLabel lbl_Fname = new JLabel("First Name:");
		lbl_Fname.setVerticalAlignment(SwingConstants.TOP);
		lbl_Fname.setHorizontalAlignment(SwingConstants.LEFT);
		lbl_Fname.setForeground(new Color(85, 45, 20));
		lbl_Fname.setFont(new Font("Corbel Light", Font.BOLD, 16));
		lbl_Fname.setBounds(353, 175, 95, 15);
		panel.add(lbl_Fname);
		
		textField_Fname = new JTextField();
		textField_Fname.setForeground(new Color(85, 45, 20));
		textField_Fname.setColumns(10);
		textField_Fname.setBorder(BorderFactory.createLineBorder(new Color(229, 167, 86), 2));
		textField_Fname.setBackground(new Color(252, 230, 188));
		textField_Fname.setBounds(353, 191, 194, 23);
		panel.add(textField_Fname);
		
		JLabel lbl_MiddleIn = new JLabel("Middle Initial:");
		lbl_MiddleIn.setVerticalAlignment(SwingConstants.TOP);
		lbl_MiddleIn.setHorizontalAlignment(SwingConstants.LEFT);
		lbl_MiddleIn.setForeground(new Color(85, 45, 20));
		lbl_MiddleIn.setFont(new Font("Corbel Light", Font.BOLD, 16));
		lbl_MiddleIn.setBounds(145, 219, 108, 15);
		panel.add(lbl_MiddleIn);
		
		textField_MiddleIn = new JTextField();
		textField_MiddleIn.setBackground(new Color(252, 230, 188));
		textField_MiddleIn.setForeground(new Color(85, 45, 20));
		textField_MiddleIn.setBorder(BorderFactory.createLineBorder(new Color(229, 167, 86), 2));
		textField_MiddleIn.setBounds(145, 234, 194, 23);
		panel.add(textField_MiddleIn);
		
		JLabel lbl_Surname = new JLabel("Surname:");
		lbl_Surname.setVerticalAlignment(SwingConstants.TOP);
		lbl_Surname.setHorizontalAlignment(SwingConstants.LEFT);
		lbl_Surname.setForeground(new Color(85, 45, 20));
		lbl_Surname.setFont(new Font("Corbel Light", Font.BOLD, 16));
		lbl_Surname.setBounds(353, 219, 78, 15);
		panel.add(lbl_Surname);
		
		textField_Surname = new JTextField();
		textField_Surname.setForeground(new Color(85, 45, 20));
		textField_Surname.setBorder(BorderFactory.createLineBorder(new Color(229, 167, 86), 2));
		textField_Surname.setBackground(new Color(252, 230, 188));
		textField_Surname.setBounds(353, 234, 194, 23);
		panel.add(textField_Surname);
		
		JLabel lbl_Email = new JLabel("Email:");
		lbl_Email.setVerticalAlignment(SwingConstants.TOP);
		lbl_Email.setHorizontalAlignment(SwingConstants.LEFT);
		lbl_Email.setForeground(new Color(85, 45, 20));
		lbl_Email.setFont(new Font("Corbel Light", Font.BOLD, 16));
		lbl_Email.setBounds(145, 261, 78, 15);
		panel.add(lbl_Email);
		
		textField_Email = new JTextField();
		textField_Email.setForeground(new Color(85, 45, 20));
		textField_Email.setBorder(BorderFactory.createLineBorder(new Color(229, 167, 86), 2));
		textField_Email.setBackground(new Color(252, 230, 188));
		textField_Email.setBounds(145, 276, 194, 23);
		panel.add(textField_Email);
		
		JLabel lbl_PhoneNum = new JLabel("Phone Number:");
		lbl_PhoneNum.setVerticalAlignment(SwingConstants.TOP);
		lbl_PhoneNum.setHorizontalAlignment(SwingConstants.LEFT);
		lbl_PhoneNum.setForeground(new Color(85, 45, 20));
		lbl_PhoneNum.setFont(new Font("Corbel Light", Font.BOLD, 16));
		lbl_PhoneNum.setBounds(353, 261, 120, 15);
		panel.add(lbl_PhoneNum);
		
		textField_PhoneNum = new JTextField();
		textField_PhoneNum.setForeground(new Color(85, 45, 20));
		textField_PhoneNum.setBorder(BorderFactory.createLineBorder(new Color(229, 167, 86), 2));
		textField_PhoneNum.setBackground(new Color(252, 230, 188));
		textField_PhoneNum.setBounds(353, 276, 194, 23);
		panel.add(textField_PhoneNum);
		
		JLabel lbl_Password = new JLabel("Password:");
		lbl_Password.setVerticalAlignment(SwingConstants.TOP);
		lbl_Password.setHorizontalAlignment(SwingConstants.LEFT);
		lbl_Password.setForeground(new Color(85, 45, 20));
		lbl_Password.setFont(new Font("Corbel Light", Font.BOLD, 16));
		lbl_Password.setBounds(244, 304, 120, 15);
		panel.add(lbl_Password);
		
		textField_Password = new JTextField();
		textField_Password.setForeground(new Color(85, 45, 20));
		textField_Password.setBorder(BorderFactory.createLineBorder(new Color(229, 167, 86), 2));
		textField_Password.setBackground(new Color(252, 230, 188));
		textField_Password.setBounds(244, 319, 194, 23);
		panel.add(textField_Password);
		
		JButton btn_Register = new JButton("REGISTER");
		btn_Register.setVerticalAlignment(SwingConstants.BOTTOM);
		btn_Register.setFocusPainted(false);
		btn_Register.setForeground(new Color(242, 209, 146));
		btn_Register.setFont(new Font("Corbel Light", Font.BOLD, 15));
		btn_Register.setBorder(BorderFactory.createLineBorder(new Color(139, 76, 33), 2));
		btn_Register.setBackground(new Color(85, 45, 20));
		btn_Register.setBounds(231, 370, 108, 23);
		panel.add(btn_Register);
		
		JButton btn_Back = new JButton("BACK");
		btn_Back.setVerticalAlignment(SwingConstants.BOTTOM);
		btn_Back.setFocusPainted(false);
		btn_Back.setFont(new Font("Corbel Light", Font.BOLD, 15));
		btn_Back.setForeground(new Color(242, 209, 146));
		btn_Back.setBackground(new Color(85, 45, 20));
		btn_Back.setBorder(BorderFactory.createLineBorder(new Color(139, 76, 33), 2));
		btn_Back.setBounds(346, 370, 108, 23);
		panel.add(btn_Back);
		
		btn_Back.addActionListener(new ActionListener() {
		    @Override
		    public void actionPerformed(ActionEvent e) {
		        
		        dispose();
		        new Customer_Login().setVisible(true);
		    }
		});
		
		
	}
}
