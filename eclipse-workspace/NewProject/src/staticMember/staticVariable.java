package staticMember;

class staticexample
{
	private static int x=20; // static var
	private int y=30; //non static var
	
	//static {
		
	//}
	
	public void setval()
	{
		x=50;
		
	}
	public void showval()
	{
		System.out.println("x=" + x + "y=" +y);
	}
	
}

public class staticVariable {

	public static void main(String[] args) {
		staticexample obj1 = new staticexample();
		
		obj1.setval();
		obj1.showval();
		staticexample obj2 = new staticexample();
		obj2.showval();
		
	}

}
