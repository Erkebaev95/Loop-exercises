public class Loop2 {
    public static void main(String[] args) {
        int[] array = new int[]{8, 3, 6, 1, 5, 7};
        // Вывод первой половины массива
        for (int i = 0; i < array.length / 2; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("\n");
        // Вывод второй половины массива
        for (int i = array.length / 2; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}