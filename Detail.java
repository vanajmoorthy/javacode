import java.util.Scanner;

public class Detail {

  String name;
  String address;
  double telno;
  double rent;
  double n;
  double amt;

  public void Detail(String name, String address, double telno, double rent) {
    this.name = name;
    this.address = address;
    this.telno = telno;
    this.rent = rent;
  }

  public void display() {
    System.out.print("Name: " + name);
    System.out.print("Address: " + address);
    System.out.print("Telephone N: " + telno);
    System.out.print("Rent: " + rent);
    System.out.println();
  }

  public void details() {
    System.out.print("Enter number of calls: ");
    n = sc.nextDouble();
  }

  public void calc() {
    if (n >= 1 && n <= 100)
      amt = rent;

    if (n >= 101 && n <= 200)
      amt = (0.6 * n) + rent;

    if (n >= 201 && n <= 300)
      amt = (0.8 * n) + rent;

    if (n >= 301)
      amt = (n) + rent;

    return amt;
  }

}
