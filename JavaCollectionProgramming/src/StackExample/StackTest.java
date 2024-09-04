package StackExample;

import java.util.*;
//extends Vector.implements List interface
//own methods, push(),pop(),peek();
//LIFO technique
public class StackTest
{
	public static void main(String args[]) 
	{
		Stack<String> stack = new Stack<String>();
		stack.push("Ayush");
		stack.push("Garvit");
		stack.push("Amit");
		stack.push("Ashish");
		stack.push("Garima");
		
		Iterator<String> itr = stack.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
