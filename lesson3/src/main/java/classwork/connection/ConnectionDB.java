package classwork.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionDB {

    private static final String POSTGRESQL_URL = "jdbc:mysql://db4free.net/course_qwq09721";
    private static final String USERNAME = "qwq09721";
    private static final String PASSWORD = "qwq09721@sqoai.com";
    private static final String POSTGRESQL_DRIVER = "com.mysql.jdbc.Driver";

    private ConnectionDB() {
    }

    public Connection getConnection() {
        Connection connection = null;
        try {
            Class.forName(POSTGRESQL_DRIVER);
            connection = DriverManager.getConnection(POSTGRESQL_URL, USERNAME, PASSWORD);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }

    /**
     * The inner class for implementation singleton.
     */
    private static class Holder {
        private final static ConnectionDB INSTANCE = new ConnectionDB();
    }

    /**
     * The method gives ConnectionDB singleton instance.
     */
    public static ConnectionDB getInstance() {
        return Holder.INSTANCE;
    }
}
