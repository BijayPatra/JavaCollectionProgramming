package HashTableExample;

import java.util.*;
/*
Points to remember
A Hashtable is an array of a list. Each list is known as a bucket. The position of the bucket is identified by calling the hashcode() method. A Hashtable contains values based on the key.
Java Hashtable class contains unique elements.
Java Hashtable class doesn't allow null key or value.
Java Hashtable class is synchronized.
The initial default capacity of Hashtable class is 11 whereas loadFactor is 0.75.*/


class Hashtable1 
{
	public static void main(String args[]) 
	{
		Hashtable<Integer, String> hm = new Hashtable<Integer, String>();

		hm.put(100, "Amit");
		hm.put(102, "Ravi");
		hm.put(101, "Vijay");
		hm.put(103, "Rahul");

		for (Map.Entry m : hm.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}
	}
}