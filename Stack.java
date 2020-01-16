package Stack;

import java.util.*;

public class Stack {

  int stack[];
  int top = 0;
  int size = 0;

  public void initStack() {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter size of stack: ");
    size = sc.nextInt();

    stack = new int[size];
  }

  public void push(int data) {
    if (top < size) {
      stack[top] = data;
      top++;
    } else {
      System.out.println("Stack overflow. Try again.");
    }
  }

  public void peek() {
    System.out.print("Element on top of stack is " + stack[top - 1]);
  }

  public void show() {
    for (int i = 0; i < top; i++) {
      System.out.print(stack[i] + " ");
    }
  }

  public int pop() {
    if (top != 0) {
      int data;
      top--;
      data = stack[top];
      stack[top] = 0;
      return data;
    } else {
      System.out.println("Stack underflow.");
      return 0;
    }
  }

  public int size() {
    return top;
  }

  public void menuRun() {
    int flag = 0;
    Scanner sc = new Scanner(System.in);
    while (flag == 0) {
      System.out.println("1. Push \n2. Pop \n3. Get Size \n4. Peek \n5. Show \n6. Exit");
      int input = sc.nextInt();

      switch (input) {
      case 1:
        System.out.print("Value to push: ");
        push(sc.nextInt());
        break;

      case 2:
        pop();
        break;

      case 3:
        size();
        break;

      case 4:
        peek();
        break;

      case 5:
        show();
        break;

      case 6:
        flag++;
        break;

      default:
        System.out.println("Invalid Choice.");
      }
    }
  }
}
