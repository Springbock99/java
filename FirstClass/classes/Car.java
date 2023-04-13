package FirstClass.classes;

public class Car {

    private String make;
    private String model;
    private String color;
    private int door;
    private boolean convertible;

    Car(String make, String model, String color, int door, boolean convertible) {
        this.make = make;
        this.model = model;
        this.color = color;
        this.door = door;
        this.convertible = convertible;

    }

    public void describeCar() {

        System.out
                .println(door + "-door " + color + " " + make + " " + model + " "
                        + (convertible ? "Convertible" : "not convertible"));
    }

}
