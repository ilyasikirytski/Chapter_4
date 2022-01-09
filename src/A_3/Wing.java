package A_3;

public class Wing {
    private final int wingSpan;

    public Wing(int wingSpan) {
        this.wingSpan = wingSpan;
    }

    public boolean isWorking() {
        return true;
    }

    public int wingsInfo() {
        return wingSpan;
    }
}
