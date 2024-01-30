package Collection;

import java.util.ArrayList;
import java.util.Collections;

public class Assignment1OnCollection {

	public static void main(String[] args) {
		
		ArrayList<String> string= new ArrayList<String>();
		
		//Adding values 
		string.add("java");
		string.add("python");
		string.add("data structure");
		string.add("golang");
		
		
		
		System.out.println(string);
		
		//set method
		string.set(2, "c++");
		
		System.out.println(string);
		
		//remove method
		string.remove(2);
		System.out.println(string);
		
		//clear method
		//s.clear();
		//System.out.println(s);
		
		
		//sort the values
		Collections.sort(string);
		System.out.println(string);
		
		
		Collections.shuffle(string);
		System.out.println(string);
		
		//swapping values 
		String temp;
		temp= string.get(1);
		string.set(1, string.get(2));
		
        string.set(2, temp);
		System.out.println(string);
		
		
	
		
	}

}
