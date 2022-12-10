package com.nt.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class SelectTest4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=null;
		int no=0;
		Connection con=null;
		ResultSet rs=null;
		Statement st=null;
		try{
			sc=new Scanner(System.in);
			if(sc!=null) {
				System.out.println("Enter Student Number");
				no=sc.nextInt();
			}//if
			//establish connection
			con =DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","xe");
			// statement creation
			if (con!=null)
				st=con.createStatement();
			String query="SELECT * FROM STUDENT WHERE SNO="+no;
			System.out.println(query);
			if (st!=null)
				rs=st.executeQuery(query);
			if(rs!=null) {
               if(rs.next()) {
            	   System.out.println(rs.getInt(1)+" "+ rs.getString(2)+" "+ rs.getString(3)+" "+rs.getInt(4));
               }else {
            	  System.out.println("Record not found"); 
               }
			}
			
 
		}//try
		catch(SQLException e) {
			e.printStackTrace();
		}
		finally{
			try {
				if(rs!=null)
					rs.close();
			}
			catch(Exception e) {
		
		 e.printStackTrace();
		}
			try {
				if(con!=null)
					con.close();
			}
			catch(Exception e) {
		
		 e.printStackTrace();
		}
			}

	}//main

}//class
