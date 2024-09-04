package LinkedListExample;

import java.util.*;

class BookTest
{
	int id;
	String name, author, publisher;
	int quantity;

	public BookTest(int id, String name, String author, String publisher, int quantity) 
	{
		this.id = id;
		this.name = name;
		this.author = author;
		this.publisher = publisher;
		this.quantity = quantity;
	}
}

public class ListExample5 
{
	public static void main(String[] args) 
	{
		// Creating list of Books
		List<BookTest> list = new ArrayList<BookTest>();
		// Creating Books
		BookTest b1 = new BookTest(101, "Let us C", "Yashwant Kanetkar", "BPB", 8);
		BookTest b2 = new BookTest(102, "Data Communications and Networking", "Forouzan", "Mc Graw Hill", 4);
		BookTest b3 = new BookTest(103, "Operating System", "Galvin", "Wiley", 6);
		// Adding Books to list
		list.add(b1);
		list.add(b2);
		list.add(b3);
		// Traversing list
		for (BookTest b : list) 
		{
			System.out.println(b.id + " " + b.name + " " + b.author + " " + b.publisher + " " + b.quantity);
		}
	}
}
