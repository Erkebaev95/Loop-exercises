public class Loop5 {
    public static void main(String[] args) {
        int[] array = new int[] {5, 7, 3, 32, 15, 89};
        // Вывод каждого второго элемента массива
        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0) {
                System.out.print(array[i] + " ");
            }
        }
    }
}