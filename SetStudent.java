package Functions;

public class SetStudent {
    String firstName;
    String lastName;
    int adminNum;
    int grade;
    char section;

    public void display() {
        System.out.println("Name \t Admn No. \t Grade \t Section");
        System.out.println(firstName + " " + lastName + "\t" + adminNum + "\t" + grade + "\t" + section);
    }

    public static void main(String args[]) {
        student s1 = new student("Parth", "Sharma", 5265, 10, 'D');
        s1.display();
    }
}
