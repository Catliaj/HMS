package Modules;

import java.sql.*;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class ClerkCustomers_Backend {

    private DB_Connections dbConnection;

    public ClerkCustomers_Backend() {
        dbConnection = DB_Connections.getDBConnection();
    }

    public void populateCustomersTable(JTable table) {
        String query = "SELECT u.first_name, u.middle_initial, u.surname, u.email, u.phone_number " +
                       "FROM users u " +
                       "JOIN booking b ON u.user_id = b.user_id " +
                       "ORDER BY b.check_in_date ASC"; // Sorting by check-in date

        try (Connection con = dbConnection.getConnection();
             PreparedStatement pst = con.prepareStatement(query);
             ResultSet rs = pst.executeQuery()) {

            DefaultTableModel model = (DefaultTableModel) table.getModel();
            model.setRowCount(0); 

            while (rs.next()) {
                model.addRow(new Object[]{
                    rs.getString("first_name"),
                    rs.getString("middle_initial"),
                    rs.getString("surname"),
                    rs.getString("email"),
                    rs.getString("phone_number"),
                    "Delete" // Button Placeholder
                });
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
