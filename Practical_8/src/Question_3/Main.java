// Parent class

class Vehicle {
    String brand;
    String model;
    int speed;

    Vehicle(String brand, String model, int speed) {
        this.brand = brand;
        this.model = model;
        this.speed = speed;
    }

    void start() {
        IO.println("Vehicle is starting...");
    }

    void displayInfo() {
        IO.println("Brand: " + brand + ", Model: " + model);
        IO.println("Speed: " + speed + " km/h");
    }
}

class Car extends Vehicle {
    Car(String brand, String model, int speed) {
        super(brand, model, speed);
    }

    @Override
    void start() {
        IO.println("Car is starting with a key ignition...");
    }

    @Override
    void displayInfo() {
        super.displayInfo();
    }
}

class Bike extends Vehicle {
    Bike(String brand, String model, int speed) {
        super(brand, model, speed);
    }

    @Override
    void start() {
        IO.println("Bike is starting with a kick start...");
    }

    @Override
    void displayInfo() {
        super.displayInfo();
    }
}

class Bus extends Vehicle {
    Bus(String brand, String model, int speed) {
        super(brand, model, speed);
    }

    @Override
    void start() {
        IO.println("Bus is starting with an automatic start...");
    }

    @Override
    void displayInfo() {
        super.displayInfo();
    }
}

void main() {
    Vehicle v;

    v = new Car("Toyota", "Camry", 120);
    IO.println("Car");
    v.displayInfo();
    v.start();

    IO.println();

    v = new Bike("Honda", "CB350", 90);
    IO.println("Bike");
    v.displayInfo();
    v.start();

    IO.println();

    v = new Bus("Volvo", "City Bus", 80);
    IO.println("Bus");
    v.displayInfo();
    v.start();
}

