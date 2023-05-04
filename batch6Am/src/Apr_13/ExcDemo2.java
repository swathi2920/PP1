package Apr_13;

public class ExcDemo2 {

	public static void main(String[] args) 
	{

		System.out.println("start....");
		try
		{
		int a[]= {22,33};
		System.out.println(a[0]);
		System.out.println(a[1]);
		//System.out.println(a[2]);
		try
		{
			System.out.println();
		}
		catch()
		{
			
		}
		}
		catch(ArithmeticException e)
		{
			e.printStackTrace();
		}
	//==============================
		
		try
		{
		String s=null;
		System.out.println(s.length());
		}
		catch(NullPointerException e)
		{
			e.printStackTrace();
		}
	//===============================
		try
		{
		int x=9;
		int y=0;
		System.out.println(x/y);
		}
		catch(ArithmeticException e)
		{
			e.printStackTrace();
		}
		
		System.out.println("stop....");

	}

}


//Exception in thread "main" java.lang.ArithmeticException: / by zero
//Exception in thread "main" java.lang.NullPointerException: 
//java.lang.ArrayIndexOutOfBoundsException

