package getterAndsetter;

class getset{
	private int age;
	private String name;
	
	public String getname() {
		return name;
		}
	
	public void setname(String name)
	{
		this.name= name;
	}
	
	public int getage()
	{
		return age;
		
	}
	
	public void setage(int age)
	{
		this.age= age;
		
	}
}
	public class getAndSet {
	public static void main(String[] args) {
		
		getset obj = new getset();
		obj.setage(20);
		obj.setname("Nikita");
		
		
		System.out.println(obj.getage());
		System.out.println(obj.getname());
		

	}

}
