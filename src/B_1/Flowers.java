package B_1;

import java.util.ArrayList;

public class Flowers {
    private ArrayList<GardenFlowers> gardenFlowers = new ArrayList<>();
    private ArrayList<WildFlowers> wildFlowers = new ArrayList<>();

    public Flowers() {
    }

    public void addFlower(String name, int stemLength, int freshnessLevel, int price) {
        if (stemLength > 20) {
            gardenFlowers.add(new GardenFlowers(name, stemLength, freshnessLevel, price));
        } else {
            wildFlowers.add(new WildFlowers(name, stemLength, freshnessLevel, price));
        }
    }

    public void printAllFlowers() {
        System.out.printf("----------------------------------------%nСписок всех добавленных цветов :%n");
        for (GardenFlowers g : gardenFlowers) {
            System.out.println("type " + g.getType() +
                    " name ='" + g.getName() + '\'' +
                    ", stemLength =" + g.getStemLength() +
                    ", price =" + g.getPrice() +
                    '}');
        }
        for (WildFlowers w : wildFlowers) {
            System.out.println("type " + w.getType() +
                    " name ='" + w.getName() + '\'' +
                    ", stemLength =" + w.getStemLength() +
                    ", price =" + w.getPrice() +
                    '}');
        }
    }

    public void sortFlowersByFreshnessLevel(int freshnessLevel){
        System.out.printf("----------------------------------------%nЦветы подпадающие под критерии свежести :%n");
        for (GardenFlowers g : gardenFlowers){
            if (g.getFreshnessLevel() == freshnessLevel){
                System.out.println("type " + g.getType() +
                        " name ='" + g.getName() + '\'' +
                        ", stemLength =" + g.getStemLength() +
                        ", price =" + g.getPrice() +
                        ", Freshness Level =" + g.getFreshnessLevel() +
                        '}');
            }
        }
        for (WildFlowers w : wildFlowers) {
            if (w.getFreshnessLevel() == freshnessLevel) {
                System.out.println("type " + w.getType() +
                        " name ='" + w.getName() + '\'' +
                        ", stemLength =" + w.getStemLength() +
                        ", price =" + w.getPrice() +
                        ", Freshness Level =" + w.getFreshnessLevel() +
                        '}');
            }
        }

    }

    public void sortFlowersByStemLength(int stemLengthFrom, int stemLengthTo) {
        System.out.printf("----------------------------------------%nЦветы подпадающие под критерии длинны стебля :%n");
        for (GardenFlowers g : gardenFlowers) {
            if (g.getStemLength() >= stemLengthFrom && g.getStemLength() < stemLengthTo) {
                System.out.println("type " + g.getType() +
                        " name ='" + g.getName() + '\'' +
                        ", stemLength =" + g.getStemLength() +
                        ", price =" + g.getPrice() +
                        '}');
            }
        }
        for (WildFlowers w : wildFlowers) {
            if (w.getStemLength() >= stemLengthFrom && w.getStemLength() < stemLengthTo) {
                System.out.println("type " + w.getType() +
                        " name ='" + w.getName() + '\'' +
                        ", stemLength =" + w.getStemLength() +
                        ", price =" + w.getPrice() +
                        '}');
            }
        }
    }
}
