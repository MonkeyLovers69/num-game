import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int UserNum1 = -1;
        int UserNum2 = -1;
        int count = 0;
        Scanner input = new Scanner(System.in);

        System.out.println("Угадай два числа от 0 до 9");
        int num1 = (int) Math.floor(Math.random() * 10);
        int num2 = (int) Math.floor(Math.random() * 10);

        do {
            count++;

            if (UserNum1 != num1) {
                System.out.print("Введите первое число:");
                UserNum1 = input.nextInt();
                if (UserNum1 > num1) {
                    System.out.println("Число 1  меньше");
                }
                if (UserNum1 < num1) {
                    System.out.println("Число 1 больше");
                }
            }
            if (UserNum2 != num2) {
                System.out.print("Введите второе число:");
                UserNum2 = input.nextInt();
                if (UserNum2 > num2) {
                    System.out.println("Число 2 меньше");
                }
                if (UserNum2 < num2) {
                    System.out.println("Число 2 больше");
                }

            }}
            while (UserNum1 != num1 || UserNum2 != num2) ;

            System.out.println("Угаданы числа " + num1 + " и " + num2);
            System.out.println("Попыток потрачено: " + count);
        }
    }

