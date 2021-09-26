import java.util.Arrays;

public class Loop3 {
    public static void main(String[] args) {
        int[] array = new int[]{8, 3, 6, 1, 5, 7};

        // Вывод второй половины массива
        System.out.println("Исходный массив: " + Arrays.toString(array));
        System.out.print("Вторая половина элементов:");
        for (int i = array.length / 2; i < array.length; i++) {
            System.out.print(" " + array[i]);
        }
    }
}