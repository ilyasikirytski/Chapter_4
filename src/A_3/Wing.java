package A_3;

// TODO форматирование кода (пробелы, запятые и тд)
public class Wing {
    // TODO в чем смысл поля?
    boolean wings;

    public Wing(boolean wings) {
        this.wings = wings;
    }

    // TODO а нельзя просто вернуть engine??)))
    // TODO почему у Wing проверка на Wing?
    public boolean haveWings() {
        if (wings) {
            return true;
        }
        return false;
    }
}
