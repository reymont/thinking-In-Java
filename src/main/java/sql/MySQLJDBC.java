package sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class MySQLJDBC {
    private static String dbUrl="jdbc:mysql://localhost:3306/db_book";
    private static String dbUrl1="jdbc:mysql://localhost:3306/db_book?characterEncoding=utf8&useSSL=false";
    private static String dbUrl2="jdbc:mysql://10.244.2.71:8066/JEGO3?useUnicode=true&characterEncoding=UTF-8&&useSSL=false&autoReconnect=true&failOverReadOnly=false&maxReconnects=20";
    private static String dbUserName="jego";
    private static String dbPassword="123456";
    private static String jdbcName = "com.mysql.jdbc.Driver";
    
    public static void main(String[] args) {
        try {
            Class.forName(jdbcName);
            System.out.println("load driver success");
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            System.out.println("load driver fail");
        }
        
        Connection con = null;
        try {
            con = DriverManager.getConnection(dbUrl2, dbUserName, dbPassword);
            System.out.println("connect db success");
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            System.out.println("connect db fail");
        }finally{
            try {
                con.close();
            } catch (SQLException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        
    }
}