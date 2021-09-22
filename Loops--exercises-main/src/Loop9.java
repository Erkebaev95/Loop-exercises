import java.util.Arrays;

public class Loop9 {
    public static void main(String[] args) {
        int[] array = new int[901];
        int[] array2 = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 100;
        }
        for (int i = 0, j = array.length - 1; i < array.length; i++, j--) {
            array2[j] = array[i];
        }
        for (int k : array2) {
            System.out.println(k);
        }
        System.out.println(Arrays.toString(array));
    }
}