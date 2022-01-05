package A_3;

// TODO форматирование кода (пробелы, запятые и тд)
public class Plane {
    private String route;
    private Wing wing;
    private Engine engine;
    private Chassis chassis;

    // TODO через конструктор должны передаваться сразу обекты, смотри Dependency Injection
    public Plane(boolean wing, boolean engine, boolean chassis) {
        this.wing = new Wing(wing);
        this.engine = new Engine(engine);
        this.chassis = new Chassis(chassis);
    }

    public void fly(){
        if (wing.haveWings() && engine.haveEngines() && chassis.haveChassis()){
            System.out.println("Летим");
        } else {
            System.out.println("Отсутствуют необходимые для полёта компонеты");
        }
    }

    public void setRoute(String route){
        this.route = route;
    }

    public void printRoute(){
        System.out.println(this.route);
    }
}
