package lang.print.gaps.task4;

import java.nio.file.Files;

public class FormulaCreator {
    public static void main(String[] args) {
        byte a = 1;
        byte b = 2;
        System.out.println((9 * Math.pow(a, 2) - 5 * b + 2 + a - 7) * ((a + b - 4 * a * b) / 2));
    }
}
