package Apr_12;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemoGeneric {

	public static void main(String[] args) 
	{

		List<Integer> a= new ArrayList();
		
		a.
		System.out.println(a);
		System.out.println(a.isEmpty());
		
		a.add(44);
		a.add(33);
		a.add(11);
		a.add(44);
		a.add(null);
		System.out.println(a);
		System.out.println(a.size());
		
		a.add(1, 8);
		System.out.println(a);
		
		a.remove(3);
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
