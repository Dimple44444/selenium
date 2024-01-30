package mycode;


public class MethodDemo {

	public static void main(String[] args) {
		MethodDemo a= new MethodDemo();
		String name = a.getData();	
		System.out.println(name);
		MethodDemo2 b= new MethodDemo2();
		b.getUserData();
		
	

	}
	public String getData() {
		System.out.println("hello world");
		return "Nikita Singh";
	}

}
