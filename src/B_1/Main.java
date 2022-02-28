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
        Bouquet bouquet = new Bouquet();
        Scanner scanner = new Scanner(System.in);
        int selection = 0;

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
                    firstCase(scanner, bouquet);
                    break;
                }
                case 2: {
                    secondCase(bouquet);
                    break;
                }
                case 3: {
                    thirdCase(scanner, bouquet);
                    break;
                }
                case 4: {
                    fourthCase(bouquet);
                    break;
                }
                case 99: {
                    printOutOfProgram();
                    break;
                }
                default: {
                    printError();
                    break;
                }
            }
        }
    }

    public static void firstCase(Scanner scanner, Bouquet bouquet) {
        System.out.println("Введите через пробел 'Название цветка', " +
                "'Длинну стебля - цифру', " +
                "'уровень свежести - цифру', " +
                "'цену' - цифру");
        String name = scanner.next();
        int stemLength = scanner.nextInt();
        int freshnessLevel = scanner.nextInt();
        int price = scanner.nextInt();
        if (stemLength > 20) {
            bouquet.addFlower(new GardenFlower(name, stemLength, freshnessLevel, price));
        } else {
            bouquet.addFlower(new WildFlower(name, stemLength, freshnessLevel, price));
        }
    }

    public static void secondCase(Bouquet bouquet) {
        bouquet.printAllFlowers();
    }

    public static void thirdCase(Scanner scanner, Bouquet bouquet) {
        System.out.println("Введите через пробел 'Длинну стебля От..' | 'длинну стебля до..'");
        int stemLengthFrom = scanner.nextInt();
        int stemLengthTo = scanner.nextInt();
        bouquet.findFlowersInStemLengthRange(stemLengthFrom, stemLengthTo);
    }

    public static void fourthCase(Bouquet bouquet) {
        bouquet.sortFlowersByFreshnessLevel();
    }

    public static void printOutOfProgram() {
        System.out.println("Bye bye");
    }

    public static void printError() {
        System.out.println("Вы ввели неверный параметр");
    }
}
