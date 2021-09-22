public class Loop7 {
    public static void main(String[] args) {
        int[] array = new int[] {7, -3, 9, -11, 18, 99, 2, 11};
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                System.out.print(array[i] + " ");
            }
        }
    }
}