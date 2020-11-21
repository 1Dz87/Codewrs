package main.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

// should return "battle no requires which that is victory greatest The"

public class ReverseWords {

    // should return "battle no requires which that is victory greatest The"

    public static String reverseWords(String str) {
        List Words = Arrays.asList(str.split(" "));
        Collections.reverse(Words);
        return String.join(" ", Words);
    }
}
