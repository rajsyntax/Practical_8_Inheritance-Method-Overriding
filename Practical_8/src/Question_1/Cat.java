package Question_1;

public class Cat extends Animal {

    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public void sound() {
        IO.println("Sound: Meow! Meow!");
    }
}
