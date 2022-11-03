import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.*;

import java.util.ArrayList;
import java.util.List;

public class MyFirstTest {

//    ArrayList<Integer> arrayList = new ArrayList<>();
//    ArrayList<Integer> arrayList2 = new ArrayList<>();
//
//    @Before
//    public void setUpValues(){
//        arrayList.add(1);
//        arrayList.add(2);
//        arrayList2.add(1);
//        arrayList2.add(2);
//    }

//    @Test
//    public void testObjectsSameness(){
//        assertSame(arrayList, arrayList2);
//    }

    @Test
    public void additionMethodTest() {
        long input1 = 20;
        long input2 = 30;
        long expected = 50;

        assertEquals(expected,
                MathOperations.add(input1, input2));
    }

    @Test
    public void tipAppTest(){
        double cost = 22.56;
        double tip = 20;

        assertEquals(4.51, MathOperations.tip(cost, tip), 0.01);
    }

    @Test
    public void testArrayEquality(){
        int[] startArray = {1, 2, 3, 4, 5};
        int[] endArray = {2, 3, 4, 5, 6};

        assertArrayEquals(endArray, MathOperations.addOneToArray(startArray));
    }

    @Test
    public void verifyString(){
        String expected = "Codeup";
        String actual = "Codeup";

        assertEquals(expected, actual);
    }

    @Test
    public void sameArray(){
        List<String> languages = new ArrayList<>();
        List<String> moreLanguages = new ArrayList<>();

        assertNotSame(languages, moreLanguages);

    }

    @Test
    public void verifyArray(){
        int[] numbers = {1, 2, 3};
        int[] otherNumbers = new int[3];
        otherNumbers[0] = 1;
        otherNumbers[1] = 2;
        otherNumbers[2] = 3;

        assertArrayEquals(numbers, otherNumbers);
    }

    @Test
    public void tellMeTheTruth(){
        String language = "PHP";
        language.contains("H"); // use assertTrue for this statement
        language.contains("J"); // use assertFalse for this statement

        assertTrue(language.contains("H"));
        assertFalse(language.contains("J"));
    }


}
