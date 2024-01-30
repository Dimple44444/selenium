
class MultidimensionalArray {
    public static void main(String[] args) {

        int[][] a = {
            {1, 2, 3}, 
            {4, 5, 6, 9}, 
            {7}, 
        };
      
      
        printMsg(a[0].length);
        printMsg(a[1].length);
        printMsg( a[2].length);
    }
    public static void printMsg(int length) {
    	System.out.println("Length of row "+length+" :" +length);
    }
}