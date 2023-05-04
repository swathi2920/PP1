package Apr_07;

public class EncapDemo {
	
	public String unm;
	private String pwd;

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public static void main(String[] args) 
	{
		EncapDemo e= new EncapDemo();
		System.out.println(e.unm + "  "+ e.pwd);
		
		e.unm= "user1";
		e.pwd = "test";
		System.out.println(e.unm + "  "+ e.pwd);

	}

}
