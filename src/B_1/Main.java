/*
Цветочница. Определить иерархию цветов. Создать несколько объектов-цветов.
Собрать букет (используя аксессуары) с определением его
стоимости. Провести сортировку цветов в букете на основе уровня свежести.
Найти цветок в букете, соответствующий заданному диапазону
длин стеблей.
 */

package B_1;

public class Main {
    public static void main(String[] args) {
        Flowers flowers = new Flowers();

        flowers.addFlower("Rose", 30, 3, 15);
        flowers.addFlower("Tulip", 30, 3, 15);
        flowers.addFlower("Rose", 10, 3, 15);
        flowers.addFlower("Knapweed", 10, 2, 2);
        flowers.addFlower("Oregano", 12, 2, 2);
        flowers.addFlower("Clower", 11, 2, 2);

        flowers.printAllFlowers();
        flowers.sortFlowersByStemLength(12, 31);
        flowers.sortFlowersByFreshnessLevel(3);
    }
}
