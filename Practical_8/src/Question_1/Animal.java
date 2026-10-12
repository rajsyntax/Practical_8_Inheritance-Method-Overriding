package Question_1;

public class Animal {
    protected String name;
    protected int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void displayDetails() {
        IO.println("Name: " + name);
        IO.println("Age: " + age + " years");
    }

    public void sound() {
        IO.println("Question_1.Animal makes a sound");
    }
}
