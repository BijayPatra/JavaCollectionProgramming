package ArrayListExample;

import java.util.ArrayList;
import java.util.Iterator;

class ArrayList9 {
	public static void main(String args[]) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("Ravi");
		al.add("Vijay");
		al.add("Ajay");
		ArrayList<String> al2 = new ArrayList<String>();
		al2.add("Ravi");
		al2.add("Hanumat");
		al.retainAll(al2);//common value of the element it will extract between two ArrayList object
		System.out.println("iterating the elements after retaining the elements of al2");
		Iterator itr = al.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}