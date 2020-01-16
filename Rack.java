package Stack;

import java.util.Scanner;

public class Rack {
  String book[];
  String name;
  int limit;
  int top;

  public void Rack()
  {
    book[] = new String [50];
  }

  public void Rack(int nx) {
    limit = nx;
    top = -1;
  }

  public void dispList() {
    while (top != -1) {
      for (int i = 0; i <= top; i++) {
        System.out.print("BOOK " + (i + 1) + ": " + book[i]);
      }
      System.out.println();
    }
  }

  public boolean isEmpty() {
    return (top == -1);
  }

  public void putTheBook() {
    Scanner sc = new Scanner(System.in);

    while (top != (limit - 1)) {
      top++;
      System.out.print("Enter name of book: ");
      name = sc.nextInt();

      book[top] = name;
    }
  }

  public void removeTheBook() {
    while (!isEmpty) {
      book[top] = "";
      top--;
    }
  }
}
