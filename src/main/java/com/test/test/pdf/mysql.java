/*
package com.test.test.pdf;

import java.sql.*;

public class mysql {
    Connection conn = null;
    Statement stmt = null;
    ResultSet rs = null;

    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://best54.cafe24.com/best54?useSSL=false";
    static final String USERNAME = "best54";
    static final String PASSWORD = "medi1607!";

public String select(String sql, String colum) {
    String sqlRecipeProcess=null;
    try {

        Class.forName(JDBC_DRIVER);
        conn = DriverManager.getConnection(DB_URL,USERNAME,PASSWORD);

        if (conn != null){System.out.println("성공");}
        else{System.out.println("실패");}

       // sql = "select * FROM table;";

         rs = stmt.executeQuery(sql);

        while (rs.next()) {
          sqlRecipeProcess = rs.getString(colum);
        }

        rs.close();
        stmt.close();
        conn.close();


    } catch (ClassNotFoundException e) {
        System.out.println("Class Not Found Exection");
        e.printStackTrace();
    } catch (SQLException e) {
        System.out.println("SQL Exception : " + e.getMessage());
        e.printStackTrace();
    }
    return sqlRecipeProcess;
}
}*/
