package staticMember;

class staticblox
{ 
	private static int x;
	private int y;
	
	static
	{
		//staticmethod();
		x=200;
		//y=300;// we cannot make a static reference to non static field
		System.out.println("this is static block");
		System.out.println("value of x:" + x);
		//System.out.println("value of y:"+ y);
		
		
	}
	public static void staticmethod()
	{
		System.out.println("this is a static method");
	}
	 public void show()
	 {
		 System.out.println("this is show method");
	 }
	 public  void Display()
	 {
		 System.out.println("This is display method");
	 }
}

	
	public class staticBlock 
{
	
	public static void main(String[] args) {
		//staticblox obj= new staticblox();
		//obj.show();
	   // obj.Display();
		staticblox.staticmethod();
		
		
		
		//staticblox obj1= new staticblox();
		

	}








		
	}


