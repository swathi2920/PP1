package Apr_04;

public class calculatorDemo 
{
	static int n1=33; //global / instance variable , non-static
	static int n2=8;  //global / instance variable , sttaic
	
	static void addFun()
	{
		int res = n1+n2;  // res--local variable
		System.out.println(" add : " + res);
	}

	public static void main(String[] args) 
	{
		calculatorDemo c1 = new calculatorDemo();
		c1.addFun();
		calculatorDemo.addFun();
		
		int a = c1.n1;
		System.out.println(a);
		
		System.out.println("Value of n2 : " + c1.n2);
		
		System.out.println(n2);
		System.out.println(calculatorDemo.n2);
	}

}
