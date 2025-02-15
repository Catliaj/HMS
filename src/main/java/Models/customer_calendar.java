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
import com.toedter.calendar.JCalendar;
import com.toedter.calendar.JDayChooser;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;


public class customer_calendar extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					customer_calendar frame = new customer_calendar();
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
	public customer_calendar() {
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
		
		JButton btn_Calendar = new JButton("CALENDAR");
		btn_Calendar.setForeground(new Color(229, 167, 86));
		btn_Calendar.setFont(new Font("Corbel Light", Font.BOLD, 25));
		btn_Calendar.setBorderPainted(false);
		btn_Calendar.setFocusPainted(false);
		btn_Calendar.setBackground(new Color(139, 76, 33));
		btn_Calendar.setBounds(406, 67, 224, 56);
		panel.add(btn_Calendar);
		
		JButton btn_History = new JButton("HISTORY");
		btn_History.setForeground(new Color(85, 45, 20));
		btn_History.setFont(new Font("Corbel Light", Font.BOLD, 25));
		btn_History.setBorderPainted(false);
		btn_History.setFocusPainted(false);
		btn_History.setBackground(new Color(229, 167, 86));
		btn_History.setBounds(640, 67, 224, 56);
		panel.add(btn_History);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(242, 209, 146));
		panel_1.setBorder(new LineBorder(new Color(85, 45, 20), 6));
		panel_1.setBounds(47, 170, 900, 547);
		panel.add(panel_1);
		
		// Store booking status (true = booked, false = available)
		HashMap<Date, Boolean> bookingStatus = new HashMap<>();

		// Create a JCalendar instance (Real Calendar)
		JCalendar jCalendar = new JCalendar();
		jCalendar.setBounds(10, 10, panel_1.getWidth() - 20, panel_1.getHeight() - 20); // Fit inside panel_1
		jCalendar.setFont(new Font("Arial", Font.BOLD, 20)); // Increase font size
		panel_1.setLayout(new BorderLayout()); // Ensure proper resizing
		panel_1.add(jCalendar, BorderLayout.CENTER); // Add calendar to fill panel

		// Get the day chooser (where dates are displayed)
		JDayChooser dayChooser = jCalendar.getDayChooser();
		JPanel daysPanel = (JPanel) dayChooser.getDayPanel();

		// Increase button size and detect clicks on dates
		for (Component comp : daysPanel.getComponents()) {
		    if (comp instanceof JButton) {
		        JButton dayButton = (JButton) comp;
		        dayButton.setOpaque(true);
		        dayButton.setFont(new Font("Arial", Font.BOLD, 18)); // Bigger day numbers

		        // Add a click event to mark as booked/unbooked
		        dayButton.addMouseListener(new MouseAdapter() {
		            @Override
		            public void mouseClicked(MouseEvent e) {
		                int day = Integer.parseInt(dayButton.getText());
		                Calendar cal = jCalendar.getCalendar();
		                cal.set(Calendar.DAY_OF_MONTH, day);
		                Date selectedDate = cal.getTime();

		                // Toggle booking status
		                boolean isBooked = bookingStatus.getOrDefault(selectedDate, false);
		                bookingStatus.put(selectedDate, !isBooked);

		                // Change Color (Red = Booked, Green = Available)
		                dayButton.setBackground(!isBooked ? Color.RED : Color.GREEN);
		            }
		        });
		    }
		}

		
	}
	
	private void updateCalendar(JPanel daysPanel, Calendar cal, JLabel monthLabel, HashMap<Date, Boolean> bookingStatus) {
	    daysPanel.removeAll(); // Clear previous view

	    // Set Month & Year Label
	    monthLabel.setText(cal.getDisplayName(Calendar.MONTH, Calendar.LONG, java.util.Locale.ENGLISH) + " " + cal.get(Calendar.YEAR));

	    // Weekday Names
	    String[] daysOfWeek = {"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};
	    for (String day : daysOfWeek) {
	        JLabel label = new JLabel(day, SwingConstants.CENTER);
	        label.setFont(new Font("Arial", Font.BOLD, 16));
	        daysPanel.add(label);
	    }

	    // Get First Day of the Month
	    Calendar firstDay = (Calendar) cal.clone();
	    firstDay.set(Calendar.DAY_OF_MONTH, 1);
	    int startDay = firstDay.get(Calendar.DAY_OF_WEEK) - 1; // Sunday = 1

	    // Get Number of Days in the Month
	    int numDays = cal.getActualMaximum(Calendar.DAY_OF_MONTH);

	    // Fill Empty Spaces Before 1st Day
	    for (int i = 0; i < startDay; i++) {
	        daysPanel.add(new JLabel("")); // Empty placeholders
	    }

	    // Add Days with Booking Status
	    for (int day = 1; day <= numDays; day++) {
	        JButton dayButton = new JButton(String.valueOf(day));
	        dayButton.setFont(new Font("Arial", Font.BOLD, 18));
	        dayButton.setOpaque(true);

	        // Create Date Object for This Day
	        Calendar dayCal = (Calendar) cal.clone();
	        dayCal.set(Calendar.DAY_OF_MONTH, day);
	        Date selectedDate = dayCal.getTime();

	        // Set Initial Color (Green = Available, Red = Booked)
	        boolean isBooked = bookingStatus.getOrDefault(selectedDate, false);
	        dayButton.setBackground(isBooked ? Color.RED : Color.GREEN);

	        // Handle Click to Toggle Booking
	        dayButton.addActionListener(e -> {
	            boolean newStatus = !bookingStatus.getOrDefault(selectedDate, false);
	            bookingStatus.put(selectedDate, newStatus);
	            dayButton.setBackground(newStatus ? Color.RED : Color.GREEN);
	        });

	        daysPanel.add(dayButton);
	    }

	    // Refresh UI
	    daysPanel.revalidate();
	    daysPanel.repaint();
	}

	}



