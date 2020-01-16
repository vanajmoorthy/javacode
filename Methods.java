package Library;

import java.util.Scanner;

public class Methods {
    public static void input() {
        Scanner sc = new Scanner(System.in);

        System.out.println("How many books would you like to enter?");
        int numberOfBooks = sc.nextInt();

        for (int i = 0; i < numberOfBooks; i++) {
            System.out.println("What is your books name?");
            String name = sc.nextLine();

            System.out.println("What is your book's genre?");
            String genre = sc.nextLine();

            System.out.println("What is your shitty book's rating?");
            float rating = sc.nextFloat();

            Book newBook = new Book(name, genre, rating);

            System.out.println("Would you like to input another book? Press 0 if yes, 1 if no");
            int yOrN = sc.nextInt();

            System.out.println("Name: " + newBook.name);
            System.out.println("Genre: " + newBook.genre);
            System.out.println("Rating: " + newBook.rating);

            if (yOrN == 0) {
                input();
            }
        }

    }

    // Figure out the rest Myra

    public static void main(String[] args) {
        input();
    }
}
