package TreeMapExample;

import java.util.*;
/*The important points about Java TreeMap class are:

Java TreeMap contains values based on the key. It implements the NavigableMap interface and extends AbstractMap class.
Java TreeMap contains only unique elements.
Java TreeMap cannot have a null key but can have multiple null values.
Java TreeMap is non synchronized.
Java TreeMap maintains ascending order.*/

class TreeMap1 {
	public static void main(String args[]) {
		TreeMap<Integer, String> map = new TreeMap<Integer, String>();
		map.put(100, "Amit");
		map.put(102, "Ravi");
		map.put(101, "Vijay");
		map.put(103, "Rahul");

		for (Map.Entry m : map.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}
	}
}