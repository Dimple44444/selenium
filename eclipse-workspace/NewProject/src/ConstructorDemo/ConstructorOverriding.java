package ConstructorDemo;

class BaseClass
{
//	BaseClass()
//	{
//		System.out.println("this is base class constructor");
//	}
	BaseClass(String str)
	{
		System.out.println("Message:" + str);
	}
}
class DerievedClass extends BaseClass
{
	public DerievedClass()
	{
		super("This is my message");//super method instead of BaseClass("message");
		//super();
		System.out.println("this is Derieved class constructor");
	}
	
}


public class ConstructorOverriding {

	public static void main(String[] args) {
		DerievedClass obj = new DerievedClass();

	}

}
