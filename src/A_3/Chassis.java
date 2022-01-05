package A_3;

// TODO форматирование кода (пробелы, запятые и тд)
public class Chassis {
    // TODO в чем смысл поля?
    private boolean chassis;

    public Chassis(boolean chassis) {
        this.chassis = chassis;
    }

    // TODO а нельзя просто вернуть chassis??)))
    // TODO почему у Chassis проверка на Chassis?
    public boolean haveChassis() {
        if (chassis) {
            return true;
        }
        return false;
    }
}
