package A_3;

public class Engine {
    private final int enginePower;

    public Engine(int enginePower) {
        this.enginePower = enginePower;
    }

    public boolean isWorking() {
        return true;
    }

    public int enginesInfo() {
        return enginePower;
    }
}
