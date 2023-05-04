package Apr_10;

public class P1 
{
	
	public void agreement()
	{
		System.out.println("parent -- p1");
	}

	public void account(String d1, String d2, String d3)
	{
		System.out.println("parent doc");
	}
	public static void main(String[] args) 
	{
		P1 p = new P1();
		p.agreement();

	}

}
