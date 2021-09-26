import java.util.Arrays;

public class Loop6 {
    public static void main(String[] args) {
        int[] array = new int[] {5, 7, 3, 32, 15, 89};

        // Вывод каждого второго чётного элемента массива
        System.out.println("Исходный массив: " + Arrays.toString(array));
        System.out.print("Чётные элементы по порядку (каждый второй):");
        for (int i = 1; i < array.length; i += 2) {
            System.out.print(" " + array[i]);
        }
    }
}