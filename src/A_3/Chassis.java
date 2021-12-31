package A_3;

public class Chassis {
    private boolean chassis;

    public Chassis(boolean chassis) {
        this.chassis = chassis;
    }

    public boolean haveChassis() {
        if (chassis) {
            return true;
        }
        return false;
    }
}
