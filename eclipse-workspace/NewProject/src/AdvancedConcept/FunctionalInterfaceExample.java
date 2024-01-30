package AdvancedConcept;

@FunctionalInterface
interface A

{
	int add(int a,int b);
	
}

public class FunctionalInterfaceExample {

	public static void main(String[] args) {
		
		A obj= (int x,int y) -> x+y;
		int res= obj.add(10, 20);
		System.out.println("sum:"+ res);
		
		

	}

}
