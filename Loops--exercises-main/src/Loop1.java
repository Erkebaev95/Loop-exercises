import java.util.Arrays;

public class Loop1 {
    public static void main(String[] args) {
        int[] array = new int[]{1, 5, 7, 8, 3, 9};

        // Вывод первых 3 элементов массива
        System.out.println("Исходный массив: " + Arrays.toString(array));
        System.out.print("Первые 3 элемента:");
        int count = 3;
        for (int i = 0; i < count; i++) {
            System.out.print(" " + array[i]);
        }
    }
}