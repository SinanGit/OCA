package Class;

public class Student {
   private String name;
    private int grade;
    private int fee;
   private boolean registered;

// 1. dikdortgen class olustur
    // en ve boy int olustur;
    // getter ve setter olustur
    // alan hesaplama en * boy

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public int getFee() {
        return fee;
    }

    public void setFee(int fee) {
        this.fee = fee;
    }

    public boolean isRegistered() {
        return registered;
    }

    public void setRegistered(boolean registered) {
        this.registered = registered;
    }

    public Student(){

    }
    public Student(String name, int grade){
        this.name = name;
        this.grade = grade;
    }
    public void printInfo(){
        if (registered){
            System.out.println("Name: " + name + " Grade: " + grade+ " Registered: " + registered);
        }else {
            System.out.println("This student is not registered");
        }
        }

}

