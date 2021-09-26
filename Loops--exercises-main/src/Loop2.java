import java.util.Arrays;

public class Loop2 {
    public static void main(String[] args) {
        int[] array = new int[]{8, 3, 6, 1, 5, 7};

        // Вывод первой половины массива
        System.out.println("Исходный массив: " + Arrays.toString(array));
        System.out.print("Первая половина элементов:");
        for (int i = 0; i < array.length / 2; i++) {
            System.out.print(" " + array[i]);
        }
    }
}