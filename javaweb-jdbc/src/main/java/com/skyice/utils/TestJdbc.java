package com.skyice.utils;

import java.sql.*;

public class TestJdbc {
    //psvm快速创建
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
//        配置信息
        String url = "jdbc:mysql://localhost:3306/jdbc?useUnicode=true$characterEncoding=utf-8";
        String username = "root";
        String password = "";
//        1. 加载驱动 反射机制
        Class.forName("com.mysql.cj.jdbc.Driver");
//        2.链接数据库
        Connection connection = DriverManager.getConnection(url,username,password);
//        3.向数据库发送sql对象statement
        Statement statement = connection.createStatement();
//        4.编写sql
        String sql = "select * from users";
//        5.执行sql 利用第三步创建的statement对象执行sql
        ResultSet rs = statement.executeQuery(sql);

        while (rs.next()){
            System.out.println("id=" + rs.getObject("id"));
            System.out.println("name=" + rs.getObject("name"));
            System.out.println("password=" + rs.getObject("password"));
            System.out.println("email=" + rs.getObject("email"));
            System.out.println("birthday=" + rs.getObject("birthday")+"\n");
        }
//        6.关闭链接 顺序 和创建相反
        rs.close();
        statement.close();
        connection.close();
    }
}
