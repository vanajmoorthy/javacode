package Functions;

import java.util.Scanner;

public class AreaPeriRect {
    public static int area(int a, int b) {
        int ans;
        ans = a * b;
        return ans;
    }

    public static int peri(int a, int b) {
        int ans;
        ans = 2 * (a + b);
        return ans;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int z;
        System.out.println("Enter the length and breadth.");
        int l = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("What function would you like to use?");
        System.out.println("1. Area \n2. Perimeter");
        int ch = sc.nextInt();
        if (ch == 1)
            z = area(l, b);
        else
            z = peri(l, b);
        System.out.println(z);
    }
}
