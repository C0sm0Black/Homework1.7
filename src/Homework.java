public class Homework {

    public static void main(String[] args) {

        task1();
        task2();
        task3();

    }

    private static void task3() {

        System.out.println("Задача 3");

        int population = 12_000_000;
        int fertility, mortality, i;

        for (i = 1; i <= 10; i++) {

            fertility = (population / 1000) * 17;
            mortality = (population / 1000) * 8;

            population = population + fertility - mortality;

            System.out.println("Год " + i + ", численность населения составляет " + population);

        }

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
