package com.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.entity.Test;
import com.util.DBconn;

public class TestDaoImpl implements TestDao {

	@Override
	public boolean login(String id, String name) {
		// TODO Auto-generated method stub
		boolean flag = false;
		String sqlstr = "select * from test where id='" + id + "' and name='" + name + "'";
		System.out.println(sqlstr);
		try {
			DBconn.init();
			ResultSet rs = DBconn.selectSql(sqlstr);
			while(rs.next()){
				if(rs.getString("id").equals(id) && rs.getString("name").equals(name)){
					flag = true;
				}
			}
			DBconn.closeConn();
		} catch (SQLException ex){
			ex.printStackTrace();
		}
		return flag;
	}

/*	@Override
	public boolean register(Test user) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Test> getUserAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean delete(String id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(String id, String name) {
		// TODO Auto-generated method stub
		return false;
	}*/

}
