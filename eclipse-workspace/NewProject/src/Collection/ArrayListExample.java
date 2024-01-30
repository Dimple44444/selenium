package Collection;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListExample {

	public static void main(String[] args) {
		
		//syntax for creation of ArrayList
		ArrayList<String> cars = new ArrayList<String>();
		
//		cars.add("Benz");
//		cars.add("Suzuki");
//		cars.add("Honda");
//		cars.add("Hyundai");
//		
//		System.out.println(cars);
//		
//		//get method used to get the value by index
//		System.out.println(cars.get(2));
//		
//		//set methos used to manipulate the existing list value by index number
//		cars.set(1, "Audi");
//		
//		System.out.println(cars);
//		
//		// Remove methods removes the existing element
//		cars.remove(3);
//		
//		//removes all the elements
//		cars.clear();
		
		//returns the size of list
		//System.out.println(cars.size());
				
		cars.add("Benz");
		cars.add("Suzuki");
		cars.add("Honda");
		cars.add("Hyundai");
		cars.add("Kia");
		cars.add("Renault");
		cars.add("Nissan");
		
	for(int x=0; x<cars.size();x++)
	{
		System.out.println(cars.get(x));
		}
		//enhanced for
		for( String s : cars)
	{
			System.out.println(s);
		}
		
		System.out.println(cars);
		
//		String temp;
//		
//		temp = cars.get(2);
//		cars.set(2, cars.get(3));
//		cars.set(3, temp);
		
		//Collections.reverse(cars);
		Collections.sort(cars);
		
		System.out.println(cars);
		
		
	}
}