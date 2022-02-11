import java.util.Scanner;

public class DigitNumber {
    public static int numberSum(int number) {
        String numString = Integer.toString(Math.abs(number));
        String[] numArray = numString.split("");
        int sum = 0;
        for (int i = 0; i < numString.length(); i++) {
            sum = sum + Integer.parseInt(numArray[i]);
        }
        return sum;
    }

    public static int numberSumEven(int number) {
        String numString = Integer.toString(Math.abs(number));
        String[] numArray = numString.split("");
        int sum = 0;
        for (int i = 0; i < numString.length(); i++) {
            int num = Integer.parseInt(numArray[i]);
            if (num % 2 == 0) {
                sum = sum + num;
            }
        }
        return sum;
    }

    public static int numberMax(int number) {
        String numString = Integer.toString(Math.abs(number));
        String[] numArray = numString.split("");
        int sum = 0;
        int max = Integer.parseInt(numArray[0]);
        for (int i = 1; i < numString.length(); i++) {
            int max_i = Integer.parseInt(numArray[i]);
            if (max_i > max) {
                max = max_i;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое число");
        int integer = scanner.nextInt();
        System.out.println("Сумма цифр числа = " + numberSum(integer));
        System.out.println("Сумма чётных цифр числа = " + numberSumEven(integer));
        System.out.println("Максимальная цифра числа = " + numberMax(integer));
    }
}