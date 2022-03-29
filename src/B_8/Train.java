package B_8;

import java.util.*;

abstract class Train {

    private final ArrayList<RailwayCarriege> carriages = new ArrayList<>();

    public Train() {
    }

    public int getCountOfWagon() {
        return carriages.size();
    }

    public int getCountOfBaggage() {
        return Collections.sumBy(carriages, RailwayCarriege::getCountOfBaggage);
    }

    public int getCountOfPassengers() {
        return Collections.sumBy(carriages, RailwayCarriege::getPassengersCapacity);
    }

    public int getComfortLevel() {
        return Collections.sumBy(carriages, RailwayCarriege::getComfortLevel);
    }

    public void addVagons(RailwayCarriege carriege) {
        this.carriages.add(carriege);
    }

    public void sortVagonsByComfort() {
        System.out.printf("----------------------------------------%nВагоны отсортированы по уровеню комфорта :%n");
        carriages.sort(Comparator.comparing(RailwayCarriege::getComfortLevel));
        printSort();
    }

    public void sortVagonsByPassengersCapacity() {
        System.out.printf("----------------------------------------%nВагоны отсортированы по вместительности :%n");
        carriages.sort(Comparator.comparing(RailwayCarriege::getPassengersCapacity));
        printSort();
    }

    public void printTotalCountOfPassengers() {
        System.out.printf("Общая чиссленность пассажиров поездa: %s и багажа: %s \n", getCountOfPassengers(), getCountOfBaggage());
    }

    private void printSort() {
        for (RailwayCarriege carriege : carriages) {
            System.out.println(carriege);
        }
    }

}
