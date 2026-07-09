package Quene;

import java.util.LinkedList;
import java.util.Queue;

public class Queueclass {

	public static void main(String[] args) {
		
		
		Queue<Integer> data=new LinkedList<Integer>();
		
		data.offer(10);
		data.offer(20);
		data.offer(30);
		data.offer(40);
		data.offer(50);
		
		
		System.out.println(data);
		
		//peek
		System.out.println("peek :"+data.peek());//10
		
		data.offer(5);
		
		System.out.println(data);
		
		//element
		System.out.println("element :"+data.element());//10
		
		//poll
		System.out.println("poll : "+data.poll());
		System.out.println(data);
		
		
		data.clear();
		System.out.println(data);
		
		//System.out.println("remove : "+data.remove());
		
		System.out.println("element : "+data.element());
		
		
		

	}

}
