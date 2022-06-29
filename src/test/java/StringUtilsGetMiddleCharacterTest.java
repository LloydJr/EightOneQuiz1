 

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
    public void test1(){
        //Given
        String word = "Aggadah";
        String expected = 'a';

        //When
        String actual = utilities.getMiddleCharacter(word);


        //Then
        assertEquals(expected, actual);
    }

    @Test
    public void test2(){
        //Given
        String word = "information";

        String expected = 'm';

        //When
        String actual = utilities.getMiddleCharacter(word);

        //Then
        assertEquals(expected, actual);
    }

    @Test
    public void test3(){
        //Given
        String word = "reification";
        String expected = 'c';

        //When
        String actual = utilities.getMiddleCharacter(word);

        //Then
        assertEquals(expected, actual);
    }


    @Test
    public void test4(){
        //Given
        String word = "ohm";
        String expected = 'h';

        //When
        String actual = utilities.getMiddleCharacter(word);

        //Then
        assertEquals(expected, actual);
    }
}
