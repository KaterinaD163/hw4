public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println("Итерация цикла " + i);
        }

        for (int i = 2020; i < 2070; i = i + 4) {
            System.out.println(" Высокосный год " + i);
        }

        int salary = 65535;
        int total = 0;
        int i = 0;
        for (; total < 1_000_000; i++) {
            total = total + total/100;
            total = total + salary;
            if (i % 5 == 0) {
                System.out.println("Месяц " + i + "Итого " + total);
            
            }
             // Задание 1
            int n = 1;
            while (n <= 10) {

                System.out.println(" " + n++ );

            }
            for (int c = 10; c > 0; c--) {
                System.out.println(" " + c);
            }
             // Задание 2
            for (int  b = 2; b <= 31; b = b + 7) {
                System.out.println("Сегодня пятница, " + b + "-е число. Необходимо подготовить отчет.");
            }

            // Задание 3
        for (int z = 79; z >= 2022 - 200; z = z + 79) {
            System.out.println(z);
        }
            for (int x = 79; x <= 2022 + 100; x = x + 79) {
                System.out.println(x);
            }




