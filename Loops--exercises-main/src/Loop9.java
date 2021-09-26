import java.util.Arrays;

public class Loop9 {
    public static void main(String[] args) {
        int[] array = new int[]{56, 72, 86, 52, 17, 19, -1, 0, -89};

        // Поиск максимального и минимального элемента массива
        System.out.println("Исходный массив: " + Arrays.toString(array));
        int max = 0;
        int min = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] > array[max]) {
                max = i;
            } else if (array[i] < array[min]) {
                min = i;
            }
        }
        System.out.println("Максимальный элемент: " + array[max]);
        System.out.println("Минимальный элемент: " + array[min]);
    }
}