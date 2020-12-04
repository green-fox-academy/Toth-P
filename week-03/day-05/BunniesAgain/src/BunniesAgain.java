public class BunniesAgain {
    // We have bunnies standing in a line,
    // numbered 1, 2, 3, 4, ...
    // The odd bunnies (1, 3, ...) have the normal 2 ears.
    // The even bunnies (2, 4, ..) we'll say have 3 ears,
    // because they each have a raised foot.
    // Recursively return the number of "ears" in
    // the bunny line 1, 2, ... n (without loops or multiplication).

    public static void main(String[] args) {
        System.out.println(counter(7, 2, 3));
    }

    public static int counter(int lineSize, int earsOdd, int earsEven) {

        if (lineSize <= 0) {
            return 0;
        } else if (lineSize % 2 != 0) {
            return earsOdd + counter(lineSize - 1, earsOdd, earsEven);
        } else return earsEven + counter(lineSize - 1, earsOdd, earsEven);
    }
}
