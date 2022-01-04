package B_8;

public class CargoTrain extends RailwayTransport {
    private String type = "CargoTrain";
    private int countOfVagon;
    private int countOfBaggage;
    private int countOfPassengers;
    private int comfortLevel;

    public CargoTrain(int countOfVagon, int comfortLevel, int countOfPassengers, int countOfBaggage) {
        this.countOfPassengers = countOfPassengers;
        this.comfortLevel = comfortLevel;
        this.countOfVagon = countOfVagon;
        this.countOfBaggage = countOfBaggage;
    }

    public int getCountOfPassengers() {
        return countOfPassengers;
    }

    public int getComfortLevel() {
        return comfortLevel;
    }

    public String getType() {
        return type;
    }

    public int getCountOfVagon() {
        return countOfVagon;
    }

    public int getCountOfBaggage() {
        return countOfBaggage;
    }

    @Override
    public String toString() {
        return "CargoTrain{" +
                "type='" + type + '\'' +
                ", countOfVagon=" + countOfVagon +
                ", countOfBaggage=" + countOfBaggage +
                ", countOfPassengers=" + countOfPassengers +
                ", comfortLevel=" + comfortLevel +
                '}';
    }
}
