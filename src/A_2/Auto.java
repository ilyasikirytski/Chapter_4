package A_2;

public class Auto extends Wheel{
    private final String brand;
    Engine engine;

    public Auto(String brand , int wheels, boolean isRefueling) {
        super(wheels);
        this.brand = brand;
        engine = new Engine(isRefueling);
    }

    public void printBrand() {
        System.out.println("Марка авто - " + brand);
    }

    public void drive() {
        if (super.getCountOfWheels() == 4) {
            System.out.println("Машина едет");
        } else {
            System.out.println("Колеса должно быть 4");
        }
    }

    public void changeWheel() {
        System.out.println("Колесо поменяно!");
    }
}
