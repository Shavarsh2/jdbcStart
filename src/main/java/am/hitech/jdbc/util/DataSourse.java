package am.hitech.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataSourse {
    private static Connection connection;
    private static final String url = "jdbc:mysql://localhost:3306/group1";
    private static final String username = "root";
    private static final String password = "";

    public static Connection getConnection(){
        try {
            if(connection == null || connection.isClosed()){
                Class clazz = Class.forName("com.mysql.cj.jdbc.Driver");
                connection = DriverManager.getConnection(url,username,password);
            }
            return connection;
        } catch (SQLException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
