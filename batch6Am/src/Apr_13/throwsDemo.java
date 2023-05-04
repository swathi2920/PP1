package Apr_13;

public class throwsDemo {

	public static void main(String[] args) throws InterruptedException {


		System.out.println("start....");
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e)
		{
		
			e.printStackTrace();
		}
		
		
		Thread.sleep(2000);
		
		System.out.println("stop....");

	}

}
