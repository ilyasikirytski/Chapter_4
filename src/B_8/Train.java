package B_8;

import java.util.ArrayList;
import java.util.Comparator;

// TOD - почему вагоны не внутри поезда?)
// TOD - все то же что и по цветам
//  - это у тебя похоже на станцию поездов типо, а не тип жд транспорта
//
abstract class Train {
    private int countOfVagon;
    private int countOfBaggage;
    private int countOfPassengers;
    private int comfortLevel;
    private ArrayList<RailwayCarriege> carrieges = new ArrayList<>();

    public Train() {
    }

    public Train(RailwayCarriege carriege) {
        this.carrieges.add(carriege);
        this.countOfVagon += 1;
        this.countOfBaggage += carriege.getCountOfBaggage();
        this.countOfPassengers += carriege.getPassengersCapacity();
        this.comfortLevel += carriege.getComfortLevel();
    }

    public int getCountOfVagon() {
        return countOfVagon;
    }

    public int getCountOfBaggage() {
        return countOfBaggage;
    }

    public int getCountOfPassengers() {
        return countOfPassengers;
    }

    public int getComfortLevel() {
        return comfortLevel;
    }

    public void addVagons(RailwayCarriege carriege) {
        this.carrieges.add(carriege);
        this.countOfVagon += 1;
        this.countOfBaggage += carriege.getCountOfBaggage();
        this.countOfPassengers += carriege.getPassengersCapacity();
        this.comfortLevel += carriege.getComfortLevel();
    }

    public void sortVagonsByComfort() {
        System.out.printf("----------------------------------------%nВагоны отсортированы по уровеню комфорта :%n");
        carrieges.sort(Comparator.comparing(RailwayCarriege::getComfortLevel));
        printSort();
    }

    public void sortVagonsByPassengersCapacity() {
        System.out.printf("----------------------------------------%nВагоны подпадающие под указанную вместительность :%n");
        carrieges.sort(Comparator.comparing(RailwayCarriege::getPassengersCapacity));
        printSort();
    }

    public void getTotalCountOfPassengers() {
        int totalCountOfPassengers = 0;
        int totalCountOfBaggage = 0;
        for (RailwayCarriege carriege : carrieges){
            totalCountOfPassengers += carriege.getPassengersCapacity();
            totalCountOfBaggage += carriege.getCountOfBaggage();
        }
        System.out.printf("Общая чиссленность пассажиров поездa: %s и багажа: %s \n", totalCountOfPassengers, totalCountOfBaggage);
    }

    public void printSort() {
        for (RailwayCarriege carriege : carrieges) {
            System.out.println(carriege);
        }
    }
}
