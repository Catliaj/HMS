package Modules;

import java.sql.*;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class ClerkBooking_Backend {

    private DB_Connections dbConnection;

    public ClerkBooking_Backend() {
        dbConnection = DB_Connections.getDBConnection();
    }

    public void populateBookingTable(JTable table) {
        String query = "SELECT b.booking_id, u.first_name, u.surname, r.room_type, " +
                       "b.check_in_date, b.check_out_date, b.status " +
                       "FROM booking b " +
                       "JOIN users u ON b.user_id = u.user_id " +
                       "JOIN rooms r ON b.room_id = r.room_id" + 
                       "ORDER BY b.booking_id ASC";

        try (Connection con = dbConnection.getConnection();
             PreparedStatement pst = con.prepareStatement(query);
             ResultSet rs = pst.executeQuery()) {

            DefaultTableModel model = (DefaultTableModel) table.getModel();
            model.setRowCount(0); // Clear existing data

            while (rs.next()) {
                model.addRow(new Object[]{
                    rs.getInt("booking_id"),
                    rs.getString("first_name") + " " + rs.getString("surname"),
                    rs.getString("room_type"),
                    rs.getDate("check_in_date"),
                    rs.getDate("check_out_date"),
                    rs.getString("status")
                });
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
