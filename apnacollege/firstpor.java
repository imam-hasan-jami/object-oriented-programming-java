package OOP.apnacollege;

// class Pen {
//     String color;
//     String type;    //ballpoint, gel

//     public void write() {
//         System.out.println("Writing something.");
//     }

//     public void printColor() {
//         System.out.println(this.color);
//     }

//     public void printType() {
//         System.out.println(this.type);
//     }
// }

class Student {
    String name;
    int age;

    public void printInfo() {
        System.out.println(this.name);
        System.out.println(this.age);
    }

    // Student() {     //non parameterize constructor ||
    //                 //for non parameterize constructor, writing this is optional
    // }

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

}

public class firstpor {
    public static void main(String[] args) {
        // Pen pen1 = new Pen();
        // pen1.color = "Blue";
        // pen1.type = "Gel";

        // pen1.write();
        // pen1.printColor();
        // pen1.printType();

        // Pen pen2 = new Pen();
        // pen2.color = "Black";
        // pen2.type = "Ballpoint";

        // pen2.write();
        // pen2.printColor();
        // pen2.printType();

        // Student s1 = new Student();      // this is for non parameterize constructor
        // s1.name = "Sadi";
        // s1.age = 22;

        // s1.printInfo();

        Student s1 = new Student("Ronaldo", 39);
        s1.printInfo();
    }
}