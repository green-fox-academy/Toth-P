public class SumDigits {

    // Given a non-negative integer n, return the sum of it's digits recursively
    // (without loops).
    //
    // Hint
    //
    // Mod (%) by 10 yields the rightmost digit (e.g. 126 % 10 is 6)
    //
    // Divide (/) by 10 removes the rightmost digit (e.g. 126 / 10 is 12).

    public static void main(String[] args) {

        System.out.println(sumOfDigits(1264754328763487L));
    }

    public static long sumOfDigits(long n) {
        if (n <= 0) {
            return 0;
        }
        return n % 10 + sumOfDigits(n / 10);

    }
}
