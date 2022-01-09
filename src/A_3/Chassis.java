package A_3;

public class Chassis {
    private final String chassisType;

    public Chassis(String chassisType) {
        this.chassisType = chassisType;
    }

    public boolean isWorking() {
        return true;
    }

    public String chassisInfo() {
        return chassisType;
    }
}
