public class Loop6 {
    public static void main(String[] args) {
        int positiveCount = 0;
        int negativeCount = 0;
        int zeroCount = 0;
        int[] array = new int[] {94, -7, 61, 0, 0, -90, 891, 32, -15, 89, -1, 0};
        for (int j : array) {
            if (j < 0) {
                negativeCount++;
            } else if (j > 0) {
                positiveCount++;
            } else {
                zeroCount++;
            }
        }
        System.out.println("Положительных чисел:" + " " + positiveCount);
        System.out.println("Отрицательных чисел:" + " " + negativeCount);
        System.out.println("Количество нулей:" + " " + zeroCount);
    }
}