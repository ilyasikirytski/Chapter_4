package B_8;

import java.util.ArrayList;
import java.util.Comparator;

abstract class Train {

    private final ArrayList<RailwayCarriege> carrieges = new ArrayList<>();

    public Train() {
    }

    public int getCountOfVagon() {
        return carrieges.size();
    }

    public int getCountOfBaggage() {
        int countOfBaggage = 0;
        for (RailwayCarriege carriege : carrieges) {
            countOfBaggage += carriege.getCountOfBaggage();
        }
        return countOfBaggage;
    }

    public int getCountOfPassengers() {
        int countOfPassengers = 0;
        for (RailwayCarriege carriege : carrieges) {
            countOfPassengers += carriege.getPassengersCapacity();
        }
        return countOfPassengers;
    }

    public int getComfortLevel() {
        int comfortLevel = 0;
        for (RailwayCarriege carriege : carrieges) {
            comfortLevel += carriege.getComfortLevel();
        }
        return comfortLevel;
    }

    public void addVagons(RailwayCarriege carriege) {
        this.carrieges.add(carriege);
    }

    public void sortVagonsByComfort() {
        System.out.printf("----------------------------------------%nВагоны отсортированы по уровеню комфорта :%n");
        carrieges.sort(Comparator.comparing(RailwayCarriege::getComfortLevel));
        printSort();
    }

    public void sortVagonsByPassengersCapacity() {
        System.out.printf("----------------------------------------%nВагоны отсортированы по вместительности :%n");
        carrieges.sort(Comparator.comparing(RailwayCarriege::getPassengersCapacity));
        printSort();
    }

    public void getTotalCountOfPassengers() {
        int totalCountOfPassengers = 0;
        int totalCountOfBaggage = 0;
        for (RailwayCarriege carriege : carrieges) {
            totalCountOfPassengers += carriege.getPassengersCapacity();
            totalCountOfBaggage += carriege.getCountOfBaggage();
        }
        System.out.printf("Общая чиссленность пассажиров поездa: %s и багажа: %s \n", totalCountOfPassengers, totalCountOfBaggage);
    }

    private void printSort() {
        for (RailwayCarriege carriege : carrieges) {
            System.out.println(carriege);
        }
    }
}
