package ConstructorDemo;

 class person
 {
	    private int age,rollno;
		private String name;
		
		person()
		{
			
		}
		
		person(int a, String pname)
		{
		age=a;
		name= pname;
		
		}
		person(int page,String dname, int rno)

		{
			this.age= page;
			this.name= dname;
			this.rollno= rno;
			
			
		}
		
		public void show()
		{
			System.out.println("person's age:" + age);
			System.out.println("person's name:" + name);
			System.out.println("person's rollno:" + rollno);
		}
 }






public class ParamConstructor {
	
	
	public static void main(String[] args) {
		 person p1= new person();
		 p1.show();
		 
		 person p2= new person(20,"nikita");
		 p2.show();
		 
		 person p3= new person(12, "neha",19);
		 p3.show();
		 

	}

}
