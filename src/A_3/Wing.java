package A_3;

public class Wing {
    boolean wings;

    public Wing(boolean wings) {
        this.wings = wings;
    }

    public boolean haveWings() {
        if (wings) {
            return true;
        }
        return false;
    }
}
