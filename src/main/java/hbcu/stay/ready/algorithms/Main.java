package hbcu.stay.ready.algorithms;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.HashSet;
import java.util.Set;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        InputStreamReader reader = new InputStreamReader( System.in, StandardCharsets.UTF_8 );
        BufferedReader in = new BufferedReader(reader);
        String line;
        while((line =in.readLine()) != null); {

           // System.out.println(isHappyNumber(Integer.parseInt(line)));
        }
    }

    public boolean isHappyNumber (Integer input) {

       Set<Integer> seen = new HashSet<>(); // A Set to hold the numbers
            if (input == 1) return true; // if number == 1 thenSet


            if(seen.contains(input)) return false;

            seen.add(input);
            int num = 0;
            while (input != 0) {
                int digit = input%10;
                input /= 10;
                num += digit * digit;
            }
            return isHappyNumber(num);
    }
}







