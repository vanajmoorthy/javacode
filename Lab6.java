// ASU CSE 110 Lab 6

import java.text.DecimalFormat;
import java.util.Scanner;

public class Lab6 {
    public static void main(String[] args) {

        displayMenu();
        // declare scanner object
        Scanner scan = new Scanner(System.in);
        DecimalFormat fmt1 = new DecimalFormat("0.00");

        // variable declaration

        int choice;

        // do..while loop for menu options
        do {
            System.out.println("Enter choice: ");
            choice = scan.nextInt();
            while (choice > 4 || choice < 1) {
                System.out.println("Wrong choice! You can pick 1 to 4 only, please re-enter:  ");
                choice = scan.nextInt();
            }
            System.out.println();
            switch (choice) {
            case 1: // code for task #1
            {
                int num;
                System.out.println("Please enter number: ");
                num = scan.nextInt();
                if (checkPrime(num) == true)
                    System.out.println(num + " is prime");
                else
                    System.out.println(num + " is NOT a prime");
            }
                break;

            case 2: // code for task #2
            {
                double number;
                System.out.println("Enter the fahrenheit temperature: ");
                number = scan.nextDouble();
                System.out.println("Fahrenheit " + fmt1.format(tempConvert(number))
                        + "  degree is equivalent to Celcius " + number + " degree");
            }
                break;

            case 3: {
                String s = "";
                int ctr = 0;
                Scanner in = new Scanner(System.in);
                System.out.println("Enter a sentence ");
                s = in.nextLine();
                ctr = countE(s);
                System.out.println("The sentence contains " + ctr + " 'e' and 'E' ");
            }
                break;
            default:
                break;

            }

        } while (choice != 4);

    }

    public static void displayMenu() {
        System.out.println("1) Check a number is a prime or not.");
        System.out.println("2) Convert temperature from Fahrenheit to Celsius.");
        System.out.println("3) Count the number of character 'e' & 'E' in a string.");
        System.out.println("4) Quit.");

    }

    public static boolean checkPrime(int num) {
        boolean flag = false;
        for (int i = 2; i <= num / 2; i++) {

            if (num % i == 0) {
                flag = true;
                break;
            }

        }
        if (!flag)
            return true;
        else
            return false;

    }

    public static double tempConvert(double farenTemp) {
        return (5.0 / 9.0 * (farenTemp - 32));

    }

    public static int countE(String line) {
        int numOfE = 0; // a counter
        for (int index = 0; index < line.length(); index++) {
            if (line.charAt(index) == 'e' || line.charAt(index) == 'E')
                numOfE++;
        }
        return numOfE;
    }

}
