package io.yovelas.db.util;

import java.io.FileInputStream;
import java.sql.*;
import java.util.Properties;

/**
 * @Classname JdbcUtil
 * @Description JDBC连接工具类
 * @Date 2019/7/28 13:08
 * @Created by dykewer
 */

public class JdbcUtil {
    public static Connection getConnection() {
        Properties pr = new Properties();
        Connection conn = null;
        try {

            pr.load(new FileInputStream("src/main/resources/jdbc.properties"));
            Class.forName(pr.getProperty("Driver"));
            conn = DriverManager.getConnection(pr.getProperty("url"),pr.getProperty("user"),pr.getProperty("password"));
            return conn;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void executeSql(String sql) {
        try {
            Statement stmt = getConnection().createStatement();
            stmt.execute(sql);
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public static ResultSet executeQuerySql(String sql) {
        try {
            Statement stmt = getConnection().createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            return rs;
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }finally {

        }
        return null;
    }

    public static void close(Connection conn,Statement stmt) {
        try {
            if(stmt != null)
                stmt.close();
            if(conn != null)
                conn.close();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public static void close(Connection conn,Statement stmt,ResultSet rs) {

        try {
            if(rs != null)
                rs.close();

        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        close(conn,stmt);
    }

    public static void main(String[] args) {

//		executeSql("create table demo_table1(aa int,bb int)");
        ResultSet rs = executeQuerySql("select * from ims_cmf_hook");
        try {
            while(rs.next()) {
                System.out.print(rs.getInt(1)+":");
                System.out.print(rs.getInt(2)+":");
                System.out.print(rs.getInt(3)+"\n");
            }
//		executeSql("delete from demo_table where a=1");

        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }


}
