package com.dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.ArrayList;
import java.util.List;

import javax.xml.transform.Result;

import com.mod.Model;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.ResultSet;

public class Dao {
	
	public static Connection getcon()
	{
		Connection con =  null;
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");
			 con = DriverManager.getConnection("jdbc:mysql://localhost:3306/serpro","root","");
		} catch (Exception e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return con;
	}
	
	//insert
public static int savedate(Model m1)
{
	int status =0;
	
	//connection call
	Connection con = Dao.getcon();
	//statement
	try
	{
	PreparedStatement ps = (PreparedStatement) con.prepareStatement("insert into nik123 (name,email,address,phone) values (?,?,?,?)");
	
	ps.setString(1,m1.getName());
	ps.setString(2,m1.getEmail());
	ps.setString(3,m1.getAddress());
	ps.setString(4,m1.getPhone());
	
	status = ps.executeUpdate();
	
	
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
	
	return status;
}

//view
public static List <Model> view()
{

	
	//connection call
	Connection con = Dao.getcon();
	
	List<Model>list = new ArrayList<>();
	//statement
	try
	{
	PreparedStatement ps = (PreparedStatement) con.prepareStatement("select * from nik123");
	
	java.sql.ResultSet set = ps.executeQuery();
	
	while(set.next())
	{
		int id = set.getInt(1);
		String name = set.getString(2);
		String email =  set.getString(3);
		String address =  set.getString(4);
		String phone = set.getString(5);
		
		Model m1 = new Model();
		m1.setId(id);
		m1.setName(name);
		m1.setEmail(email);
		m1.setAddress(address);
		m1.setPhone(phone);
		list.add(m1);
		
	}
	
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
	
	return list;
}

//delete
/*
public static void deletedate(int id2) {
	// TODO Auto-generated method stub
    Model m = null;
	int status = 0;
	//connection call
	Connection con = Dao.getcon();
	//statement
	try
	{
	PreparedStatement ps = (PreparedStatement) con.prepareStatement("delete from nikpro where id = ?");
	
	ps.setInt(1,m.getId());
	
	
	status = ps.executeUpdate();
	
	
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
	
	return;
}

//edit

public static Model editdate(int id)
{
	Model m = null;
	
	//connection call
	Connection con = Dao.getcon();
	//statement
	try
	{
	PreparedStatement ps = (PreparedStatement) con.prepareStatement("select * from nikpro where id=?");
	ps.setInt(1, id);
	java.sql.ResultSet set =  ps.executeQuery();
	
	
	
	if(set.next())
	{
		int id1 = set.getInt(1);
		String name = set.getString(2);
		String surname =  set.getString(3);
		String email =  set.getString(4);

		
		m.setId(id1);
		m.setName(name);
		m.setSurname(surname);
		m.setEmail(email);
	}
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
	
	return m;
}


 //update

public static int updatedate(Model m)
{
	int status =0;
	
	//connection call
	Connection con = Dao.getcon();
	//statement
	try
	{
	PreparedStatement ps = (PreparedStatement) con.prepareStatement("update nikpro set name =?, surname =?, email =? where id =?");
	
	ps.setString(1,m.getName());
	ps.setString(2,m.getSurname());
	ps.setString(3,m.getEmail());
	ps.setInt(4,m.getId());
	
	status = ps.executeUpdate();
	
	
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
	
	return status;
}
*/
}



