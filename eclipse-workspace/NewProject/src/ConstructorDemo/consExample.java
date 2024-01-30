package ConstructorDemo;

// class human
//{
//	human ()
//	{
//		System.out.println("this is a constructor");
//	}
//}
//
//
//public class consExample {
//	
//	public static void main(String args[])
//	{
//		human obj= new human();
//		human obj2= new human();
//		
//		
//	}
//
//}

class student{
int id;
String name;

student(int id, String name)
{
this.id=id;
this.name= name;
}
public void display()
{
System.out.println("display result:" + id +"name:"+ name);
}

public static void main(String args[])
{
student obj= new student(111,"Nikita");
student obj2= new student(222,"pooja");

obj.display();
obj2.display();





}
}



