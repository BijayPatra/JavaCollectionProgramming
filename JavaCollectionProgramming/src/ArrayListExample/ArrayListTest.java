package ArrayListExample;

import java.util.*;
//extend AbstractList,implements List interface
//not synchronized
//maintain insertion order
//stored element can randomly accessed
class ArrayListTest 
{
	public static void main(String args[]) 
	{	
		int i=40;
		Integer a=i;
		int j=a.intValue();
		ArrayList<String> lt= new ArrayList<String>();
		lt.add("vickey");
		lt.add("Anil");
		lt.add("Dog");
		lt.add("latin");
		
		
		
		ArrayList<String> list = new ArrayList<String>();// Creating generic arraylist
		list.add("Ravi");// Adding object in arraylist
		list.add("Vijay");
		list.add("Ravi");
		list.add(String.valueOf(i));
		list.add("Ajay");
		list.add("30");
		list.addAll(lt);
		list.add("Vijay");//can have duplicate
		list.add("");//can accept null value
		
		//Traversing list through Iterator  
		Iterator itr = list.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		
	}
}