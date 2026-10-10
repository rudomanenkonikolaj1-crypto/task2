import java.util.Scanner;
public class Task2 { public static void main(String[] args) { Scanner scanner = new Scanner(System.in);


    System.out.print("Введіть ціле число: ");
    int number = scanner.nextInt();

    // Визначаємо кількість цифр числа
    long n = Math.abs((long) number);
    int digits = 0;
    long temp = n;

    if (temp == 0) {
        digits = 1;
    } else {
        while (temp != 0) {
            digits++;
            temp /= 10;
        }
    }

    // Перевертаємо число за допомогою while
    long reversedWhile = 0;
    n = Math.abs((long) number);

    while (n != 0) {
        reversedWhile = reversedWhile * 10 + n % 10;
        n /= 10;
    }

    // Перевертаємо число за допомогою do-while
    long reversedDoWhile = 0;
    n = Math.abs((long) number);

    do {
        reversedDoWhile = reversedDoWhile * 10 + n % 10;
        n /= 10;
    } while (n != 0);

    // Виводимо результат while зі збереженням нулів
    System.out.println("Результат циклу while:");
    if (number < 0) {
        System.out.print("-");
    }
    System.out.printf("%0" + digits + "d%n", reversedWhile);

    // Виводимо результат do-while зі збереженням нулів
    System.out.println("Результат циклу do-while:");
    if (number < 0) {
        System.out.print("-");
    }
    System.out.printf("%0" + digits + "d%n", reversedDoWhile);

    scanner.close();
}
}