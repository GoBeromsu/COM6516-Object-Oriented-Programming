package code3;

import java.util.Random;
import java.util.random.*;

public class Multiplication {
    private static int NUMBER = new Random().nextInt(100);
    private static int INDENT = 4;

    public static void main(String[] args) {
        Multiplication m = new Multiplication();
        String result = "";


        StringBuilder header = new StringBuilder();
        for (int i = 0; i < NUMBER; i++) {
            if (i == 0) header.append(" ".repeat(INDENT)).append("|");
            else header.append(m.formatCell(i == 0, i));
        }
        System.out.println(header);
        System.out.println("-".repeat(NUMBER * INDENT + 1));

        for (int i = 1; i < NUMBER; i++) System.out.println(m.calculate(i));
    }

    public String calculate(int m) {
        StringBuilder result = new StringBuilder();
        result.append(formatCell(true, m));
        for (int i = 1; i < NUMBER; i++) {
            result.append(formatCell(false, m * i));
        }
        return result.toString();
    }

    private static String formatCell(boolean isFirst, int value) {
        return isFirst ? String.format("%" + INDENT + "s" + "|", value) : String.format("%" + INDENT + "s", value);
    }
}
