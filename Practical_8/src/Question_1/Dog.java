package Question_1;

public class Dog extends Animal {

    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void sound() {
        IO.println("Sound: Woof! Woof!");
    }
}
