package Apr_12;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {

	public static void main(String[] args) 
	{

		ArrayList a= new ArrayList();
		
		System.out.println(a);
		System.out.println(a.isEmpty());
		
		a.add(44);
		a.add(33);
		a.add("john");
		a.add(44);
		a.add(null);
		System.out.println(a);
		System.out.println(a.size());
		
		a.add(1, "martin");
		System.out.println(a);
		
		a.remove("john");
		System.out.println(a);
		
//		Iterator i = a.iterator();
//
//		while(i.hasNext())
//		{
//			System.out.println(i.next().toString());
//		}

//		for(int i=0 ; i< a.size(); i++)
//		{
//			System.out.println(a.get(i));
//		}
		
		for(Object e : a)
		{
			System.out.println(e);
		}
	}

}
