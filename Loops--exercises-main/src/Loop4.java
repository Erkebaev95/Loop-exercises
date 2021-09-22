public class Loop4 {
    public static void main(String[] args) {
        int[] array = new int[]{7, -3, 9, -11, 18, 99, 2, 11};
        // Вывод трех последних элементов из массива
        for (int i = 5; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}