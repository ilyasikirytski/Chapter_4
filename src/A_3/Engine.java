package A_3;

public class Engine {
    boolean engine;

    public Engine(boolean engine) {
        this.engine = engine;
    }

    public boolean haveEngines() {
        if (engine) {
            return true;
        }
        return false;
    }
}
