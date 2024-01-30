package Abstract;
abstract class Vehicle
{
	public abstract void speed( ) ;
	public abstract void maintenance( ) ;
	public abstract void value( ) ;
	public abstract void playmusic();
	
	public void turnonAC()
	{
		System.out.println("turned on AC");// non abstract method
	}
}

class FourWheeler extends Vehicle 
{
	public void speed()
	{
		System.out.println ( "In speed of FourWheeler" ) ;
	}
	public void maintenance()
	{
		System.out.println ( "In maintenance of FourWheeler" ) ;
	}
	public void value()
	{
		System.out.println ( "In value of FourWheeler" ) ;
	}
	public void playmusic()
	{
		System.out.println ( "playing music" ) ;
	}
	
}

class TwoWheeler extends Vehicle 
{
	public void speed( )
	{
		System.out.println ( "In speed of TwoWheeler" ) ;
	}
	public void maintenance( )
	{
		System.out.println ( "In maintenance of TwoWheeler" ) ;
	}
	public void value()
	{
		System.out.println ( "In value of TwoWheeler" ) ;
	}
	public void playmusic( )
	{
		System.out.println ( "playing music" ) ;
	}
	
}

    public class abstractVehicle {
	
	
	public static void main(String[] args) {
		Vehicle maruti, bajaj;
		maruti = new FourWheeler( ) ;
		bajaj  = new TwoWheeler( ) ;
		
		
		maruti.speed( ) ;
		maruti.maintenance( ) ;
		maruti.value( ) ;
		maruti.turnonAC();
		
		bajaj.speed( ) ;
		bajaj.maintenance( ) ;
		bajaj.value( ) ;
		
	}

}
