import java.util.Scanner;

public class Average {
    public static double getAverage(int startArray, int finishArray) {
        int count = 0;
        int sum = 0;
        while (startArray <= finishArray) {
            sum = sum + startArray;
            startArray++;
            count++;
        }
        return (double) sum / count;
    }

    public static double getEvenAverage(int startArray, int finishArray) {
        int count = 0;
        int sum = 0;
        while (startArray <= finishArray) {
            if (startArray % 2 == 0) {
                sum = sum + startArray;
                count++;
            }
            startArray++;
        }
        return (double) sum / count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите начальное число диапазона");
        int start = scanner.nextInt();
        System.out.println("Введите конечное число диапазона");
        int finish = scanner.nextInt();
        System.out.println("Среднее арифметическое чисел = " + getAverage(start, finish));
        System.out.println("Среднее арифметическое чётных чисел = " + getEvenAverage(start, finish));
    }
}