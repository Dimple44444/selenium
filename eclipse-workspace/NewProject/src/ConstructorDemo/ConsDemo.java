package ConstructorDemo;

class constructorExample
{
	private int x=100;
	//static
	//{
	//	//System.out.println(x);
	//	System.out.println("static block called");
	//}
	constructorExample()
	{
		System.out.println(x);
		System.out.println("Constructor Called");
	}
	static
	{
		//System.out.println(x);
		System.out.println("static block called");
	}

	
	public void show()
	{
		System.out.println("this is method");
	}
	
}

public class ConsDemo {

	public static void main(String[] args) {
		
		constructorExample obj=new constructorExample();
		obj.show();

	}

}