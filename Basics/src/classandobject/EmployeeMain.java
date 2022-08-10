package classandobject;

import java.util.ArrayList;
import java.util.Collections;

public class EmployeeMain {

	public static void main(String[] args) {
		Employee e1=new Employee("gayathri",95000);
		
		System.out.println(e1.toString());
		System.out.println("===========================");
		Employee e2=new Employee("Ravi",50000);
		
		System.out.println(e2.toString());
		ArrayList<Employee> list=new ArrayList<Employee>();
		list.add(e1);
		list.add(e2);
		SalarySort s1=new SalarySort();
		Collections.sort(list,s1);
		for(Employee e:list)
		{
			System.out.println(e);
		}

	}

}
