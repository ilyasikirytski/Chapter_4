package B_8;

import java.lang.reflect.Field;
import java.util.ArrayList;

public class Generic {
    public <T extends Train> int sumOfBaggage(ArrayList<T> objects) {
        int result = 0;
        for (T object : objects) {
            result += object.getCountOfPassengers();
        }
        return result;
    }

    public <T> void sumOfBaggage2(ArrayList<T> objects) throws NoSuchFieldException, IllegalAccessException {
        int passengersCapacity = 0;
        int comfortLevel = 0;
        int countOfBaggage = 0;
        for (T object : objects) {
            Class<?> unknownClass = object.getClass();
            Class<?> parentClass = unknownClass.getSuperclass();
            Field[] fields = parentClass.getDeclaredFields();
            for (Field field : fields) {
                String fieldName = field.getName();
                Field carriagesField = parentClass.getDeclaredField(fieldName);
                carriagesField.setAccessible(true);
                ArrayList<?> arrayListOfObjects = (ArrayList<?>) carriagesField.get(object);
                for (Object obj : arrayListOfObjects) {
                    Class<?> objClass = obj.getClass();
                    Field[] objField = objClass.getDeclaredFields();
                    for (Field objInnerField : objField) {
                        objInnerField.setAccessible(true);
                        // Здесь уже сдался. Не знал как получить поля по отдельности другим способом
                        if (objInnerField.getName().equals("passengersCapacity")) {
                            passengersCapacity += (int) objInnerField.get(obj);
                        } else if (objInnerField.getName().equals("comfortLevel")) {
                            comfortLevel += (int) objInnerField.get(obj);
                        } else {
                            countOfBaggage += (int) objInnerField.get(obj);
                        }
                    }
                }
            }
        }
        System.out.printf("""
                Generic_2 - Общее число пассажиров всех поездов: %s
                Generic_2 - Сумма уровней комфорта всех поездов: %s
                Generic_2 - Общее число багажа: %s""", passengersCapacity, comfortLevel, countOfBaggage);
    }
}