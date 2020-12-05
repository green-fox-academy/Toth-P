public class Strings {
    // Given a string, compute recursively (no loops) a new string where
    // all the lowercase 'x' chars have been changed to 'y' chars.
    public static void main(String[] args) {
        String string = "xaxxXXXasdasdxxxXXXXx";

        System.out.println(changer(string));

    }

    public static String changer(String string) {
        if (string.length() < 1) {
            return string;
        }

        if (string.charAt(0)=='x'){
            string = "y" + string.substring(1);

        }
        return string.charAt(0) + changer(string.substring(1));


    }


}
