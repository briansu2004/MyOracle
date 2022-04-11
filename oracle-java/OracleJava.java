import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/*
javac OracleJava.java
java -cp ".;..\..\MyJava\OracleJDBC\ojdbc\ojdbc8.jar" OracleJava
*/
public class OracleJava {
    public static void main(String[] args) {
        try {
            Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "admin");
            if (conn != null) {
                System.out.println("Connected to the Oracle!");
            } else {
                System.out.println("Failed to connect Oracle!");
            }

            PreparedStatement stmt = conn.prepareStatement("SELECT 'Hello World!' FROM dual");
            ResultSet rslt = stmt.executeQuery();
            while (rslt.next()) {
                System.out.println(rslt.getString(1));
            }
        } catch (SQLException e) {
            System.err.format("SQL State: %s\n%s", e.getSQLState(), e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}