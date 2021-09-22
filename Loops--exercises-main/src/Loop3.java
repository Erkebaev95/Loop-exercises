public class Loop3 {
    public static void main(String[] args) {
        int[] array = new int[]{8, 3, 6, 1, 5, 7};
        // Вывод всех элементов массива, кроме первого и последнего
        for (int i = 1; i < array.length - 1; i++) {
            System.out.print(array[i] + " ");
        }
    }
}