public class Loop1 {
    public static void main(String[] args) {
        int[] array = new int[]{1, 5, 7, 8, 3};
        // Вывод первых 3 элементов массива
        for (int i = 0; i < array.length; i++) {
            if (i <= 2) {
                System.out.print(array[i] + " ");
            }
        }
    }
}