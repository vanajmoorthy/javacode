import java.util.Scanner;

public class Fibonacci {
    static int fibCalc(int n) {
        return (n == 1 || n == 0) ? 1 : fibCalc(n - 1) + fibCalc(n - 2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the term you want to find: ");
        int toFind = sc.nextInt();
        System.out.println(fibCalc(toFind));
        sc.close();
    }
}
