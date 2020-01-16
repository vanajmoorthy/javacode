package Functions;

import java.util.Scanner;

public class SimpleCalculator {
    int x = 0;
    int y = 0;

    public void input() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the two numbers.");
        x = sc.nextInt();
        y = sc.nextInt();
    }

    public int add() {
        int ans = x + y;
        return ans;
    }

    public int sbt() {
        int ans = x - y;
        return ans;
    }

    public int mlt() {
        int ans = x * y;
        return ans;
    }

    public int div() {
        int ans = x / y;
        return ans;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int z = 0;
        simpleCalculator c = new simpleCalculator();
        c.input();
        System.out.println("What would you like to do?");
        System.out.print("1. Addition\n2. Subtraction");
        System.out.println("\n3. Multiplication \n4. Division");
        int ch = sc.nextInt();
        if (ch == 1)
            System.out.println(c.add());
        else if (ch == 2)
            System.out.println(c.sbt());
        else if (ch == 3)
            System.out.println(c.mlt());
        else
            System.out.println(c.div());
    }
}
