package Apr_06;

public class constDEmo {
	
	String username;
	String password;
	
	//Default constructor
	public constDEmo()
	{
		username="user1";
		password= "unknown";
	}
	
	
//	//parametrized constructor
//		public constDEmo(String u ,String p)
//		{
//			username=p;
//			password= p;
//		}
		
	//parametrized constructor
			public constDEmo(String username ,String password)
			{
				this.username=username;
				this.password= password;
			}
			
	public void display()
	{
		System.out.println(username + "  "+ password);
	}

	public static void main(String[] args) {

		constDEmo c1= new constDEmo();
		c1.display();

		constDEmo c2= new constDEmo("john" , "test");
		c2.display();
		
	}

}
