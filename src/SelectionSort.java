import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args) {
        Integer[] arr = {1, 8, 6, 7, 5, 4, 3, 2, 9};
        sort(arr);
        System.out.print(Arrays.toString(arr));
    }

    private static void sort(Comparable[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int index = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j].compareTo(arr[index]) < 0) {
                    index = j;
                }
            }
            if (index != i) {
                Comparable tmp = arr[i];
                arr[i] = arr[index];
                arr[index] = tmp;
            }
        }
    }
}
