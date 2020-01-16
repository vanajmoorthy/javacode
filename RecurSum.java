import java.util.Scanner;

public class RecurSum {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter number of terms to be added: ");
    int i = sc.nextInt();

    int sum = RecurSum(i);

    System.out.print("Sum of n natural numbers is: " + sum);
  }

  public static int RecurSum(int n) {
    if (n >= 1) {
      return (n + RecurSum(n - 1));
    }

    else {
      return 0;
    }
  }
}
