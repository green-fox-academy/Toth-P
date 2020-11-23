import java.util.Arrays;

public class Matrix {
    public static void main(String[] args) {
        // - Create (dynamically*) a two dimensional array
        //   with the following matrix**. Use a loop!
        //
        //   1 0 0 0
        //   0 1 0 0
        //   0 0 1 0
        //   0 0 0 1
        //
        // - Print this two dimensional array to the output
        // * length should depend on a variable
        // ** Relax, a matrix is just like an array

        String[][] multiArray = new String[4][4];


        for (int i = 0; i < multiArray.length; i++) {
            for (int j = 0; j < multiArray[i].length; j++) {
                if (i==j){ multiArray[i][j] = "1";}
                else{
                    multiArray[i][j] = "0";
                }
            }
        }
        System.out.println(Arrays.deepToString(multiArray));

    }
}