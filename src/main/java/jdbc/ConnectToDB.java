package jdbc;

import java.sql.*;

import static org.junit.Assert.assertEquals;

public class ConnectToDB {

    public static void main(String[] args) throws Exception {
        // Object of Connection from the Database
        Connection conn = null;

        // Object of Statement. It is used to create a Statement to execute the query
        Statement stmt = null;

        //Object of ResultSet => 'It maintains a cursor that points to the current row in the result set'
        ResultSet resultSet = null;
        //Class.forName("com.mysql.jdbc.Driver");
        conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/world", "root", "root");

        // Execute a query
        stmt = conn.createStatement();
        resultSet = stmt.executeQuery("select * from city where CountryCode='AFG';");
       // ResultSetMetaData resultSetMetaData= resultSet.getMetaData();
        while (resultSet.next()) {
            System.out.println(resultSet.getString(1) + "  " +
                    resultSet.getString(2) + "  " +
                    resultSet.getString(3) + "  "
                    + resultSet.getString(4) + "  "
                    + resultSet.getString(5));
            if(resultSet.isLast()){
                assertEquals("check",resultSet.getString(5),Integer.toString(127800));
            }
        }

        if (resultSet != null) {
            try {
                resultSet.close();
            } catch (Exception e) {
            }
        }

        if (stmt != null) {
            try {
                stmt.close();
            } catch (Exception e) {
            }
        }
    }
}
