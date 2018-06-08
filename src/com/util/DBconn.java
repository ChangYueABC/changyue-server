package com.util;

import java.sql.*;

public class DBconn {
	static String url = "jdbc:mysql://localhost:3306/changyue?" + 
						"autoReconnect=true&" + 
						"useSSL=false&" + 
						"serverTimezone=UTC&" +
						"characterEncoding=utf8";
	static String username = "root";
	static String password = "1qaz2wsx";
	static Connection conn = null;
	static ResultSet rs = null;
	static PreparedStatement ps = null;
	
	public static void init(){
		try {
			Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
		} catch (Exception ex) {
			System.out.println("init [SQL驱动程序初始化失败！]");
			ex.printStackTrace();
		}
		
		try{
			conn = DriverManager.getConnection(url, username, password);
		} catch (SQLException ex){
			System.out.println("SQLException:" + ex.getMessage());
			System.out.println("SQLState:" + ex.getSQLState());
			System.out.println("VendorError:" + ex.getErrorCode());
			ex.printStackTrace();
		}
	}
	
	public static int addUpdDel(String sql){
		int i = 0;
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			i = ps.executeUpdate();
		} catch (SQLException e) {
			System.out.println("sql数据库增删改异常");
			e.printStackTrace();
		}
		return i;
	}
	
	public static ResultSet selectSql(String sql){  
        try {  
            ps =  conn.prepareStatement(sql);  
            rs =  ps.executeQuery(sql);  
        } catch (SQLException e) {  
            System.out.println("sql数据库查询异常");  
            e.printStackTrace();  
        }  
        return rs;  
    }  
	
    public static void closeConn(){  
        try {  
            conn.close();  
        } catch (SQLException e) {  
            System.out.println("sql数据库关闭异常");  
            e.printStackTrace();  
        }  
    }  

}
