package assignment6;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class assignment6 {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/julyfsd","root", "root");
		
		//Get the list of employees
		PreparedStatement pst1=con.prepareStatement("select * from emp2");
		ResultSet rs=pst1.executeQuery();
		while(rs.next()) {
			System.out.println(rs.getInt(1)+" "+ rs.getString(2)+" "+ rs.getInt(3)+" "+ rs.getInt(4)+" "+ rs.getString(5));
		}
		//Update the existing employee based in his/her id
		Scanner sc1=new Scanner(System.in);
		System.out.println("Enter Employee Id: ");
		int inputId=sc1.nextInt();
		System.out.println("Enter Employee Name: ");
		String inputName=sc1.next();
		PreparedStatement pst2=con.prepareStatement("update emp2 set empName=? where empId=?");
		pst2.setString(1, inputName);
		pst2.setInt(2, inputId);
		int x=pst2.executeUpdate();
		System.out.println(x+" record(s) updated");
		
		//Delete an employee based on the employee id
		Scanner sc2=new Scanner(System.in);
		System.out.println("Enter Employee Id you want to delete: ");
		int inputDeleteId=sc2.nextInt();
		CallableStatement cst=con.prepareCall("{call deleteEmp(?)}");
		cst.setInt(1, inputDeleteId);
		cst.execute();
		System.out.println("Employee has been deleted.");
		
		//Get the employee by id
		Scanner sc3=new Scanner(System.in);
		System.out.println("Enter Employee Id: ");
		int empInputId=sc3.nextInt();
		PreparedStatement pst3=con.prepareStatement("select empInputId from emp2");
		ResultSet rs2=pst3.executeQuery();
		System.out.println(rs2.getInt(1)+" "+rs2.getString(2)+" "+ rs.getInt(3)+" "+ rs.getInt(4)+" "+ rs.getString(5));
		
	}

}
