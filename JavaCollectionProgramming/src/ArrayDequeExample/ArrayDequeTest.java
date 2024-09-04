package ArrayDequeExample;

import java.util.*;

/*The important points about ArrayDeque class are:

1.Unlike Queue, we can add or remove elements from both sides.
2.Null elements are not allowed in the ArrayDeque.
3.ArrayDeque is not thread safe, in the absence of external synchronization.
4.ArrayDeque has no capacity restrictions.
5.ArrayDeque is faster than LinkedList and Stack.
6.Not ordered.*/


public class ArrayDequeTest
{
	public static void main(String[] args) 
	{
		// Creating Deque and adding elements
		Deque<String> deque = new ArrayDeque<String>();
		deque.add("Ravi");
		deque.add("Vijay");
		deque.add("Ajay");
		// Traversing elements
		/*
		 * for (String str : deque) { System.out.println(str); }
		 */
		deque.forEach(str ->
						{
							System.out.println(str);
						}
						);
	}
}