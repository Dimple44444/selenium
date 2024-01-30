package StringDemoAssignment6;

public class reverseString {
	public static void main(String[] args) {
	String originalStr = "Hello World";
	String reversedStr = "";
	System.out.println("Original string: " + originalStr);
	


	for (int i = 0; i < originalStr.length(); i++) {
	  reversedStr = originalStr.charAt(i) + reversedStr;
	}

	System.out.println("Reversed string: "+ reversedStr);

	
	}
}


