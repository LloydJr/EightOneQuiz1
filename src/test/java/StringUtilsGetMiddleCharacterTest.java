 

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StringUtilsGetMiddleCharacterTest {

    private StringUtilities utilities;

    @Before
    public void setUp() {
        utilities = new StringUtilities();
    }

    @Test
    public void test1() {
        //Given
        String word = "Aggadah";
        String expected = String.valueOf('a');

        //When
        String actual = utilities.getMiddleCharacter(word);


        //Then
        assertEquals(expected, actual);
    }

    @Test
    public void test2(){
        //Given
        String word = "information";

        String expected = String.valueOf('m');

        //When
        String actual = utilities.getMiddleCharacter(word);

        //Then
        assertEquals(expected, actual);
    }

    @Test
    public void test3(){
        //Given
        String word = "reification";
        String expected = String.valueOf('c');

        //When
        String actual = utilities.getMiddleCharacter(word);

        //Then
        assertEquals(expected, actual);
    }


    @Test
    public void test4(){
        //Given
        String word = "ohm";
        String expected = String.valueOf('h');

        //When
        String actual = utilities.getMiddleCharacter(word);

        //Then
        assertEquals(expected, actual);
    }
}
