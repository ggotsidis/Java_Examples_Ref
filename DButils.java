package referenceAll;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DButils {
     
    private static final String URL = "jdbc:mysql://localhost/java_db?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
    private static final String USER = "root";
    private static final String PASSWORD = "";
     
    public static Connection getConnection() throws SQLException{
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
 
}