package B_8;

public class PassengerTrain extends Train {

    public PassengerTrain() {
        super();
    }

    public int getCountOfPassengers() {
        return super.getCountOfPassengers();
    }

    public int getComfortLevel() {
        return super.getComfortLevel();
    }

    public int getCountOfWagon() {
        return super.getCountOfWagon();
    }

    public int getCountOfBaggage() {
        return super.getCountOfBaggage();
    }

    @Override
    public String toString() {
        String type = "PassengerTrain";
        return "PassengerTrain{" +
                "type='" + type + '\'' +
                ", countOfVagon=" + getCountOfWagon() +
                ", countOfBaggage=" + getCountOfBaggage() +
                ", countOfPassengers=" + getCountOfPassengers() +
                ", comfortLevel=" + getComfortLevel() +
                '}';
    }
}
