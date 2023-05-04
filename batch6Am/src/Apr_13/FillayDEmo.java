package Apr_13;

public class FillayDEmo {

	public static void main(String[] args) 
	{

		System.out.println("start....");
		try
		{
		int a[]= {22,33};
		System.out.println(a[0]);
		System.out.println(a[1]);
		//System.out.println(a[2]);
		
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			System.out.println("discconnect  DB");
		}
		
		System.out.println("stop....");

	}

}


//Exception in thread "main" java.lang.ArithmeticException: / by zero
//Exception in thread "main" java.lang.NullPointerException: 
//java.lang.ArrayIndexOutOfBoundsException

