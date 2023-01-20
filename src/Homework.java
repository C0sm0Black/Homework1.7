public class Homework {

    public static void main(String[] args) {

        task1();
        task2();
        task3();
        task4();
        task5();
        task6();

    }

    private static void task6() {

        System.out.println("Задача 6");

        double total = 15_000;
        int month = 1;

        while (month <= 9 * 12) {

            total = total + total * 0.07;

            if (month % 6 == 0) {
                System.out.println("Месяц " + month + ", сумма накоплений " + String.format("%.2f", total));
            }

            month++;

        }

    }

    private static void task5() {

        System.out.println("Задача 5");

        double total = 15_000;
        int month = 1;

        while (total <= 12_000_000) {

            total = total + total * 0.07;

            if (month % 6 == 0) {
                System.out.println("Месяц " + month + ", сумма накоплений " + String.format("%.2f", total));
            }

            month++;

        }

    }

    private static void task4() {

        System.out.println("Задача 4");

        double total = 15_000;
        int month = 1;

        while (total <= 12_000_000) {

            total = total + total * 0.07;

            System.out.println("Месяц " + month + ", сумма накоплений " + String.format("%.2f", total));

            month++;

        }


    }

    private static void task3() {

        System.out.println("Задача 3");

        int population = 12_000_000;
        int fertility, mortality, i;

        for (i = 0; i <= 9; i++) {

            fertility = (population / 1000) * 17;
            mortality = (population / 1000) * 8;

            population = population + fertility - mortality;

        }

        System.out.println("Год " + i + ", численность населения составляет " + population);

    }

    private static void task2() {

        System.out.println("Задача 2");

        int i = 1;

        while (i < 10) {

            System.out.print(i + " ");
            i++;

        }

        System.out.println(i);

        for (i = 10; i > 1; i--) {
            System.out.print(i + " ");
        }

        System.out.println(i);

    }

    private static void task1() {

        System.out.println("Задача 1");

        int salary = 15_000;
        int total = 0;
        int i = 0;

        while (total < 2_459_000) {

            total = total + salary;
            i++;

        }

        System.out.println("Месяц " + i + " сумма накоплений равна " + total + " рублей.");

    }

}
