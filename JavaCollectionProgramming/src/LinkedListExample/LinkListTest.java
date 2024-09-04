package LinkedListExample;

import java.util.Iterator;
import java.util.LinkedList;
//LinkedList extends AbstracSequencialList and Implements List,Deque interface
//not Synchronized
//manipulation is first,because no shifting is required.

public class LinkListTest 
{
	public static void main(String[] args) 
	{
		LinkedList<String> al=new LinkedList<String>();
		al.add("Ajay");
		al.add("Bijay");
		al.add("Chaitan");
		al.add("Zabed");
		al.add("Dinesh");
		al.add("Entiha");
		al.add("Bijay");//duplicate allowed
		al.add("");//null value is also allowed
		System.out.println("Size of the LinkedList is "+al.size());
		Iterator itr = al.iterator();
		while (itr.hasNext())
		{
			System.out.println(itr.next());
		}		
	}
}
