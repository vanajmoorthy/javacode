import java.util.Scanner;

public class PrintJob {

  int job[];
  int front;
  int rear;
  int capacity;

  public void PrintJob() {
    capacity = 20;
    front = -1;
    rear = -1;
  }

  public void createJob()
  {
    job[] = new int[capacity];
  }

  public void addJob() {
    if ((rear - front) != capacity) {
      rear++;
    } else {
      System.out.println("Printer at maximum capacity.");
    }
  }

  public void removeJob()
  {
    if ((rear != front)
    {
      front++;
    }
    else
    {
      System.out.println("There are no jobs queued up.");
    }
  }

}
