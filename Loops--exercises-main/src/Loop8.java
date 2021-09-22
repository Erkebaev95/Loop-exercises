public class Loop8 {
    public static void main(String[] args) {
        int[] array = new int[]{56, 72, 86, 52, 17, 19, -1, 0, -89};
        int max = array[0];
        int min = array[0];
        // Поиск максимального и минимального элемента массива
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            } else if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println(max + " " + min);
    }
}