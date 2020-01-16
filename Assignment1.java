// Assignment 1

// What this Assignment Is About:

// Familiarization with basic data types
// Know how to declare variables & constants
// Using the Scanner Class to get various inputs
// Learn to write simple arithematic expression
// Using the escape sequence to align the output
// Using DecimalFormat class to format the output (*Study our sample code CircleArea.java)
// Coding Guidelines for All Labs/Assignments (You will be graded on this)

// Give identifiers semantic meaning and make them easy to read (examples numStudents, grossPay, etc).
// Keep identifiers to a reasonably short length.
// Use upper case for constants. Use title case (first letter is upper case) for classes. Use lower case with uppercase word separators for all other identifiers (variables, methods, objects).
// Use tabs or spaces to indent code within blocks (code surrounded by braces). This includes classes, methods, and code associated with ifs, switches and loops. Be consistent with the number of spaces or tabs that you use to indent.
// Use white space to make your program more readable.
// Use comments properly before or after the ending brace of classes, methods, and blocks to identify to which block it belongs.
// 1. Assignment Description

//  Write a stock transaction program that calculates a customer's profit (or loss) within a certain period of time.

// 1) First, the program need to get user's name, the stock's code, number of shares and the price he/she purchased the stock, it also asks the user for the price he/she sold the stock later on. The program then compute the following:

// The amount of money the customer paid for the stock.

// The amount of commission the customer paid when he/she bought the stock

// The amount that the cusotmer sold the stock for.

// The amount of commission the customer paid his broker when he sold the stock

// The amount of profit or loss that the customer had after selling his stock and paying both buy & sell commissions.

//  See below for the sample run of the program.

// 2) Assume for both buying or selling the stock, the agent charges 2% of the total amount from customer. (Hint: this should be declared as a constant)

// 3) Your program also need to meet the specifications stated below:

// For the input and output, the exact spacing is not necessary, but what's important is that your program's output looks good and the columns align, i.e. your program's output should be very similar to our sample output. You should consider using escape sequence such as \t, \n to achieve this.

// Pick and use identifiers which are self-descriptive. One-letter variable names should not be used. As an example, if you were referring to the stock's purchasing price, the variable needed might be declared  as double purchasePrice; instead of double x;

// All ouput price and amounts should be formatted as currency by using DecimalFormat class.

// Depends on whether the profit is postivie or negative, your program should display different messages on screen, see our two output test cases for this. To achieve this, you will need to use simple if..else statement. Check Lab #2 if you don't know how to do this.  

//  As we stated before, make sure for each assignment, you put the following comment block on top of the file:

// 2. Sample Run

// Note: User input is in bold.

// Enter Your Name: John Smith

// Enter the stock code you bought: APPL

// At what price did you buy it: 176.42

// How many shares did you buy: 100

// At what price did you sell it: 208.8

// *** Stock Transaction Report ****
// Customer Name:         John Smith
// Stock Code:            APPL

// Number of Shares:      100
// Purchase Price:        $176.42
// Purchase Amt:          $17642.00
// Purchase Commission:   $352.84

// Sell Price:            $208.80
// Sell Amt:              $20880.00
// Sell Commission:       $417.60

// Profit is:             $2467.56

// 3. Submission

// 1) Test your program by using the inputs from the following two input test cases, compare your program's output with our solution output, make sure they are same before you submit the source file Assignment1.java.

// 2) Read this short description on how to use test cases for your lab or assignments. Starting from now on, you will need to comment out user prompt for all Labs and Assignments.

// 3) Submit Assignment1.java at the following submission website.

//        www.gradescope.com

// For this assignment, you just need to submit Assignment1.java file, be careful, Java file name is case sensative,  (and NOT the Assignment1.class file)
// Click here to see instructions on how to submit labs and assignments on gradescope.com
// After you successfully submit your file, a screen will show up displaying if your program compiles  and what your output is when run on the two input test cases.
// It's your responsibility to make sure that you submitted the correct file on server. After the deadline, we will not accept submissions through emails!
// 4. Grading Rubric (20 pts)

// a.   Student submits the relevant source code files, whether the program compiles and/or runs correctly or not. [2 pts]

// b.   Student pick descriptive variables' name and declared constant(s) inside the program [2 pts]

// c.    Student put proper comments inside the program and the program is easy to read [2 pts]

// d.   Student use \n and \t properly format the program's outputs according to the test cases [4 pt]

// e.   The program student submitted compiles, runs, and produces the correct output for the two test cases [10 pts]

import java.util.Scanner;
import java.text.DecimalFormat;

public class Assignment1 {
    static final int AGENT_PERCENT = 2;

    static float calculatePurchasingCost(float stockBuyingPrice, int numberOfShares) {
        float totalPurchasingCost = stockBuyingPrice * numberOfShares;
        return totalPurchasingCost;
    }

    static float calculateSellingAmount(float stockSellingPrice, int numberOfShares) {
        float totalSellingAmount = stockSellingPrice * numberOfShares;
        return totalSellingAmount;
    }

    static float calculateAgentCommissionOnPurchase(float stockBuyingPrice, int numberOfShares) {
        float percentage = ((stockBuyingPrice / numberOfShares) * AGENT_PERCENT) * 100;
        return percentage;
    }

    static float calculateAgentCommisionOnSelling(float stockSellingPrice, int numberOfShares) {
        float percentage = ((stockSellingPrice / numberOfShares) * AGENT_PERCENT) * 100;
        return percentage;
    }

    static float calculateProfit(float stockSellingPrice, int numberOfShares, float stockBuyingPrice) {
        return (calculateSellingAmount(stockSellingPrice, numberOfShares)
                - calculateAgentCommisionOnSelling(stockSellingPrice, numberOfShares))
                - (calculatePurchasingCost(stockBuyingPrice, numberOfShares)
                        + calculateAgentCommissionOnPurchase(stockBuyingPrice, numberOfShares));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        System.out.println(" ");

        System.out.print("Enter the stock code you bought: ");
        String stockCode = sc.next();
        System.out.println(" ");

        System.out.print("At what price did you buy it: ");
        float stockBuyingPrice = sc.nextFloat();
        System.out.println(" ");

        System.out.print("How many shares did you buy: ");
        int numberOfShares = sc.nextInt();
        System.out.println(" ");

        System.out.print("At what price did you sell: ");
        float stockSellingPrice = sc.nextFloat();
        System.out.println(" ");

        DecimalFormat df = new DecimalFormat("###,###.##");

        System.out.println("Customer name:\t" + name);
        System.out.println("Stock code:\t" + stockCode + "\n");

        System.out.println("Number of shares:\t" + numberOfShares);
        System.out.println("Purchase price:\t" + df.format(stockBuyingPrice));
        System.out.println("Purchase amount:\t" + df.format(calculatePurchasingCost(stockBuyingPrice, numberOfShares)));
        System.out.println("Purchase commision:\t"
                + df.format(calculateAgentCommissionOnPurchase(stockBuyingPrice, numberOfShares)) + "\n");

        System.out.println("Sell price:\t" + df.format(stockSellingPrice));
        System.out.println("Sell amount:\t" + df.format(calculateSellingAmount(stockSellingPrice, numberOfShares)));
        System.out.println("Sell commision:\t"
                + df.format(calculateAgentCommisionOnSelling(stockSellingPrice, numberOfShares)) + "\n");

        System.out.println(
                "Profit is\t" + df.format(calculateProfit(stockSellingPrice, numberOfShares, stockBuyingPrice)));

    }
}
