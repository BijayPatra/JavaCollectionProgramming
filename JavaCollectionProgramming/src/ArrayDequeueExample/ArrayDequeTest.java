package ArrayDequeueExample;

import java.util.*;

/*1. ArrayDeque class implements Deque,Deque extentds Queue interface
2. we can add and delete the element in both the direction
3.ArrayDeque is faster than ArrayList and Stack,
4. it has not capacity restriction.*/

public class ArrayDequeTest
{
	public static void main(String[] args)
	{
//Creating Deque and adding elements  
		Deque<String> deque = new ArrayDeque<String>();
		deque.add("Gautam");
		deque.add("Karan");
		deque.add("Ajay");
//Traversing elements  
		for (String str : deque) {
			System.out.println(str);
		}
		deque.forEach(str ->
						{
							System.out.println(str);
						});
	}
}
