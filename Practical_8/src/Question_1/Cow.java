package Question_1;

public class Cow extends Animal {

    public Cow(String name, int age) {
        super(name, age);
    }

    @Override
    public void sound() {
        IO.println("Sound: Moo! Moo!");
    }
}
