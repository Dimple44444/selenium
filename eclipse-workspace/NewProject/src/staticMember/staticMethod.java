package staticMember;
 class staticmethodx
 {
	 private static int x=100;
	 private int y=200;
	 
	 public void showvar()
	 {
		 
		 System.out.println("value of x:"+ x);
		 System.out.println("non static y:"+ y);
	 }
	 
	 public static void showval()
	 {
		 System.out.println("value of x:"+ x);
		 System.out.println("this is static method");
	 }
	 
 }
 class staticmethodx2
 {
	 private static int x=100;
	 private static int y=300;
	 
		
		 public static void showval() { System.out.println("value of x:"+ x);
		 System.out.println("Value of y:"+y);
		 System.out.println("this is static method"); }
		 
	 
 }
 
 


public class staticMethod {

	public static void main(String[] args) {
		
		staticmethodx obj= new staticmethodx();
		obj.showvar();
		staticmethodx.showval();
		staticmethodx2.showval();
	}

}
