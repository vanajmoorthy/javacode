package Functions;

class Student11 {
    int id;
    String name;

    Student11(int id, String name) {
        this.id = id;
        this.name = name;
    }

    void display() {
        System.out.println(name + " has roll number " + id);
    }

    public static void main(String args[]) {
        Student11 s1 = new Student11(5265, "Parth Sharma");
        Student11 s2 = new Student11(4433, "Vasu Aggarwal");
        s1.display();
        s2.display();
    }
}
