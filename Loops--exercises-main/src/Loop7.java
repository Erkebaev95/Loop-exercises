import java.util.Arrays;

public class Loop7 {
    public static void main(String[] args) {
        int[] array = new int[] {7, -3, 9, -11, 18, 99, 2, 11};

        System.out.println("Исходный массив: " + Arrays.toString(array));
        int positiveCount = 0;
        int negativeCount = 0;
        for (int num : array) {
            if (num > 0) {
                positiveCount++;
            } else if (num < 0) {
                negativeCount++;
            }
        }
        System.out.println("Количество положительных: " + positiveCount);
        System.out.println("Количество отрицательных: " + negativeCount);
    }
}