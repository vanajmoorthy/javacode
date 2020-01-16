import java.util.Scanner;

public class GCD {

  public static int hcf(int m, int n) {

    if (n != 0)
      return hcf(n, m % n);

    else
      return m;
  }

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter first number: ");
    int num1 = sc.nextInt();
    //
    System.out.print("Enter second number: ");
    int num2 = sc.nextInt();

    System.out.print(hcf(num1, num2));
  }
}
