package mycode;

public class string {

	public static void main(String[] args) {
	//string is an object that represent sequence of characters// String literal 
	//String S1 = "Nikita ";
	//String S2= "Academy";
	//String S3 = "Sde";
	
	//new memory allocate operator 
	String S = new String("Academy class of year 2021");
	
	String[] splittedString= S.split("of");
	System.out.println(splittedString[0]);
	System.out.println(splittedString[1]);
	
	for (int i=0;i<S.length();i++)
	{
		System.out.println(S.charAt(i));
	}
	// Reverse the string 
	for (int i=S.length()-1;i<S.length();i--)
	{
		System.out.println(S.charAt(i));
	}
		
	
	
	
	
	
	

	}

	private static Object charAt(int i) {
		// TODO Auto-generated method stub
		return null;
	}

}
