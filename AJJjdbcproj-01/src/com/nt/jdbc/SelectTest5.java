package com.nt.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectTest5 {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		try(Connection con =DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","xe");){
			if(con!=null)
				try(Statement st=con.createStatement()){
					if(st!=null)
						try(ResultSet rs=st.executeQuery("SELECT COUNT(*) FROM STUDENT")){
							if(rs!=null)
								rs.next();
							   System.out.println(rs.getInt(1));
						}
				}
			
			
		}

	}

}
