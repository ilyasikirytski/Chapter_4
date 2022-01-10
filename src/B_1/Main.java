/*
Цветочница. Определить иерархию цветов. Создать несколько объектов-цветов.
Собрать букет (используя аксессуары) с определением его
стоимости. Провести сортировку цветов в букете на основе уровня свежести.
Найти цветок в букете, соответствующий заданному диапазону
длин стеблей.
 */

package B_1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Flowers flowers = new Flowers();
        Scanner scanner = new Scanner(System.in);
        int selection = scanner.nextInt();

        while (selection != 99) {
            System.out.println("выберите действие : " +
                    "1-добавить цветок; " +
                    "2-вывести все добавленные цветы; " +
                    "3-сортировать по длинне стебля; " +
                    "4-сортировать по уровню свежести; " +
                    "99-выйти из программы; ");
            selection = scanner.nextInt();

            switch (selection) {
                case 1: {
                    System.out.println("Введите через пробел 'Название цветка', " +
                            "'Длинну стебля - цифру', " +
                            "'уровень свежести - цифру', " +
                            "'цену' - цифру");
                    Scanner in1 = new Scanner(System.in);
                    String name = in1.next();
                    int stemLength = in1.nextInt();
                    int freshnessLevel = in1.nextInt();
                    int price = in1.nextInt();
                    flowers.addFlower(name, stemLength, freshnessLevel, price);
                    break;
                }
                case 2: {
                    flowers.printAllFlowers();
                    break;
                }
                case 3: {
                    System.out.println("Введите через пробел 'Длинну стебля От..' | 'длинну стебля до..'");
                    Scanner in3 = new Scanner(System.in);
                    int stemLengthFrom = in3.nextInt();
                    int stemLengthTo = in3.nextInt();
                    flowers.sortFlowersByStemLength(stemLengthFrom, stemLengthTo);
                    break;
                }
                case 4: {
                    System.out.println("Введите уровень свежести");
                    Scanner in4 = new Scanner(System.in);
                    int freshnessLevel = in4.nextInt();
                    flowers.sortFlowersByFreshnessLevel(freshnessLevel);
                    break;
                }
                case 99: {
                    System.out.println("Bye bye");
                    break;
                }
                default: {
                    System.out.println("Вы ввели неверный параметр");
                    break;
                }
            }
        }
    }
}
