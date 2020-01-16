package Functions;

import java.util.Scanner;

public class PowerNumber {
    public static int square(int a) {
        int ans;
        ans = a * a;
        return ans;
    }

    public static int cube(int a) {
        int ans;
        ans = a * a * a;
        return ans;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int z;
        System.out.println("Enter a number.");
        int x = sc.nextInt();
        System.out.println("Select an option.");
        System.out.println("1. Square \n2. Cube");
        int ch = sc.nextInt();
        if (ch == 1)
            z = square(x);
        else
            z = cube(x);
        System.out.println(z);
    }
}
