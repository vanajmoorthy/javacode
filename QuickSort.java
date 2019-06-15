import java.util.Arrays;
import java.util.Scanner;

public class QuickSort {
    static int[] setArray() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please input the length of your array: ");
        int len = sc.nextInt();
        int[] arr = new int[len];

        for (int i = 0; i < len; i++) {
            System.out.print("Please input the next element of your array: ");
            arr[i] = sc.nextInt();
        }
        sc.close();
        return arr;
    }

    static void quickSort(int[] arr, int left, int right) {
        if (left >= right) return;
        int q = partition(arr, left, right);
        quickSort(arr, left, q - 1);
        quickSort(arr, q + 1, right);
    }

    static int partition(int[] arr, int l, int r) {
        int wall = l;

        for (int i = l; i <= r; i++) {
            int currVal = arr[i];
            if (currVal <= arr[r]) {
                arr[i] = arr[wall];
                arr[wall++] = currVal;
            }
        }
        return wall;
    }

    static void display(int[] arr) {
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args) {
        int[] myArr = setArray();
        quickSort(myArr, 0, myArr.length - 1);
        display(myArr);
    }
}