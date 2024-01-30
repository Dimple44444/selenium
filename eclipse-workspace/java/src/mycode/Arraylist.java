package mycode;

import java.util.ArrayList;

public class Arraylist {

	public static void main(String[] args) {
		ArrayList<String> a= new ArrayList<String>();
		a.add("Nikita");
		a.add("nik2");
		a.add("priya");
		a.remove(2);
		
		for(String v : a)
		{
			System.out.println(v);
		
	}

}
}
