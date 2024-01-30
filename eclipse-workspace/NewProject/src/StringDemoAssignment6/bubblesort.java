package StringDemoAssignment6;

public class bubblesort {

	public static void main(String[] args) {
		int[] array = {64, 34, 25, 12, 22, 11, 90};

        System.out.println("Original array: " + arrayToString(array));

        bubbleSort(array);

        System.out.println("Sorted array: " + arrayToString(array));
    }

    // Bubble Sort implementation
    private static void bubbleSort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                // Compare adjacent elements
                if (arr[j] > arr[j + 1]) {
                    // Swap them if they are in the wrong order
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    // Helper method to convert array to string for printing
    private static String arrayToString(int[] arr) {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < arr.length; i++) {
            sb.append(arr[i]);
            if (i < arr.length - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }


	}


