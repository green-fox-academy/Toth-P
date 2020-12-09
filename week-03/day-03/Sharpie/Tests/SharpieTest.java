import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SharpieTest {
    Sharpie sharpie = new Sharpie("red", 10.0);

    @Before
    public void starter() {
        sharpie.inkAmount = 10.0;
    }

    @Test
    public void use() {
        sharpie.use();
        double expected = 9.0;
        double actual = sharpie.inkAmount;
        assertEquals(expected, actual, 10);
    }

    @Test
    public void colorTest() {
        String expected = "Blue";
        String actual = (sharpie.color = "Blue");
        assertEquals(expected, actual);
    }

    @Test
    public void widthTest() {
        double expected = 8.0;
        double actual = (sharpie.inkAmount = 8.0);
        assertEquals(expected, actual, 10);
    }


}