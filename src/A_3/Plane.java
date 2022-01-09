package A_3;

public class Plane {
    private String route;
    private Wing wing;
    private Engine engine;
    private Chassis chassis;

    public Plane(Wing wing, Engine engine, Chassis chassis) {
        this.wing = wing;
        this.engine = engine;
        this.chassis = chassis;
    }

    public boolean flyCheck() {
        if (wing.isWorking() && engine.isWorking() && chassis.isWorking()) {
            System.out.println("Проверка пройдена!");
            return true;
        } else {
            System.out.println("Проверка не пройдена");
            return false;
        }
    }

    public void fly() {
        if (flyCheck()) {
            System.out.println("Летим");
        }
    }

    public void setRoute(String route) {
        this.route = route;
    }

    public void printRoute() {
        System.out.println(this.route);
    }

    public void getPlaneInfo() {
        System.out.printf("----------------------------%n" +
                "Характеристики самолёта: %n" +
                "Тип шасси: %s%n" +
                "Мощность двигателей: %s%n" +
                "Размах крыльев: %s", chassis.chassisInfo(), engine.enginesInfo(), wing.wingsInfo());
    }
}
