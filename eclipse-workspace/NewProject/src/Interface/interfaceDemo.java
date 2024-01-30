package Interface;

interface animal
{
	public void bark();
	public void roar();
	
}
class lion implements animal
{
	public void roar()
	{
	System.out.println("lion roaring");
	}

	@Override
	public void bark() {
		// TODO Auto-generated method stub
		
	}
}
	class dog implements animal
	{
		public void bark()
		{
			System.out.println("dog barking");
		}

		@Override
		public void roar() {
			// TODO Auto-generated method stub
			
		}
	}
	




public class interfaceDemo {

	public static void main(String[] args) {
		animal obj= new lion();
		animal obj2= new dog();
		
		obj.roar();
		obj2.bark();

	}

}
