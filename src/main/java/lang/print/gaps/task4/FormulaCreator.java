package lang.print.gaps.task4;

public class FormulaCreator {
    public static void main(String[] args) {

        char a = 'a';
        char b = 'b';

        System.out.printf("(9 * (%c ^ 2) - 5 * %c + 2 + %c - 7) * ((%c + %c - 4 * %c * %c) / 2)", a, b, a,
                a, b, a, b);
    }
}
