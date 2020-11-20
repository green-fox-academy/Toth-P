public class ReverseDrawDiagonal {
    public static void main(String[] args) {
        int a = 10;
        a++;
        for (int i = 1; i < a; i++) {
            for (int j = 1; j < a; j++) {
                if (j == a-i) {
                    System.out.print("X");
                }
                else if (i == 1 || i == a - 1)
                    System.out.print("X");
                else if (j == 1 || j == a - 1) {
                    System.out.print("X");
                }
                else {
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
    }
}
