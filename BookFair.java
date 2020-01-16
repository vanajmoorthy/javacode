package Functions;

import java.util.Scanner;

public class BookFair {
    String Bname;
    double price;

    public BookFair() {
        Bname = "";
        price = 0.0;
    }

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the name of the book: ");
        Bname = sc.nextLine();
        System.out.print("Enter the price of the book: ");
        price = sc.nextDouble();
    }

    public void calculate() {
        if (price <= 1000)
            price = price * 0.98;
        else if (price > 3000)
            price = price * 0.85;
        else
            price = price * 0.9;
        System.out.println("The new price is " + price);
    }

    public static void main(String args[]) {
        BookFair b1 = new BookFair();
        b1.input();
        b1.calculate();
    }
}
