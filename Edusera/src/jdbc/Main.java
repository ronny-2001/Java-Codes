package jdbc;

//Import the package
import java.sql.*;

public class Main {

	public static void main(String[] args) throws Exception {
		
		//Register the Driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		//Establishing a Connection:
		String username="root";
		String password="Dhawale@9102001";
		String url="jdbc:mysql://localhost:3306/edusera";
		
		Connection connect=DriverManager.getConnection(url, username, password);
		
		
		//Creation of Statement:
		Statement st=connect.createStatement();
		
		
		//Execution of  Query:
		ResultSet result_set=st.executeQuery("select * from student");
		//ResultSet result_set=st.executeQuery("select * from student where student_id>2");
		
		//TO Printing ResultSet or Table:
		while(result_set.next()) {
			System.out.println(" | "+result_set.getInt(1)+" | "+result_set.getString(2)+" | "+result_set.getInt(3)+" | "+
								result_set.getString(4)+" | ");	
		} 
		
		//Update Query:
		//int n=st.executeUpdate("insert into student values (5,'Pranav Darekar',20,'pranavdarekar3@gmail.com') ");
		//System.out.println("\n"+n+" rows affected.");
		
		
		//int n=st.executeUpdate("update student set age=20 where student_id=2");
		//System.out.println("\n"+n+" rows affected.");
		
		//Delete Query:
		//int n=st.executeUpdate("delete from student where student_id=5");
		//System.out.println("\n"+n+" rows affected.");
		
		System.out.println("\nConnection Successful");
		connect.close();
	}
}