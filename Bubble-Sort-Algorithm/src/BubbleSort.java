import java.util.Arrays;
import java.util.Random;

public class BubbleSort {
	public static void sort(int[] data) {
        int n = data.length;
        boolean swapped;
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (data[j] > data[j + 1]) {

                    int temp = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = temp;
                    swapped = true;
                    if (!swapped)
                        break;
                }
            }
        }
    }
}
