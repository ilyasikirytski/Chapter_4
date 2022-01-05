package A_3;

// TODO форматирование кода (пробелы, запятые и тд)
public class Engine {
    // TODO в чем смысл поля?
    boolean engine;

    public Engine(boolean engine) {
        this.engine = engine;
    }

    // TODO а нельзя просто вернуть engine??)))
    // TODO почему у двигателя проверка на двигатель?
    public boolean haveEngines() {
        if (engine) {
            return true;
        }
        return false;
    }
}
