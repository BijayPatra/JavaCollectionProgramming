package VectorExample;

import java.util.*;
//uses dynamic array to store the elements. its similar to ArrayList
//Synchronized, contain many methods which is not belongs to Collection.

public class VectorTest 
{
	public static void main(String args[]) 
	{
		Vector<String> v = new Vector<String>();
		v.add("Ayush");
		v.add("Amit");
		v.add("Bijay");
		v.add("Ashish");
		v.add("Garima");
		v.add("Ayush");//contains duplicate.
		v.add("");//contain null value
		System.out.println("Size of Vector:  "+v.size());
		Iterator<String> itr = v.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}