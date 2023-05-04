package Apr_13;

public class customizedExcpDEmo {

	public static void main(String[] args) //throws Exception 
	{

		System.out.println("start....");
		int x=8;
		if(x == 10)
		{
			System.out.println("valid...");
		}
		else
		{
			try
			{
			throw new Exception(" salary missing....");
			} 
			catch(Exception e)
			{
				e.printStackTrace();
			}
			
		}
		System.out.println("stop....");
	}

}
