package Functions;

import java.util.Scanner;

public class Square {
    Scanner sc = new Scanner(System.in);
    int size;

    public void Square(int size) {
        size = this.size;
    }

    int x[] = new int[size];

    public void readList() {
        for (int i = 0; i < size; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            x[i] = sc.nextInt();
        }
    }

    public void doSquare(Square a) {
        for (int i = 0; i < size; i++) {
            int num = x[i];
            x[i] = num * num;
        }
    }

    public void display() {
        for (int i = 0; i < size; i++) {
            System.out.print(x[i] + " ");
        }
    }

}
