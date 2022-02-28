package B_1;

import java.util.ArrayList;
import java.util.Collections;

public class Bouquet {
    private final ArrayList<Flower> flowers = new ArrayList<>();

    public Bouquet() {
    }

    public void addFlower(Flower flower) {
        flowers.add(flower);
    }

    public void printAllFlowers() {
        System.out.printf("----------------------------------------%nСписок всех добавленных цветов :%n");
        for (Flower g : flowers) {
            System.out.println(g);
        }
    }

    public void sortFlowersByFreshnessLevel() {
        System.out.printf("----------------------------------------%nЦветы отсортированные по уровню свежести :%n");
        Collections.sort(flowers);
        for (Flower f : flowers)
            System.out.println(f);
    }

    public void findFlowersInStemLengthRange(int stemLengthFrom, int stemLengthTo) {
        System.out.printf("----------------------------------------%nЦветы подпадающие под критерии длинны стебля :%n");
        for (Flower g : flowers) {
            if (g.getStemLength() >= stemLengthFrom && g.getStemLength() < stemLengthTo) {
                System.out.println(g);
            }
        }
    }
}
