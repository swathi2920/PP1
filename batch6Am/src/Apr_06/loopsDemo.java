package Apr_06;

public class loopsDemo {
	
	public void whileEg()
	{
		int i=0;
	      while (i<=10)
	      {
	        System.out.println(i);
	        i++; // i = i+1;
	      }
	      
	      System.out.println("done...");
	}
	
	public void DowhileEg()
	{
		int i=50;
	     do
	      {
	        System.out.println(i);
	        i++; // i = i+1;
	      } while (i<=10);
	      
	      System.out.println("done...");
	}

	public void forEg()
	{
		for(int i=5 ; i<=10 ; i++)
		{
			System.out.println(i);
		}
	      
		
	      System.out.println("done...");
	      
	      for(int i=10 ; i>=1 ; i--)
			{
				System.out.println("*");
			}
	}
	
	public void EnhancedforEg()
	{
		
		int x=9;
		int m1=88;
		int m2=77;
		//Array-- multiple values of same datatype is stored in a single ememory
		
		int marks[] = {55,77,88,33};
		
		for(int i : marks)
		{
			System.out.println(i);
		}
		
String nm[] = {"aaa","mmm","cc"};
		
		for(String i : nm)
		{
			System.out.println(i);
		}
		
		for(int i=0 ; i<nm.length ; i++)
		{
			System.out.println(nm[i]);
		}
	}
	
	public static void main(String[] args) {

		loopsDemo obj= new loopsDemo();
		//obj.whileEg();
		//obj.DowhileEg();
		//obj.forEg();
		//obj.EnhancedforEg();
		
		for(int i=1 ; i<=5 ; i++)
		{
			for(int j=1 ; j<=i ; j++)
			{
			System.out.print("*");
			}
			System.out.println();
		}

	}

}
