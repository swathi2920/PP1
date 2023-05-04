package Apr_13;

public class ExcDemo {

	public static void main(String[] args) 
	{

		System.out.println("start....");
		try
		{
		int a[]= {22,33};
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		
		
		String s=null;
		System.out.println(s.length());
		
		
		
		int x=9;
		int y=0;
		System.out.println(x/y);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		System.out.println("stop....");

	}

}


//Exception in thread "main" java.lang.ArithmeticException: / by zero
//Exception in thread "main" java.lang.NullPointerException: 
//java.lang.ArrayIndexOutOfBoundsException

