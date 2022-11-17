package lesson1;

public class Homework1 {

        public static void main (String[] args) {

            printThreeWords();

            checkSumSign();

            printColor();

            compareNumbers();
        }

        private static void printThreeWords() {
            System.out.println("Orange");
            System.out.println("Banana");
            System.out.println("Apple");
        }

        private static void checkSumSign() {
            int sweet = 4;
            int cookie = 3;
            System.out.println("Соня считает свои сладости");

            if (sweet + cookie > 0) {
                System.out.println("Сумма положительная");
            }
            else if (sweet + cookie < 0) {
                System.out.println("Сумма отрицательная");
            }
        }

        private static void printColor() {
            int value = 1;
            if (value <= 0) {
                System.out.println("Красный");
            }
            else if (value >0 && value <= 100) {
                System.out.println("Желтый");
            }
            else if (value >100) {
                System.out.println("Зеленый");
            }
        }

        private static void compareNumbers() {
            int a = 13;
            int b = 12;

            if (a >= b) {
                System.out.println("a >= b");
            }
            else {
                System.out.println("a < b");
            }
        }
}
