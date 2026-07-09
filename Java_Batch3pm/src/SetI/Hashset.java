package SetI;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Hashset {

	public static void main(String[] args) {
	
		
		Set setlist=new HashSet();
		setlist.add("Selenuim");
		setlist.add("Python");
		setlist.add("C# Sharp");
		setlist.add("React js");
		setlist.add("Node js");
		
		System.out.println("Set Interface : "+setlist);
		
		System.out.println("==========================================");
		
		List list1=new ArrayList();
		list1.add("Selenuim");
		list1.add("python");
		list1.add("C# Sharp");
		list1.add("React js");
		list1.add("Node js");
		
		
		System.out.println("List Interface : "+list1);
		

	}

}
