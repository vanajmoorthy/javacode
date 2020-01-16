
public class Queue {
  int size;
  int front;
  int rear;
  int queue[];
  int cap;

  public void menuRun() {
    int flag = 0;

    while (flag == 0) {
      System.out.println("1. Add Element \n2. Delete Element \n3. Size and Capacity \n4. Show Queue \n5. Exit");
      int input = sc.nextInt();

      switch (input) {
      case 1:
        queue.enQueue();
        break;

      case 2:
        queue.deQueue();
        break;

      case 3:
        queue.size();
        if (queue.isFull) {
          System.out.println("Queue is full.");
        } else if (queue.isEmpty) {
          System.out.println("Queue is empty.");
        } else {
          System.out.println("Queue is neither empty nor full.");
        }
        break;

      case 4:
        queue.show();
        break;

      case 5:
        flag++;
        break;

      default:
        System.out.println("Invalid Choice.");

      }
    }
  }

  public void initQueue() {
    System.out.print("Enter size of queue: ");
    cap = sc.nextInt();

    queue = new int[cap];
  }

  public void enQueue(int data) {

    if (isFull) {
      System.out.println("Queue is full.");
    }

    else {
      queue[rear] = data;
      rear = (rear + 1) % 5;
      size = size + 1;
    }

  }

  public int deQueue() {

    if (isEmpty) {
      System.out.println("Queue is empty.");
    }

    else {
      int data = queue[front];
      front = (front + 1) % 5;
      size = size - 1;
    }

  }

  public boolean isFull() {
    return (size == cap);
  }

  public boolean isEmpty() {
    return (size == 0);
  }

  public int size() {
    return size;
  }

  public void show() {
    System.out.print("Elements are: ");

    for (int i = 0; i < size; i++) {
      System.out.print(queue[(front + i) % 5] + " ");
    }

  }
}
