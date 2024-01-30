package getterAndsetter;

class demoG3{
	private int age;
	private String name;
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
public class DemoGetterAndSetter {

	public static void main(String[] args) {
		
		demoG3 obj = new demoG3();
		
		obj.setAge(20);
		obj.getAge();
		
		obj.setName("Nikita");
		obj.getName();
		System.out.println(obj.getAge());
		System.out.println(obj.getName());
	}

}