package B_8;

import java.util.ArrayList;

public class Generic {
    public <T extends Train> int sumOfBaggage(ArrayList<T> objects) {
        int result = 0;
        for (T object : objects) {
            result += object.getCountOfPassengers();
        }
        return result;
    }
}
