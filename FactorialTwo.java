import java.util.Scanner;

public class FactorialTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int input = sc.nextInt();
        int output = Factorial.fact(input);
        if (output < 0) {
            System.out.println(input);
        }
        else {
            System.out.println("Your input is too large.");
        }
        sc.close();
    }
}
