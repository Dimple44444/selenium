package mycode;

public class ifElse {

	public static void main(String[] args) {
		int[] arr2 = {1,2,3,53,4,8,10,22};
		for(int i=0;i<arr2.length;i++)
		{
			if(arr2[i]% 2==0)
					{ 
				System.out.println(arr2[i]);
			
					}
			else
			{ 
				System.out.println(arr2[i] + " is not multiple of 2");
			}
			
		}
	}

}
