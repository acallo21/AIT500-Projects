import java.util.Arrays;
import java.util.Random;

public class BubbleSortTest {

	public static void main(String[] args) {
		  // Create an unordered array of 10 random ints
        int[] array = new int[10];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }

        // Print the unordered array
        System.out.println("Unsorted Array: " + Arrays.toString(array));

        // Call the sort method
        BubbleSort.sort(array);

        // Print the sorted array
        System.out.println("Sorted Array: " + Arrays.toString(array));
    }

}
