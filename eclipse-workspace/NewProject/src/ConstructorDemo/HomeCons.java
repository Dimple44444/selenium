package ConstructorDemo;

class HomeCons {
	
	public HomeCons() {
//	System.out.println("Welcome to your smart home!");
    turnOnFan();
    turnOnLight();
    turnOnAC();
	}
    
	
	
	
		 public void turnOnFan() {
		        System.out.println("Fan is turned on.");
		    }

		   
		    public void turnOnLight() {
		        System.out.println("Light is turned on.");
		    }

		   
		    public void turnOnAC() {
		        System.out.println("AC is turned on.");
		        
		    }

		        
		    
		    public static void main(String[] args) {
		    	HomeCons obj = new HomeCons();
		    }
}
	


