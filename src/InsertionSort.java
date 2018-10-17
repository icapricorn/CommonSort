import java.util.Arrays;

public class InsertionSort {

    public static void main(String[] args) {
        Integer[] arr = {1, 8, 6, 7, 5, 4, 3, 2, 9};
        sort(arr);
        System.out.print(Arrays.toString(arr));
    }

    private static void sort(Comparable[] arr) {
        for (int i = 1; i < arr.length; i++) {
            for (int j = i; j > 0 && arr[j].compareTo(j - 1) < 0; j--) {
                Comparable tmp = arr[j];
                arr[j] = arr[j - 1];
                arr[j - 1] = tmp;
            }
        }
    }
}
