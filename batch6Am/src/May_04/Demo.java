package May_04;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Demo 
{
	@Test
	public void display()
	{
		System.out.println(" methods called...");
		
		String expect ="Java";
		String actual ="java";
		
		
		//Assert.assertEquals(actual,expect);
		
		//Assert.assertEquals(actual,expect,"plz check values...");
		
	//	Assert.assertTrue(10 == 100 , " Invalid condition...");
		
		Assert.assertFalse(10 == 100);
		
		System.out.println("end...");
		
//		if(expect.matches(actual))
//		{
//			System.out.println("Done...");
//		}
//		else
//		{
//			System.out.println("Failed...");
//		}
		
	}
	
//	@Test
//	public void display1()
//	{
//		System.out.println(" methods called...");
//	}

}
