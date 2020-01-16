package Functions;

import java.util.Scanner;

public class FactorialFN {
    public static int fact(int a) {
        int ans = 1;
        for (int i = 1; i <= a; i++)
            ans = ans * i;
        int w = ans;
        return w;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:");
        int x = sc.nextInt();
        int z = fact(x);
        System.out.println(z);
    }
}
