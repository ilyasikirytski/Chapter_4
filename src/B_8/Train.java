package B_8;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.function.Function;

import static B_8.TypesOfSort.COMFORT_LEVEL;

abstract class Train {

    private final ArrayList<RailwayCarriege> carriages = new ArrayList<>();

    public Train() {
    }

    public int getCountOfWagon() {
        return carriages.size();
    }


    // лямбды почитать написать разобраться
    public int getCountOfBaggage() {
        return Collections.sumBy(carriages, (RailwayCarriege carriege) -> {
            return carriege.getComfortLevel();
        });
    }

    public int getCountOfPassengers() {
        return Collections.sumBy(carriages, RailwayCarriege::getPassengersCapacity);
    }

    public int getComfortLevel() {
        return Collections.sumBy(carriages, new Function<RailwayCarriege, Integer>() {
            @Override
            public Integer apply(RailwayCarriege carriege) {
                return carriege.getComfortLevel();
            }
        });
    }

    public void addVagons(RailwayCarriege carriege) {
        this.carriages.add(carriege);
    }

    /*
    переделать comparing на лямбду, как в примере жени
    вынести Sort в третий метод
     */
    // а если я хочу видоизменить метод, что было
    // Collection.myComparator(carriages, RailwayCarriege::getComfortLevel);
    public void sortVagonsBy(TypesOfSort type) {
        if (type == COMFORT_LEVEL) {
            System.out.printf("----------------------------------------%nВагоны отсортированы по уровеню комфорта :%n");
//            carriages.sort(Comparator.comparing(RailwayCarriege::getComfortLevel));
//            carriages.sort(Collections.myComparator(RailwayCarriege::getComfortLevel));
            Collections.mySort(carriages, RailwayCarriege::getComfortLevel);
        } else {
            System.out.printf("----------------------------------------%nВагоны отсортированы по вместительности :%n");
            Collections.mySort(carriages, RailwayCarriege::getPassengersCapacity);
        }
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
