package toStringDemo;

public class toStringExample {
	
	 int rollno;
	 String name;
	 String city;
	 
	  toStringExample(int rollno, String name, String city)
	 {
		 this.rollno= rollno;
		 this.name= name;
		 this.city= city;
		 
	 }
	  
	  public String toString()
	  {
		return rollno + " " + name + " "+ city ;
		  
	  }
	 
	 


	public static void main(String[] args) {
		toStringExample obj= new toStringExample(101, "Raj" ,"Lucknow");
		toStringExample s2=new toStringExample(102,"Vijay","ghaziabad"); 
		
		System.out.println(obj);
		System.out.println(s2);
		
		

	}
}


