package B_8;

public class CargoTrain extends Train {

    public CargoTrain() {
        super();
    }

    public int getCountOfPassengers() {
        return super.getCountOfPassengers();
    }

    public int getComfortLevel() {
        return super.getComfortLevel();
    }

    public int getCountOfVagon() {
        return super.getCountOfVagon();
    }

    public int getCountOfBaggage() {
        return super.getCountOfBaggage();
    }

    @Override
    public String toString() {
        String type = "CargoTrain";
        return "CargoTrain{" +
                "type='" + type + '\'' +
                ", countOfVagon=" + getCountOfVagon() +
                ", countOfBaggage=" + getCountOfBaggage() +
                ", countOfPassengers=" + getCountOfPassengers() +
                ", comfortLevel=" + getComfortLevel() +
                '}';
    }
}
