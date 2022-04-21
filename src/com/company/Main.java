package com.company;

import java.sql.*;
import java.util.Properties;

public class Main {
    public static void main(String args[]) throws SQLException, ClassNotFoundException {
        String user = "postgres";
        String pass = "1dQxvBLTEpKTfgxQGD5FN";
        String url = "jdbc:postgresql://msz-test.chq8qedm9jee.eu-west-1.rds.amazonaws.com/postgres";
        Class.forName("org.postgresql.Driver");
        Properties props = new Properties();
        props.setProperty("user",user);
        props.setProperty("password", pass);
        Connection connection = DriverManager.getConnection(url, props);
        Statement st = connection.createStatement();
        String dropTableSQL = "DROP TABLE IF EXISTS sztudenty";
        st.execute(dropTableSQL);
        String createTableSQL = "CREATE TABLE sztudenty " +
                " (FIRST_NAME VARCHAR(50), " +
                " LAST_NAME VARCHAR(50), " +
                " CLASS_ID VARCHAR(20))";
        st.execute(createTableSQL);
        String insertStmt = "INSERT INTO sztudenty values('mikolaj', 'szypke', 'nałódżydziel')";
        st.execute(insertStmt);
        ResultSet rs = st.executeQuery("select last_name, class_id from sztudenty");
        while (rs.next()) {
            System.out.println(rs.getString("last_name"));
            System.out.println(rs.getString("class_id"));
        }
    }
}
