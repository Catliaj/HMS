package Modules;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class ClerkRooms_Backend {
	private DB_Connections dbConnection;

    public ClerkRooms_Backend() {
        dbConnection = DB_Connections.getDBConnection();
    }

    public void populateRoomsTable(JTable table) {
        String query = "SELECT " +
                "room_id, room_type, price, " +
                "b.check_in_date, b.check_out_date, status " +
                "FROM booking b " +
                "JOIN rooms r ON b.room_id = r.room_id " +
                "JOIN users u ON b.user_id = u.user_id";

        try (Connection con = dbConnection.getConnection();
             PreparedStatement pst = con.prepareStatement(query);
             ResultSet rs = pst.executeQuery()) {

            DefaultTableModel model = (DefaultTableModel) table.getModel();
            model.setRowCount(0); 

            while (rs.next()) {
                model.addRow(new Object[]{
                    rs.getString("first_name") + " " + rs.getString("surname"),
                    rs.getInt("room_id"),
                    rs.getString("room_type"),
                    rs.getDouble("price"),
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
