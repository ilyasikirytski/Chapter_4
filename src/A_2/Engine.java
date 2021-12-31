package A_2;

import java.util.SortedMap;

public class Engine {
    private boolean isRefueling;

    public Engine(boolean isRefueling) {
        this.isRefueling = isRefueling;
    }

    public void isRefueling(){
        if (isRefueling){
            System.out.println("Машина заправлена");
        } else System.out.println("Нужна заправка");
    }
}
