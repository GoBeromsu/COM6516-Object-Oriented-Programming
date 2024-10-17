package code3;

import java.util.Random;

public class RandomMultiplication {

    private static Random random = new Random(8);

    public static int[] randomArray(int max) {
        int[] numbers = new int[max];
        for (int i = 0; i < max; i++) {
            numbers[i] = i + 1;
        }

        int temp;
        for (int i = max - 1; i > 0; i--) {
            int j = random.nextInt(i);
            temp = numbers[i];
            numbers[i] = numbers[j];
            numbers[j] = temp;
        }
        return numbers;
    }

    public static void main(String[] args) {
        int[] rows = randomArray(9);
        int[] cols = randomArray(9);

        System.out.print("   ");
        for (int j : cols) {
            System.out.format("%2d  ", j);
        }
        System.out.println();

        System.out.print("---");
        for (int j : cols) {
            System.out.print("----");
        }

        System.out.println();

        for (int i : rows) {
            System.out.format("%1d |", i);
            for (int j : cols) {
                System.out.format("%2d  ", i * j);
            }
            System.out.println();
        }
    }
}
