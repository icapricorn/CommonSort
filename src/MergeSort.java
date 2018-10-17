import java.util.Arrays;

public class MergeSort {

    public static void main(String[] args) {
        Integer[] arr = {9, 8, 7, 6, 5, 4, 3, 2, 1};
        sort(arr);
        System.out.print(Arrays.toString(arr));
    }

    private static void sort(Comparable[] arr) {
        mergeSort(arr, 0, arr.length);
    }

    private static void mergeSort(Comparable[] arr, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;
            mergeSort(arr, 0, mid);
            mergeSort(arr, mid + 1, right);
            merge(arr, 0, mid, right);
        }
    }

    private static void merge(Comparable[] arr, int left, int mid, int right) {
        int x = left;
        int y = mid + 1;
        int z = 0;
        Comparable[] tmpArr = new Comparable[arr.length];

        while (x <= mid && y <= right) {
            tmpArr[z++] = arr[x].compareTo(arr[y]) < 0 ? arr[x++] : arr[y++];
        }

        while (x <= mid) {
            tmpArr[z++] = arr[x++];
        }

        while (y <= right) {
            tmpArr[z++] = arr[y++];
        }

        for (int i = 0; i < tmpArr.length; i++) {
            arr[i + left] = tmpArr[i];
        }
    }
}
