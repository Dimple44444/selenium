package Interface;

interface actor
{
	public void present();
}
class movie
{
	public void show()
	{
		System.out.println("show is live");
	}
}
class amit extends movie implements actor
{

	public void present() {
		System.out.println("amitabh is presenting");
		
	}
	public void show()
	{
		System.out.println("this is a show");
	}
	
}

public class AnotherExample {

	public static void main(String[] args) {
		amit obj= new amit();
		obj.present();
		obj.show();

	}

}
