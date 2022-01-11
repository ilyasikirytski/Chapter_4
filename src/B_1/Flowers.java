package B_1;

import java.util.ArrayList;

// TODO - название должно быть как букет,
//  - класс цветок сделать отдельно,
//  - наследование от цветка одного, а не от букета
public class Flowers {
    // TODO - убрать два списка, в букете не нужен список для каждого вида цвета, получается дублирование
    //  кода и никакого использования
    private ArrayList<GardenFlowers> gardenFlowers = new ArrayList<>();
    private ArrayList<WildFlowers> wildFlowers = new ArrayList<>();

    public Flowers() {
    }

    // TODO - убрать создание класса прямо в методе, у тебя очень часто такое используется,
    //  добавление должно быть именно цветка, а не его параметров (нарушение принципа Dependency inversion)
    //  - убрать проверку на длину, она если и должна быть только только при создании цветка в его конструкторе
    public void addFlower(String name, int stemLength, int freshnessLevel, int price) {
        if (stemLength > 20) {
            gardenFlowers.add(new GardenFlowers(name, stemLength, freshnessLevel, price));
        } else {
            wildFlowers.add(new WildFlowers(name, stemLength, freshnessLevel, price));
        }
    }

    // TODO убрать дублирование кода (должно исчезнуть при правильном использовании наследования и если
    //  уберешь два списка для каждого типа цветка)
    public void printAllFlowers() {
        System.out.printf("----------------------------------------%nСписок всех добавленных цветов :%n");
        for (GardenFlowers g : gardenFlowers) {
            System.out.println(g);
        }
        for (WildFlowers w : wildFlowers) {
            System.out.println(w);
        }
    }

    // TODO убрать дублирование кода (должно исчезнуть при правильном использовании наследования и если
    //  уберешь два списка для каждого типа цветка)
    //  - сортировка? тут же фильтр? то есть либо метод назван неверно либо делает не то
    public void sortFlowersByFreshnessLevel(int freshnessLevel) {
        System.out.printf("----------------------------------------%nЦветы подпадающие под критерии свежести :%n");
        for (GardenFlowers g : gardenFlowers) {
            if (g.getFreshnessLevel() == freshnessLevel) {
                System.out.println(g);
            }
        }
        for (WildFlowers w : wildFlowers) {
            if (w.getFreshnessLevel() == freshnessLevel) {
                System.out.println(w);
            }
        }

    }

    // TODO - убрать дублирование кода (должно исчезнуть при правильном использовании наследования и если
    //  уберешь два списка для каждого типа цветка)
    //  - сортировка? тут же фильтр? то есть либо метод назван неверно либо делает не то
    public void sortFlowersByStemLength(int stemLengthFrom, int stemLengthTo) {
        System.out.printf("----------------------------------------%nЦветы подпадающие под критерии длинны стебля :%n");
        for (GardenFlowers g : gardenFlowers) {
            if (g.getStemLength() >= stemLengthFrom && g.getStemLength() < stemLengthTo) {
                System.out.println(g);
            }
        }
        for (WildFlowers w : wildFlowers) {
            if (w.getStemLength() >= stemLengthFrom && w.getStemLength() < stemLengthTo) {
                System.out.println(w);
            }
        }
    }
}
