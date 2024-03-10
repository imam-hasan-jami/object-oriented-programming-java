package OOP.anisulislam.Teacher;

public class Main {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("SADI", "MALE", 1627003189);
        // t1.setInfo("SADI", "MALE", 1627003189);

        // t1.name = "SADI";
        // t1.gender = "MALE";
        // t1.contactNo = 1627003189;

        t1.printInfo();
        // System.out.println("Name : " + t1.name);
        // System.out.println("Gender : " + t1.gender);
        // System.out.println("Contact Number : " + t1.contactNo);

        Teacher t2 = new Teacher("PRIONTI", "FEMALE", 1753936099);
        // t2.setInfo("PRIONTI", "FEMALE", 1753936099);
        t2.printInfo();

        Teacher t3 = new Teacher();
        t3.printInfo();
    }
}
