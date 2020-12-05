public class StringsAgain {

    // Given a string,
    // compute recursively a new string where
    // all the 'x' chars have been removed.

    public static void main(String[] args) {
        String string = "xaxxXXXasdasdxxxXXXXxxxx";

        System.out.println(changer(string));

    }

    public static String changer(String string) {
        if (string.length() < 1) {
            return string;
        }

        if (string.charAt(0)=='x'){
            string = " " + string.substring(1);

        }
        return (string.charAt(0) + changer(string.substring(1))).replaceAll(" ","");


    }


}




