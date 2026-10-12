package Question_1;

public class Main {

    public static void main(String[] args) {

        Animal[] animals = {
                new Dog("Bruno", 3),
                new Cat("Whiskers", 2),
                new Cow("Gauri", 5)
        };

        for (Animal animal : animals) {
            IO.println(animal.getClass().getSimpleName());
            animal.displayDetails();
            animal.sound();
            IO.println();
        }
    }
}
