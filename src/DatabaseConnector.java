import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnector {
    private static Connection connection;

    private static final String connectionUrl = "jdbc:sqlserver://localhost:1434;databaseName=ZorgConsoleApp;user=sa;password=0992280051;trustServerCertificate=true";

    public static Connection getConnection() throws SQLException {
        if (connection == null || connection.isClosed()) {
            connection = DriverManager.getConnection(connectionUrl);
        }
        return connection;
    }
}
