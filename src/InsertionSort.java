import java.util.Arrays;

public class InsertionSort {

    public static void main(String[] args) {
        Integer[] arr = {1, 8, 6, 7, 5, 4, 3, 2, 9};
        sort(arr);
        System.out.print(Arrays.toString(arr));
    }

    private static void sort(Comparable[] arr) {
        int j = 0;
        for (int i = 1; i < arr.length; i++) {
            Comparable tmp = arr[i];
            for (j = i; j > 0 && tmp.compareTo(arr[j - 1]) < 0; j--) {
                arr[j] = arr[j - 1];
            }
            arr[j] = tmp;
        }
    }
}
