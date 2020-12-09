import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class SumTest {
    Sum Sum;
    ArrayList<Integer> list;
    @Before
    public void setup(){
    Sum = new Sum();}

    @Test
    public void testSumListEmpty() {
        list = new ArrayList<>();
        int expected = 0;
        int actual = Sum.SumList(list);
        assertEquals(expected, actual);

    }


    @Test
    public void testSumListOneElement() {
        list = new ArrayList<>();
        this.list.add(3);


        int expected = 3;
        int actual = Sum.SumList(list);
        assertEquals(expected, actual);

    }

    @Test
    public void testSumListMultiple() {
        list = new ArrayList<>();
        this.list.add(3);
        this.list.add(2);
        this.list.add(3);
        this.list.add(2);

        int expected = 10;
        int actual = Sum.SumList(list);
        assertEquals(expected, actual);

    }

    @Test(expected = NullPointerException.class)
    public void testSumListMultipleNull() {

        Sum.SumList(list);

    }


}