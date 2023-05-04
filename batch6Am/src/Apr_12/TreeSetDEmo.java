package Apr_12;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetDEmo {

	public static void main(String[] args) 
	{

		TreeSet<Integer> a= new TreeSet();
		
		System.out.println(a);
		System.out.println(a.isEmpty());
		
		a.add(44);
		a.add(33);
		a.add(11);
		a.add(44);
		a.add(null);
		System.out.println(a);
		System.out.println(a.size());
		
		
		
		
		
		
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
