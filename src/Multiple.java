public class Multiple {
    public static boolean multipleFour(int number) {
        return number % 4 == 0;
    }

    public static void main(String[] args) {
        System.out.println("Кратные четверке от 1 до 100: ");
        for (int i = 100; i >= 1; i--) {
            if (multipleFour(i)) {
                System.out.print(i + " ");
            }
        }
    }
}