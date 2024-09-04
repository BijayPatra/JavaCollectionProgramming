package HashSetExample;

import java.util.*;
//set is allowed only one null value
//no duplicate
//The HashSet class extends AbstractSet class which implements Set interface.
//The Set interface inherits Collection and Iterable interfaces in hierarchical order.
public class HashSetTest
{
	public static void main(String args[])
	{
//Creating HashSet and adding elements  
		HashSet<String> set = new HashSet<String>();
		set.add("Ravi");
		set.add("Vijay");
		set.add("Ravi");//duplicate not allowed, value is override
		set.add("Ajay");
		set.add("");//null value is not allowed in set
//Traversing elements 
		System.out.println("Size of set:  "+set.size());
		Iterator<String> itr = set.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}