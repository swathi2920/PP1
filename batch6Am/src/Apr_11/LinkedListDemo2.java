package Apr_11;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListDemo2 {

	public static void main(String[] args) 
	{

		LinkedList a= new LinkedList();
		System.out.println(a);
		System.out.println(a.isEmpty());
		
		a.add(44);
		a.add(33);
		a.add("john");
		a.add(44);
		//a.add(null);
		System.out.println(a);
		System.out.println(a.size());
		
		a.add(1, "martin");
		System.out.println(a);
		
		a.remove("john");
		System.out.println(a);
		
		ListIterator i = a.listIterator();

		while(i.hasNext())
		{
			System.out.println(i.next().toString());
		}
System.out.println("--- back====");

while(i.hasPrevious())
{
	System.out.println(i.previous());
}
	}

}
