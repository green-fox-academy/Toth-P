public class StringsAgainAndAgain {

    // Given a string,
    // compute recursively a new string where
    // all the adjacent chars are now separated by a `*`

    public static void main(String[] args) {
        String string = "r4ndoMText";

        System.out.println(changer(string));

    }

    public static String changer(String string) {
        System.out.println(string);
        if (string.length() == 1) {
            return string;
        }

        if (string.charAt(0) != '*') {
            string = string.charAt(0) + "*" + string.substring(1);

        }
        return string.charAt(0) + changer(string.substring(1));


    }


}
