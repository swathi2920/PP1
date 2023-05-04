package Apr_05;

public class MethodTypes 
{
	 int n1=33; //global / instance variable , non-static
	 int n2=8;  //global / instance variable , sttaic
	
	 //no i/p , no o/p
	 void add()
	{
		int res = n1+n2;  // res--local variable
		System.out.println(" add : " + res);
	}

	 //with i/p , no o/p
	 void sub(int a, int b)
	{
		 n1=a;
		 n2=b;
		 
		int res = n1-n2;  // res--local variable
		System.out.println(" sub : " + res);
	}
	 
	 //no i/p , with o/p
	 int mul()
	{
		int res = n1*n2;  // res--local variable
		//System.out.println(" mul : " + res);
		return res;
	}

	 //with i/p , with o/p
	 float div(int a, float b)
	{
		 n1=a;
		float n2=b;
		
		float res = n1/n2;  
		return res;
	}
	public static void main(String[] args)
	{
		MethodTypes m = new MethodTypes();
		
		m.add();
		m.sub(5, 2);
		
		int v1=m.mul();
		System.out.println("Mul : " + v1);

		System.out.println("Div : " + m.div(33, 2.2f));
	}

}
