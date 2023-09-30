package org.example;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберите задание: ");
        int task = scanner.nextInt();
        switch (task){
            case 1:{
                String quote = "Your time is limited,\n\tso don’t waste it\n\t\tliving someone else’s life\n\t\t\tSteve Jobs";
                System.out.println(quote);
            }
            break;
            case 2:{
                System.out.print("Введіть перше число: ");
                int firstNumber = scanner.nextInt();

                System.out.print("Введіть друге число: ");
                int secondNumber = scanner.nextInt();

                System.out.print("Введіть третє число: ");
                int thirdNumber = scanner.nextInt();

                String combinedString = Integer.toString(firstNumber) + Integer.toString(secondNumber) + Integer.toString(thirdNumber);
                int result = Integer.parseInt(combinedString);

                System.out.println("Сформоване число: " + result);
            }
            break;
            case 3:{
                System.out.print("Введіть шестизначне число: ");
                int number = scanner.nextInt();

                if (number >= 100000 && number <= 999999) {

                    int digit1 = number / 100000;
                    int digit2 = (number / 10000) % 10;
                    int digit3 = (number / 1000) % 10;
                    int digit4 = (number / 100) % 10;
                    int digit5 = (number / 10) % 10;
                    int digit6 = number % 10;

                    int newNumber = digit6 * 100000 + digit5 * 10000 + digit4 * 1000 + digit3 * 100 + digit2 * 10 + digit1;

                    System.out.println("Результат: " + newNumber);
                } else {
                    System.out.println("Помилка: введене число не є шестизначним.");
                }
            }
            break;
            case 4:{
                System.out.print("Введіть початкове число: ");
                int start = scanner.nextInt();

                System.out.print("Введіть кінцеве число: ");
                int end = scanner.nextInt();

                if (start > end) {
                    System.out.println("Початкове число повинно бути менше або рівне кінцевому числу.");
                } else {
                    for (int i = start; i <= end; i++) {
                        for (int j = 1; j <= 10; j++) {
                            System.out.println(i + " * " + j + " = " + (i * j));
                        }
                        System.out.println();
                    }
                }
            }
            break;
            case 5:{
                int length = 10;
                char direction = 'в';
                char symbol = '|';

                drawLine(length, direction, symbol);
            }
            break;
            default:
                System.out.println("Error!");
        }
        scanner.close();
    }
    public static void drawLine(int length, char direction, char symbol) {
        if (length <= 0) {
            System.out.println("Довжина лінії повинна бути більше 0.");
            return;
        }

        if (direction == 'г' || direction == 'Г') {
            for (int i = 0; i < length; i++) {
                System.out.print(symbol);
            }
            System.out.println();
        } else if (direction == 'в' || direction == 'В') {
            for (int i = 0; i < length; i++) {
                System.out.println(symbol);
            }
        } else {
            System.out.println("Напрям не визначений. Використовуйте 'г' або 'Г' для горизонтальної лінії, 'в' або 'В' для вертикальної лінії.");
        }
    }
}