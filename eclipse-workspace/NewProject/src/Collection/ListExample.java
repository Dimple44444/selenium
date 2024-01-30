package Collection;

import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;

public class ListExample {

	public static void main(String[] args) {
		
		List <String> names = new ArrayList<String>();
		names.add("Nikita");
		names.add("Pooja");
		
		Iterator<String> itr = names.iterator();
		System.out.println("names:"+ itr.next());
		
		for(String name : names)
		{
			System.out.println(name);
		}
		
		
		
		
		
	}

}
