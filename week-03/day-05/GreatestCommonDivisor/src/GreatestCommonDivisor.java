public class GreatestCommonDivisor {
    // Find the greatest common divisor of two numbers using recursion.

    public static void main(String[] args) {
        int x = 8896;
        int y = -24868;
        System.out.println(greatestCommonDivider(x, y, z(x, y)));

    }

    public static int z(int x, int y) {

        if (Math.abs(x) > Math.abs(y)) {
            return Math.abs(y);
        }
        return Math.abs(x);
    }

    public static int greatestCommonDivider(int x, int y, int z) {

        if (x % z == 0 && y % z == 0) {
            return z;
        }
        return greatestCommonDivider(x, y, z - 1);
    }


}

