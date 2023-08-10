import java.util.Arrays;  // импортируем

public class Main {
    public static void main(String[] args) {
        double[] numbers = {12, 34, -8, -10, 46, 14, -6, 56, -57, 39, 100, 35, 0, -56, -82};   // даем значение
        double sum = 0;
        boolean negativeNum = false;

        for (double number : numbers) {
            if (negativeNum) {
                sum += number;
            } else if (number < 0) {
                negativeNum = true;
            }
        }

        int countPositive = 0;
        for (double number : numbers) {
            if (number > 0) {
                countPositive++;
            }
        }

        double average = sum / countPositive;
        System.out.println("средне арифметическое число " + average);

        // Сортировка массива по возрастанию
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[j] < numbers[i]) {
                    double temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }
            }
            System.out.println(Arrays.toString(numbers));
        }
    }
}