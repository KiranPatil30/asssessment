package pkg_preparestatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PreparedStatementExample {

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/wipro_java_selenium";
        String username = "root";
        String password = "Ksp@3099";

        String insertSql = "INSERT INTO users (name, email) VALUES (?, ?)";
        String deleteQuery = "DELETE FROM users WHERE name = ?";
        String updateQuery = "UPDATE users SET name = 'Harry' WHERE id = ?";

        try {
            Connection con = DriverManager.getConnection(url, username, password);

            PreparedStatement ps = con.prepareStatement(insertSql);
            ps.setString(1, "adam");
            ps.setString(2, "adam@gmail.com");
            int rowsInserted = ps.executeUpdate();
            System.out.println(rowsInserted + " row(s) inserted.");

            PreparedStatement forDelete = con.prepareStatement(deleteQuery);
            forDelete.setString(1, "Kiran");
            int deleteRow = forDelete.executeUpdate();
            System.out.println("Rows deleted: " + deleteRow);

            PreparedStatement psUpdate = con.prepareStatement(updateQuery);
            psUpdate.setLong(1, 1);
            int updateRow = psUpdate.executeUpdate();
            System.out.println("Rows updated: " + updateRow);

            String selectSQL = "SELECT * FROM users";
            PreparedStatement pst = con.prepareStatement(selectSQL);
            ResultSet rs = pst.executeQuery();

            while (rs.next()) {
                System.out.println(rs.getInt("id") + ", " + rs.getString("name") + ", " + rs.getString("email"));
            }


        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
