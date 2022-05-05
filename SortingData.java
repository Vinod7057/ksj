
package com.emp;
import java.util.*;

class Employee {
	int id;
	String name;
	int salary;
	Employee(int id, String name, int salary)
	{
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
}
class EmployeeComparator implements Comparator<Employee> {
	public int compare(Employee s1, Employee s2)
	{
		if ( s1.salary==s2.salary)
			return 0;
		else if (s1.salary>s2.salary )
			return 1;
		else
			return -1;
	}
}


class SortingData {
	public static void main(String[] args)
	{

		ArrayList<Employee> e = new ArrayList<Employee>();
		e.add(new Employee(1, "Ashok", 20000));
		e.add(new Employee(2, "Avinash", 30000));
		e.add(new Employee(3, "Vinod", 40000));
		e.add(new Employee(4, "Ganesh", 50000));
		e.add(new Employee(5, "Dharmraj", 60000));
		e.add(new Employee(10, "Akshay", 15000));
		e.add(new Employee(9, "Purushottam", 18000));
		e.add(new Employee(8, "Tushar", 45000));
		e.add(new Employee(7, "Narendra", 55000));
		e.add(new Employee(6, "Aanantkumar", 35000));

		
		System.out.println("After sorting(sorted by Salary And Id)");
		Collections.sort(e, new EmployeeComparator());
		for (Employee emp1 : e) {
			System.out.println(emp1.id + "\t" + emp1.salary	+ "\t" + emp1.name);
		}
	}
}
 