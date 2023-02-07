public class User {
	public int id;
	public String firstname, lastname;
	
	public User(int id, String firstname, String lastname)
	{
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
	
	}
	
	public int getid(){
		return id;
	}
	
	public String getfirstname(){
		return firstname;
	}
	
	public String getlastname(){
		return lastname;
	}
	
	
}