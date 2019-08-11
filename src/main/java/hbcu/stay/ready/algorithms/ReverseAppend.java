package hbcu.stay.ready.algorithms;

public class ReverseAppend {

    public String letsReverse( String input){


        StringBuilder reverseString = new StringBuilder(input);

        String x = reverseString.reverse().toString();

        String y = x + input;


        return y;
    }
}
