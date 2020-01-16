package Functions;

class Patient {
    String name;
    int age;
    int time;
    int id;

    patient(String name, int age, int time, int id) {
        this.name = name;
        this.age = age;
        this.time = time;
        this.id = id;
    }

    void display() {
        System.out.println(name + "  " + id + "  " + age + "yrs  " + time + "days ");
    }

    public static void main(String args[]) {
        patient p1 = new patient("Ram Prakash", 54, 12, 122005);
        patient p2 = new patient("Mani Joshi", 48, 3, 14409);
        patient p3 = new patient("Hari Prasad", 24, 97, 1920382);
        p1.display();
        p2.display();
        p3.display();
    }
}
