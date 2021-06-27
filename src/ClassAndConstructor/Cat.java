package ClassAndConstructor;
public class Cat {
    String name;
    int age;

    public Cat(String name, int age){
this.name = name;
this.age = age;
    }

    public void printCat(){
        System.out.println(name+ " " + age);
    }
}
