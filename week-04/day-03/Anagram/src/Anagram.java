import java.util.Arrays;

public class Anagram {

    public Boolean isAnagram(String string1, String string2) {
        string1 = string1.toLowerCase();
        string2 = string2.toLowerCase();
        char[] charArray1 = string1.toCharArray();
        Arrays.sort(charArray1);

        char[] charArray2 = string2.toCharArray();
        Arrays.sort(charArray2);

        if (charArray1.length != charArray2.length) {
            return false;
        } else if (Arrays.equals(charArray1, charArray2)) {
            return true;
        } else
            return false;


    }




}
