package Models;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;

public class Login extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
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
	public Login() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 699, 527);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setLocationRelativeTo(null);

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lbl_Background = new JLabel("");
		lbl_Background.setIcon(new ImageIcon(Login.class.getResource("/Resources/LOGIN MENU BACKGROUND.png")));
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
		lbl_Logo_Big.setBounds(316, 57, 54, 66);
		panel.add(lbl_Logo_Big);
		
		JLabel lbl_CompanyName = new JLabel("GOLDEN FIELDS HOTEL");
		lbl_CompanyName.setVerticalAlignment(SwingConstants.TOP);
		lbl_CompanyName.setForeground(new Color(85, 45, 20));
		lbl_CompanyName.setFont(new Font("Corbel Light", Font.BOLD, 22));
		lbl_CompanyName.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_CompanyName.setBounds(220, 133, 246, 26);
		panel.add(lbl_CompanyName);
		
		JButton btn_Clerk_1 = new JButton("");
		btn_Clerk_1.setIcon(new ImageIcon(Login.class.getResource("/Resources/Clerk_Ico_NoBR.png")));
		btn_Clerk_1.setFocusPainted(false);
		btn_Clerk_1.setContentAreaFilled(false);
		btn_Clerk_1.setBorderPainted(false);
		btn_Clerk_1.setBounds(224, 203, 91, 95);
		panel.add(btn_Clerk_1);
		
		JLabel lbl_Clerk = new JLabel("CLERK");
		lbl_Clerk.setVerticalAlignment(SwingConstants.TOP);
		lbl_Clerk.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_Clerk.setForeground(new Color(85, 45, 20));
		lbl_Clerk.setFont(new Font("Corbel Light", Font.BOLD, 22));
		lbl_Clerk.setBounds(224, 341, 84, 26);
		panel.add(lbl_Clerk);
		
		JButton btn_Clerk = new JButton("");
		btn_Clerk.setIcon(new ImageIcon(Login.class.getResource("/Resources/Customer_Icon_NoBR.png")));
		btn_Clerk.setContentAreaFilled(false);
		btn_Clerk.setBorderPainted(false);
		btn_Clerk.setFocusPainted(false);
		btn_Clerk.setBounds(385, 206, 65, 88);
		panel.add(btn_Clerk);
		
		JLabel lbl_Customer = new JLabel("CUSTOMER");
		lbl_Customer.setVerticalAlignment(SwingConstants.TOP);
		lbl_Customer.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_Customer.setForeground(new Color(85, 45, 20));
		lbl_Customer.setFont(new Font("Corbel Light", Font.BOLD, 22));
		lbl_Customer.setBounds(358, 341, 119, 26);
		panel.add(lbl_Customer);
	}
}
