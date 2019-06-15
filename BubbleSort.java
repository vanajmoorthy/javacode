import java.util.*;

public class BubbleSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Please input the range of array.");
        int n = sc.nextInt();
        int arrSort[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Please input the elements of the array.");
            arrSort[i] = sc.nextInt();
        }
        
        // Arrays.sort(arrSort);

        for (int q = 0; q < n; q++) {
            for (int j = 0; j < (n - 1); j++) {
                if (arrSort[j] > arrSort[j + 1]) {
                    int temp = arrSort[j];
                    arrSort[j] = arrSort[j + 1];
                    arrSort[j + 1] = temp; 
                }
            }
        } 
        System.out.println(Arrays.toString(arrSort));
    }
}