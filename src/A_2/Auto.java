package A_2;

// TODO форматирование кода (пробелы, запятые и тд)
// TODO убрать наследование между колесом и машиной, колеса внутри машины как и двигатель
public class Auto extends Wheel{
    private final String brand;
    // TODO private? у машины метод заправлена или нет - инкапсуляция
    Engine engine;

    // TODO двигатель должен передаваться через конструктор, смотри Dependency Injection
    public Auto(String brand , int wheels, boolean isRefueling) {
        super(wheels);
        this.brand = brand;
        engine = new Engine(isRefueling);
    }

    public void printBrand() {
        System.out.println("Марка авто - " + brand);
    }

    // TODO убрать проверку на количество колес
    public void drive() {
        if (super.getCountOfWheels() == 4) {
            System.out.println("Машина едет");
        } else {
            System.out.println("Колеса должно быть 4");
        }
    }

    // TODO передать колесо в качестве параметра метода, поменять колесо внутри машины (поле) на это
    public void changeWheel() {
        System.out.println("Колесо поменяно!");
    }
}
