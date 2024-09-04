package TreeSetExample;

import java.util.Iterator;
import java.util.TreeSet;
//implements SortedSet,sorted assending order
//no duplicate,if inserted its override the privious value as in hashset
//no null value
//access and retrival time is faster to HashSet and LinkedHashSet
/*Java TreeSet class contains unique elements only like HashSet.
Java TreeSet class access and retrieval times are quiet fast.
Java TreeSet class doesn't allow null element.
Java TreeSet class is non synchronized.
Java TreeSet class maintains ascending order.
Java TreeSet class contains unique elements only like HashSet.
Java TreeSet class access and retrieval times are quite fast.
Java TreeSet class doesn't allow null elements.
The TreeSet can only allow those generic types that are comparable. 
For example The Comparable interface is being implemented by the StringBuffer class.*/

/*For Synchronized a Treeset below method is used.

* TreeSet Treeset=new TreeSet();
* Set tree=Collections.SynchronizedSet(Treeset);//now tree is Synchronized.
*/
public class TreeSetTest
{
	public static void main(String args[])
	{
//Creating and adding elements  
		TreeSet<String> set = new TreeSet<String>();
		set.add("Ravi");
		set.add("Vijay");
		set.add("Ravi");
		set.add("Ajay");//sorted assending order
		set.add("Vijay");//no duplicate its override the previous value
		set.add("");//unable to insert null value.
		System.out.println("Size of TreeSet is: "+set.size());//4
//traversing elements  

		Iterator<String> at= set.iterator();
		while(at.hasNext()) {
			System.out.println(at.next());
		}
	}
}