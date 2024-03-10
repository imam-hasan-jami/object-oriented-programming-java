package OOP.anisulislam.Teacher;


public class Teacher {
    String name;
    String gender;
    int contactNo;

    //default constructor
    Teacher() {

    }

    //parameterized constructor
    Teacher(String name, String gender, int contactNo) {
        this.name = name;
        this.gender = gender;
        this.contactNo = contactNo;
    }

    // void setInfo(String name, String gender, int contactNo) {
    //     this.name = name;
    //     this.gender = gender;
    //     this.contactNo = contactNo;
    // }

    void printInfo() {
        System.out.println("Name : " + name);
        System.out.println("Gender : " + gender);
        System.out.println("Contact Number : " + contactNo);
        System.out.println("\n");
    }
}