import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = 0;
        System.out.println("Please input the range of array.");
        n = sc.nextInt();
        int arr[] = new int[n];
        
        for(int i = 0; i < n; i++) {
            System.out.println("Please input the elements of the array.");
            arr[i] = sc.nextInt();
        }
        
        System.out.println("Please input the number you're looking for.");
        int q = sc.nextInt();
        
        int lb = 0;
        int ub = n-1;
        int mid = 0;
        int flag = 0;
        
        while(lb <= ub) {
            mid = (lb + ub) / 2; 
            if(arr[mid] == q) {
                System.out.println("The number is at position " + mid);
                flag = 1;
                break;
            }
            else if(arr[mid] < q) {
                lb = mid +1;
            }
            else {
                ub = mid - 1;
            }
        }
        
        if (flag == 0) {
            System.out.println("Number not found.");
        }
    }
}