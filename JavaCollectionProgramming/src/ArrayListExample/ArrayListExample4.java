package ArrayListExample;

import java.util.*;

/*Get and Set ArrayList
The get() method returns the element at the specified index, 
whereas the set() method changes the element.*/

public class ArrayListExample4 
{
	public static void main(String args[])
	{
		ArrayList<String> al = new ArrayList<String>();
		al.add("Mango");
		al.add("Apple");
		al.add("Banana");
		al.add("Grapes");
		// accessing the element
		System.out.println("Before inserting element in 1th index  "+al);
		System.out.println("Returning element: " + al.get(1));// it will return the 2nd element, because index starts
																// from 0
		// changing the element
		al.set(1, "Dates");
		// Traversing list
		//for (String fruit : al)
			//System.out.println(fruit);
		al.forEach(a ->{
			System.out.println(a);//advanced forEach loop
		});
	}
}