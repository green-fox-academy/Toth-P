public class Bunnies {

    // We have a number of bunnies and each bunny has two big floppy ears.
    // We want to compute the total number of ears
    // across all the bunnies recursively (without loops or multiplication).
    public static void main(String[] args) {
        System.out.println(counter(8, 2));
    }

    public static int counter(int bunnies, int ears) {

        if (bunnies <= 1) {
            return ears;
        }
        return ears + counter(bunnies - 1, ears);
    }
}
