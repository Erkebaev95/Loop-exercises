import java.util.Arrays;

public class Loop8 {
    public static void main(String[] args) {
        int[] array = new int[] {7, -3, 9, -11, 18, 99, 2, 11};

        System.out.println("Исходный массив: " + Arrays.toString(array));
        System.out.print("Элементы которые больше предыдущего:");
        for (int i = 1; i < array.length; i++) {
            if (array[i] > array[i - 1]) {
                System.out.print(" " + array[i]);
            }
        }
    }
}