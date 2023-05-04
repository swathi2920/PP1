package Apr_05;

public class AccessModier {
	
	int x=88;
	
	void add()
	{
		System.out.println("default...");
	}
public	void sub()
	{
		System.out.println("public...");
	}
private	void mul()
	{
		System.out.println("private...");
	}
protected	void div()
	{
		System.out.println("protected...");
	}

	public static void main(String[] args) {
		AccessModier a= new AccessModier();
		
		a.add();
		a.div();
		a.mul();
		a.sub();

	}

}
