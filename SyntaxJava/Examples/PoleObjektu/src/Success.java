import java.awt.List;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

//Naucit se Genericke typy a pokracovat
//https://www.youtube.com/watch?v=P0opfx23Czw

public class Success extends javax.swing.JFrame {
	
	ArrayList<User> userList = new ArrayList<>();
	//ArrayList userList = new ArrayList();
	
	//public ArrayList<User> userList(){
	public void userList2(){
		//ArrayList<User> userList = new ArrayList<>();
		
		User user;	
		
		user=new User(1, "Jonas", "Barton");
		userList.add(user);
		
		user=new User(2, "Milos", "Zeman");
		userList.add(user);
		
	}
	
	
	public void userList(){
		//ArrayList<User> userList = new ArrayList<>();
		
		User user;	
		
		user=new User(1, "Jonas", "Barton");
		userList.add(user);
		
		user=new User(2, "Milos", "Zeman");
		userList.add(user);
		
	}
	
	
	
	
	
	
	/*
	public String VratText()
	{
		String text;
		
		int id;
		String FirstName;
		String LastName;
		
		id = userList;
		
		text = 
		
		text = "";
		
		return text;
	}
	*/
	 
}