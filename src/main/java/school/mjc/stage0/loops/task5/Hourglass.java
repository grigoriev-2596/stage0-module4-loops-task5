package school.mjc.stage0.loops.task5;

public class Hourglass {
    public static void printHourglassOfGivenSize(int height) {
        for (int i = height; i > 0; i -= 2) {
            printEights(i, height);
        }
        for (int i = height % 2 == 0 ? 2 : 3; i <= height; i += 2) {
            printEights(i, height);
        }
    }

    public static void printEights(int n, int length) {
        final int SPACE_AMOUNT = length - n;
        for (int i = 0; i < length; i++) {
            if (i < SPACE_AMOUNT / 2 || i > length - SPACE_AMOUNT / 2 - 1) System.out.print(" ");
            else System.out.print("8");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        printHourglassOfGivenSize(6);
    }
}
