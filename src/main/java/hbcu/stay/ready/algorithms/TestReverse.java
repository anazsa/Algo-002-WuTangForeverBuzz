package hbcu.stay.ready.algorithms;
import org.junit.Assert;
import org.junit.Test;

import java.util.*;



public class TestReverse {

    @Test
    public void ReverseTest(){
        ReverseAppend reverseAppend = new ReverseAppend();

        String input = "BAD";

        String expected = "DABBAD";
        String actual =  reverseAppend.letsReverse(input);

        Assert.assertEquals(expected,actual);
    }



}
