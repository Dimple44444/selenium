package Collection;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListAssignment {

	public static void main(String[] args) {
		LinkedList<String> li= new LinkedList<>();
		
		li.add("Apple");
		li.add("Apple");
		li.add("Orange");
		
		System.out.println("original linkedlist is:"+ li);
		
		Iterator<String> iterator = li.iterator();
		while (iterator.hasNext())
		
			System.out.println(iterator.next()); 
		

	
	//add 
	li.add( 2, "Grapes");
	System.out.println("Add element in linked list:" + li);
	
	//set
	li.set(1,"onion");
	System.out.println(li);
	
	//remove
	
	li.remove(1);
	System.out.println(li);
	
	
	
	
	
	
	
	
		
		
	}	

	}


