package LinkedHashSetExample;

import java.util.*;
//extends HashSet and implements Set interface.
//no duplicate, allow null value.
public class LinkedHashSetTest 
{
	public static void main(String args[]) 
	{
		LinkedHashSet<String> set = new LinkedHashSet<String>();
		set.add("Ravi");
		set.add("Vijay");
		set.add("Ravi");//duplicate is not allowed, value is override.
		set.add("Ajay");
		set.add("");//null value is  allowed.considered as blank space.
		System.out.println("Size of LinkedHashSet  "+set.size());
		System.out.println("value of LinkedHashSet:  "+set);
		Iterator<String> itr = set.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
