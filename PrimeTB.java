package Functions;

import java.util.Scanner;

public class PrimeTB {
    public static boolean check(int a) {
        boolean ans;
        loop1: while (true) {
            loop2: for (int i = 2; i < a; i++) {
                if (a % i == 0) {
                    ans = false;
                    break loop1;
                } else
                    continue loop2;
            }
            ans = true;
            break loop1;
        }
        return ans;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int x = sc.nextInt();
        boolean printer;
        printer = check(x);
        System.out.println(printer);
    }
}
