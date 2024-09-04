package ArrayListExample;

import java.util.*;

public class ArrayListExample1 
{
	public static void main(String args[])
	{
		ArrayList<String> list = new ArrayList<String>();// Creating arraylist
		list.add("Mango");// Adding object in arraylist
		list.add("Apple");
		list.add("Banana");
		list.add("Grapes");
		Collections.sort(list);
		// Printing the arraylist object
		System.out.println(list);
		ArrayList<String> intArray=new ArrayList<String>();
		intArray.add("22");
		intArray.add("1");
		intArray.add("4");
		intArray.add("10");
		//Collections.sort(intArray);
		System.out.println("Integer type of Array:" +intArray);
		list.addAll(intArray);
		System.out.println("Printing the 1st Arraylist "+list);
	}
}