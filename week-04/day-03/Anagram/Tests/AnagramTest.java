import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AnagramTest {
    Anagram anagram;

    @Before
    public void setup() {
        anagram = new Anagram();
    }

    @Test
    public void testAnagramWithDifferentLengthStings() {
        Boolean actual = anagram.isAnagram("asdas", "wast");
        assertEquals(false, actual);
    }

    @Test
    public void testAnagramWithSameLengthStingsNotAnagram() {
        Boolean actual = anagram.isAnagram("asdas", "wastr");
        assertEquals(false, actual);
    }

    @Test
    public void testAnagramIsAnagram() {
        Boolean actual = anagram.isAnagram("Alma", "lama");
        assertEquals(true, actual);
    }


}