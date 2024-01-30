package Assignment5java;

 class sumNumber

{
	private int num1;
	private int num2;
	


 public sumNumber(int num1, int num2)
 {
	 this.num1= num1;
	 this.num2= num2;
 }
 public int calculateSum()
 {
	 return num1+num2;
 }
}



public class Assignment5Java {

	public static void main(String[] args) {
		sumNumber obj= new sumNumber(5,10);
		System.out.println("sum of numbers:" + obj.calculateSum());
//		System.out.println("sum of numbers:" + calculateSum());
		
	}

}
