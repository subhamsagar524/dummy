package chapter7;

import java.util.ArrayList;
import java.util.Iterator;
public class Q3 {
	public static void main(String[]arg)
	{
		ArrayList<Integer> as=new ArrayList<Integer>();
		as.add(10);
		as.add(20);
		as.add(30);
		as.add(2, 40);
		System.out.println("Display using an Iterator variable...");
		Iterator<Integer> it=as.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		System.out.println("\n");
		
		//Advance Method
		System.out.println("Display by Advance loop...");
		for(Integer i:as)
			System.out.println(i);
		
		//Search for 40
		System.out.println("\nSearch 40? ");
		if (as.contains(40))
			System.out.print("40 is present...");
		else
			System.out.print("40 is not present...");
		
		//Element at 2
		System.out.println("\n\nElement at 2 is " + as.get(2));
		
		//Index of element 40 where found
		System.out.println("\nIndex of 40? ");
		int temp = as.indexOf(40);
		if (temp != -1)
			System.out.print("40 is found at : " + temp);
		
		//Remove 40
		System.out.println("\n\nRemove 40...");
		as.remove(2);
		System.out.print("Removed 40 :");
		
		//Print as array
		System.out.println("\n\nCoverting ArrayList to Array Printing all elements...");
		Integer tempx[] = new Integer[as.size()];
		as.toArray(tempx);
		for(Integer i:as)
			System.out.println(i);
		
		//Clear the all elements
		as.clear();
		System.out.println("\nAll clear" + as.toString());
		
		
	}
}