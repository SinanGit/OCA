package Class;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();
        s1.setName("Sinan");
        s1.setGrade(3);
        s1.setFee(300);
        s1.setRegistered(true);
       // s1.printInfo();


        s2.setName("Arzu");
        s2.setGrade(12);
        s2.setFee(500);
        s2.setRegistered(true);
        s2.printInfo();

    }
}
