package Apr_10;

public class PolyDemo 
{

	public void login(String u , String p)
	{
		System.out.println("user...");
	}
	
	public void login(String u , int p)
	{
		System.out.println("DEv...");
	}
	public void login(int u , String p)
	{
		System.out.println("Admin...");
	}
//	public void login(int u , String p)
//	{
//		System.out.println("Admin...");
//	}
	
	
	public static void main(String[] args) {
		PolyDemo p  = new PolyDemo();
		p.login("aaa", 33);
		p.login(33,"kkk");

	}

}
