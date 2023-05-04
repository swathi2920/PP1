package Apr_10;

public class c1 extends P1
{

	public void agreement()
	{
		System.out.println("child -- c1");
		//super.agreement();
	}
	
	public void agreement2()
	{
		System.out.println("child -- c1");
	}
	
//	public void account(String d1)
//	{
//		System.out.println("child doc");
//	}
	public static void main(String[] args) {

//		P1 x= new P1();
//		x.agreement();
		
		c1 y = new c1();
		y.agreement();
		
		y.agreement2();

		y.account(null, null, null);
		
	}

}
