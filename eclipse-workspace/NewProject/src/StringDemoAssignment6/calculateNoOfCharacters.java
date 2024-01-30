package StringDemoAssignment6;

public class calculateNoOfCharacters {

	public static void main(String[] args) {
		
		String str= "My name is Nikita";
		
		  int count = 0; System.out.println("Input String is:" +str);
		 
		 for(int i=0;i<str.length();i++) 
		 { if(str.charAt(i)!=' ') count++; 
		 }
		  System.out.println("no of characters are :"+ count );
		 
		
		//System.out.println("no of characters are:" + str.length());
	}

}
