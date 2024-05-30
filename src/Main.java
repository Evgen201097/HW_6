public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        for (int i = 1; i < 11; i++) {
            System.out.println(i);
        }
        //
        System.out.println("Задание 2");
        for (int i = 10; i > 0; i--) {
            System.out.println(i);
        }
        //
        System.out.println("Задание 3");
        for (int i = 0; i < 17; i = i + 2) {
            System.out.println(i);
        }
        //
        System.out.println("Задание 4");
        for (int i = 10; i > -11; i--) {
            System.out.println(i);
        }
        //
        System.out.println("Задание 5");
        for (int i = 1904; i < 2096; i = i + 4) {
            System.out.println(i + " год является високосным");
        }
        //
        System.out.println("Задание 6");
        for (int i = 7; i < 99; i = i + 7) {
            System.out.println(i);
        }
        //
        System.out.println("Задание 7");
        for (int i = 1; i < 512; i = i * 2) {
            System.out.println(i);
        }
        //
        System.out.println("Задание 8");
        int salary = 29000;
        int total = 0;
        for (int i = 0; i < 12; i++) {
            total = total + total/100;
            total = total + salary;
        }
        System.out.println("Месяц " + salary + " , сумма накоплений равна " + total + " рублей");
        //
        System.out.println("Задание 9");
        int salary1 = 29000;
        int total1 = 1;
        for (int i = 1; i < 13; i++) {
            total1 = total1 + total1/100;
            total1 = total1 + salary;
            System.out.println(i + " Месяц " + total1);
        }
        System.out.println("Месяц " + salary1 + " , сумма накоплений равна " + total1 + " рублей");
        //
        System.out.println("Задание 10");
        int namber = 2;
        for (int j = 1; j <= 10; j = j + 1) {
            System.out.println(namber + "*" + j + "=" + namber * j);
        }
    }
}