package main.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

// should return "battle no requires which that is victory greatest The"

public class ReverseWords {

    // should return "battle no requires which that is victory greatest The"

    public static String reverseWords(String str) {
        List<String> reverseWords = new ArrayList<>(Arrays.asList(((str).split(" "))));
        Collections.reverse(reverseWords);
        StringBuffer result = new StringBuffer();
        reverseWords.forEach(st -> {
            if (reverseWords.indexOf(st) < (reverseWords.size() -1)) {
                result.append(st).append(" ");
            } else {
                result.append(st);
            }
        });
        return result.toString();
    }
}
