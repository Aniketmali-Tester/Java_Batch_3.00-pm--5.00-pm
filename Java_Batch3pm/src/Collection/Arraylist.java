package Collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Arraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Create a Arraylist
		/*ArrayList list=new ArrayList<>();
		list.add(10);
		list.add("Java");
		list.add('A');
		list.add(23.5);
		list.add(23456.78990009f);
		
		
		System.out.println(list);*/
		
		LinkedList list=new LinkedList();
		
		
		List <String> Employee=new ArrayList<String>();
	   
		Employee.add("Sathish");
		Employee.add("Rahul");
		Employee.add("Kiran");
		Employee.add("Amit");
		
		System.out.println(Employee);
		
		
		
	//add(int index,object O)::-
		
		Employee.add(3, "Rohit");
		System.out.println(Employee);
		
		
		//remove
		Employee.remove(3);
		System.out.println("After Remove : "+Employee);
		
		//remove
		Employee.remove("Amit");
		System.out.println("After Remove Specific object from list : "+Employee);
		
		//set(int index,object)
		Employee.set(0, "Praveen");
		System.out.println("After set: "+Employee);
		
		//get(int index)::
		System.out.println(Employee.get(2));
		
		//Size
		System.out.println(Employee.size());
		
		//isempty
		System.out.println(Employee.isEmpty());
		
		
		//contains
		System.out.println(Employee.contains("Praveen"));
		
		
		//add all
		ArrayList<String> NewEmployee=new ArrayList<String>();
		NewEmployee.add("Akash");
		NewEmployee.add("Ramu");
		NewEmployee.add("Sundar");
		NewEmployee.add("priya");
		
		System.out.println("New Employee : "+NewEmployee);
		
		
		Employee.addAll(NewEmployee);
		
		System.out.println("After New Employee added : "+Employee);
		
		//containsall
		System.out.println(Employee.containsAll(NewEmployee));
		
		
		//removeall
		System.out.println(Employee.removeAll(NewEmployee));
		
		System.out.println("After Remove Employee : "+Employee.containsAll(NewEmployee));
		
		Employee.clear();
		
		
		System.out.println("After clear :" + Employee.isEmpty());
		

	}

}
