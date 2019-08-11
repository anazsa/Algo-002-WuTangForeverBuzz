package hbcu.stay.ready.algorithms;

import org.junit.Assert;
import org.junit.Test;

public class HappyNumberTest {

    @Test

    public void HappyTest() {

        Main main = new Main();

        Integer number = 19;
        Boolean expected = true;
        Boolean actual = main.isHappyNumber(number);

        Assert.assertEquals(expected, actual);
    }

    @Test

    public void NotHappyTest(){
        Main main = new Main();

        Integer number = 14;
        Boolean expected = false;
        Boolean actual = main.isHappyNumber(number);

        Assert.assertEquals(expected, actual);
    }



    }
