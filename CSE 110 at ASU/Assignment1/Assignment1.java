// This is the first assignment of the CSE 150 class at Arizona State University that I did for fun.

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
        return (calculateSellingAmount(stockSellingPrice, numberOfShares) - calculateAgentCommisionOnSelling(stockSellingPrice, numberOfShares)) - (calculatePurchasingCost(stockBuyingPrice, numberOfShares) + calculateAgentCommissionOnPurchase(stockBuyingPrice, numberOfShares));
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
        System.out.println("Purchase commision:\t" + df.format(calculateAgentCommissionOnPurchase(stockBuyingPrice, numberOfShares)) + "\n");

        System.out.println("Sell price:\t" + df.format(stockSellingPrice));
        System.out.println("Sell amount:\t" + df.format(calculateSellingAmount(stockSellingPrice, numberOfShares)));
        System.out.println("Sell commision:\t" + df.format(calculateAgentCommisionOnSelling(stockSellingPrice, numberOfShares)) + "\n");

        System.out.println("Profit is\t" + df.format(calculateProfit(stockSellingPrice, numberOfShares, stockBuyingPrice)));

    }
}
    
