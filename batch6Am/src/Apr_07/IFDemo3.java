package Apr_07;

public class IFDemo3 {

	public static void main(String[] args) {

		int age =18;
		
		if(age >=18)
		{
			System.out.println(" valid > 18");
			if(age == 18)
			{
				System.out.println(" valid == 18");
				if(age == 0)
				{
					System.out.println(" valid == 0");
				}
				else
				{
					System.out.println(" valid != 0");
				}
			}
			else
			{
				System.out.println(" valid != 18");
			}
		}
		else
		{
			System.out.println("Invalid");
		System.out.println("ok");
		}

		System.out.println("done...");
	}

}
