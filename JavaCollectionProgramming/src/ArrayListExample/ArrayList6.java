package ArrayListExample;

import java.io.*;
import java.util.*;
//Let's see an example to serialize an ArrayList object and then deserialize it.

class ArrayList6 
{

	public static void main(String[] args) 
	{
		ArrayList<String> al = new ArrayList<String>();
		al.add("Ravi");
		al.add("Vijay");
		al.add("Ajay");

		try {
			// Serialization
			FileOutputStream fos = new FileOutputStream("file");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(al);
			fos.close();
			oos.close();
			// Deserialization
			FileInputStream fis = new FileInputStream("file");
			ObjectInputStream ois = new ObjectInputStream(fis);
			ArrayList list = (ArrayList) ois.readObject();
			System.out.println(list);
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}