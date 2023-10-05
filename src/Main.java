import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество символов, которые хотите передать в калькулятор(дробные с запятой): ");
        Integer count = scanner.nextInt();
        List<Double> list = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            list.add(scanner.nextDouble());
        }
        Calculator calculator = new Calculator();
        System.out.println("Сумма данных чисел = " + calculator.sum(list));
        System.out.println("Произведение данных чисел = " + calculator.mult(list));
        System.out.println("Разность данных чисел = " + calculator.div(list));
        calculator.binary(list);
    }
}