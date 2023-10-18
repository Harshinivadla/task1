import java.util.Scanner;

public class task3 {
    public static void mergeSort(int[] arr) {
        if (arr == null || arr.length <= 1) {
            return; // The array is already sorted
        }

        int middle = arr.length / 2;
        int[] left = new int[middle];
        int[] right = new int[arr.length - middle];

        // Divide the array into two halves
        for (int i = 0; i < middle; i++) {
            left[i] = arr[i];
        }
        for (int i = middle; i < arr.length; i++) {
            right[i - middle] = arr[i];
        }

        // Recursively sort both halves
        mergeSort(left);
        mergeSort(right);

        // Merge the sorted halves
        merge(arr, left, right);
    }

    private static void merge(int[] arr, int[] left, int[] right) {
        int i = 0, j = 0, k = 0;

        while (i < left.length && j < right.length) {
            if (left[i] < right[j]) {
                arr[k] = left[i];
                i++;
            } else {
                arr[k] = right[j];
                j++;
            }
            k++;
        }

        while (i < left.length) {
            arr[k] = left[i];
            i++;
            k++;
        }

        while (j < right.length) {
            arr[k] = right[j];
            j++;
            k++;
        }
    }

    public static void main(String[] args) {
        //int[] arr = {12, 11, 13, 5, 6, 7};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size ");
        int size = sc.nextInt();
        System.out.println("Enter the array elements: ");
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        mergeSort(arr);

        System.out.println("Sorted array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}