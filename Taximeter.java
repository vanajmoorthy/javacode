package Functions;

import java.util.Scanner;

public class Taximeter {
    int taxino;
    String name;
    int km;
    double bill;

    void taximeter() {
        taxino = 0;
        name = "";
        km = 0;
    }

    void input() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the taxi no: ");
        taxino = sc.nextInt();

        sc.nextLine();

        System.out.print("Enter the passenger name: ");
        name = sc.nextLine();

        System.out.print("Enter distance(km): ");
        km = sc.nextInt();
    }

    void calculate() {
        double bill;

        if (km <= 1)
            bill = km * 25;
        else if (km > 1 && km <= 6)
            bill = km * 10;
        else if (km > 6 && km <= 12)
            bill = km * 15;
        else if (km > 12 && km <= 18)
            bill = km * 20;

        else
            bill = km * 25;

        this.bill = bill;
    }

    void display() {
        System.out.println("Taxi N \t Name \t KM \t Bill");
        System.out.println(taxino + "\t" + name + "\t" + km + "\t" + bill);
    }

    public static void main(String args[]) {
        taximeter t1 = new taximeter();
        t1.taximeter();
        t1.input();
        t1.calculate();
        t1.display();
    }
}

/*
 * SOURCE QUESTION APPEND http://www.cisce.org/pdf/
 * ICSE-Class-X-Specimen-Question-Papers-2017/ Computer%20Applications.pdf
 * 
 * 
 * 
 * Input: 5265, Parth, 10 Output: 5265, Parth, 10, 150.0
 * 
 * .*., program is functional
 */
