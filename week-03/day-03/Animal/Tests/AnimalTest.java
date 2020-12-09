import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AnimalTest {
    Animal animal = new Animal();

    @Before
    public void starter() {
        animal.hunger = 3;
        animal.thirst = 3;
    }

    @Test
    public void eatBasicTest() {
        animal.eat();
        int expected = 2;
        int actual = animal.hunger;
        assertEquals(expected, actual);

    }

    @Test
    public void drinkBasicTest() {
        animal.drink();
        int expected = 2;
        int actual = animal.thirst;
        assertEquals(expected, actual);
    }

    @Test
    public void playBasicTestThirst() {
        animal.play();
        int expected = 4;
        int actual = animal.thirst;
        assertEquals(expected, actual);
    }

    @Test
    public void playBasicTestHunger() {
        animal.play();
        int expected = 4;
        int actual = animal.hunger;
        assertEquals(expected, actual);
    }


    @Test
    public void playSetHunger() {
        int expected = 8;
        int actual = (animal.hunger=8);
        assertEquals(expected, actual);
    }

    @Test
    public void playSetThirst() {
        int expected = 6;
        int actual = (animal.thirst=6);
        assertEquals(expected, actual);
    }


}