package B_8;

// TODO - все то же что и по цветам
public class PassengerTrain extends RailwayTransport {
    private String type = "PassengerTrain";
    private int countOfVagon;
    private int countOfBaggage;
    private int countOfPassengers;
    private int comfortLevel;

    public PassengerTrain(int countOfVagon, int comfortLevel, int countOfPassengers, int countOfBaggage) {
        this.countOfPassengers = countOfPassengers;
        this.comfortLevel = comfortLevel;
        this.countOfVagon = countOfVagon;
        this.countOfBaggage = countOfBaggage;
    }

    public int getComfortLevel() {
        return comfortLevel;
    }

    public int getCountOfPassengers() {
        return countOfPassengers;
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
        return "PassengerTrain{" +
                "type='" + type + '\'' +
                ", countOfVagon=" + countOfVagon +
                ", countOfBaggage=" + countOfBaggage +
                ", countOfPassengers=" + countOfPassengers +
                ", comfortLevel=" + comfortLevel +
                '}';
    }
}
