import java.util.Arrays;

public class Loop5 {
    public static void main(String[] args) {
        int[] array = new int[]{7, -3, 9, -11, 18, 99, 2, 11};

        // Вывод трех последних элементов из массива
        System.out.println("Исходный массив: " + Arrays.toString(array));
        System.out.print("Последние 3 элемента:");
        for (int i = array.length - 3; i < array.length; i++) {
            System.out.print(" " + array[i]);
        }
    }
}