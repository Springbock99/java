package FirstClass.classes;

public class main {

    public static void main(String[] args) {

        Car car = new Car("2009", "BMW", "Black", 5, false);
        car.describeCar();
        Car fordcar = new Car("1999", "Ford", "Blue", 4, true);
        fordcar.describeCar();

    }

}
