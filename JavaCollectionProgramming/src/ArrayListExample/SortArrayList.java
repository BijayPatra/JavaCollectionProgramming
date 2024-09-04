package ArrayListExample;

import java.util.*;

//How to Sort ArrayList

/*The java.util package provides a utility class Collections,
which has the static method sort(). Using the Collections.sort() method,
we can easily sort the ArrayList.*/

class SortArrayList 
{
	public static void main(String args[]) 
	{
		// Creating a list of fruits
		List<String> list1 = new ArrayList<String>();
		list1.add("Mango");
		list1.add("Apple");
		list1.add("Banana");
		list1.add("Grapes");
		// Sorting the list
		Collections.sort(list1);
		// Traversing list through the for-each loop

		for (String varArr : list1) {
			System.out.println(varArr);
		}

		System.out.println("Sorting numbers...");
		// Creating a list of numbers
		List<Integer> list2 = new ArrayList<Integer>();
		list2.add(21);
		list2.add(11);
		list2.add(51);
		list2.add(1);
		// Sorting the list
		Collections.sort(list2);
		// Traversing list through the for-each loop
		for (Integer number : list2)
			System.out.println(number);
	}

}
