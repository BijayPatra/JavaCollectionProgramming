package TreeSetExample;

import java.util.*;

//When we run the above program, we get the ClassCastException, as shown below.
//Exception in thread "main" java.lang.ClassCastException: class Employee cannot be cast to class java.lang.Comparable (Employee is in unnamed module of loader 'app'; java.lang.Comparable is in module java.base of loader 'bootstrap')
/*because*/
/*Explanation: In the above program, it is required to implement a 
 * Comparable interface. It is because the TreeSet maintains the sorting order,
 *  and for doing the sorting the comparison of different objects that are being
 *   inserted in the TreeSet is must, which is accomplished by implementing 
 *   the Comparable interface.*/
class Employee 
{

	int empId;
	String name;

// getting the name of the employee  
	String getName() 
	{
		return this.name;
	}

// setting the name of the employee  
	void setName(String name) 
	{
		this.name = name;
	}

// setting the employee id   
// of the employee  
	void setId(int a) {
		this.empId = a;
	}

// retrieving the employee id of  
// the employee  
	int getId() {
		return this.empId;
	}

}

public class ClassCastExceptionTreeSet
{

// main method  
	public static void main(String[] argvs) 
	{
// creating objects of the class Employee  
		Employee obj1 = new Employee();

		Employee obj2 = new Employee();

		TreeSet<Employee> ts = new TreeSet<Employee>();

// adding the employee objects to   
// the TreeSet class  
		ts.add(obj1);
		ts.add(obj2);

		System.out.println("The program has been executed successfully.");

	}
}