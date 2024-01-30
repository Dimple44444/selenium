package Abstract;

abstract class name{
	public abstract void normalName();
	public abstract void surname();
	public abstract void middlename();
	
	public void realname()
	{
		System.out.println("realname");
	}
	
}

class familyname extends name
{
	public void  normalName()
	{
		System.out.println("nikita");
	}

	@Override
	public void surname() {
		System.out.println("singh");
		
	}

	@Override
	public void middlename() {
		System.out.println("raj");
		
	}
	

 public class abstractlass {
	 public void main(String args[])
	 {
		 family myfamily= new family("john","shurya", "pooja");
		 
	 
	 }
 }

}
