package exceptionHandlingDemo;

public class ArrayIndexOutOfBound {

	public static void main(String[] args) {
		 
		int[] number= {2,3,4,5,6,7};
		try
		{
			System.out.println("number[6]:" +number[7]);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e);
		}
		System.out.println("rest of the code execute");
		

}
}

