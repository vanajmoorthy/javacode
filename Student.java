package Functions;

public class Student {
    String firstName;
    String lastName;
    int adminNum;
    int grade;
    char section;

    student(String firstName, String lastName, int adminNum, int grade, char section) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.adminNum = adminNum;
        this.grade = grade;
        this.section = section;
    }

    void display() {
        System.out.println("First Name \t Last Name \t Admin No \t Grade \t Section");
        System.out.println(firstName + "\t" + lastName + "\t" + adminNum + "\t" + grade + "\t" + section);
    }

    public static void main() {
        student s1 = new student("Parth", "Sharma", 5265, 10, 'D');
        student s2 = new student("Vasu", "Aggarwal", 6278, 10, 'D');
        student s3 = new student("Vedant", "Bagadia", 5259, 10, 'E');
        student s4 = new student("Kabir", "Oberoi", 3524, 10, 'F');
        s1.display();
        s2.display();
        s3.display();
        s4.display();
    }
}
