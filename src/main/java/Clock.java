package main.java;


// Раз мы занимаемся Java, то было бы не плохо сделать эту задачу средствами Java (например Date и SimpleDateFormat)
public class Clock
{

    public static int Past(int h, int m, int s) {
        int sum = 0;
        sum = (((h * 60) * 60) * 1000) + ((m * 60) * 1000) + (s * 1000);
        return sum;
    }
}
//    Clock shows 'h' hours, 'm' minutes and 's' seconds after midnight.
//
//        Your task is to make 'Past' function which returns time converted to milliseconds.
//
//        Example:
//        Past(0, 1, 1) == 61000
//        Input constraints: 0 <= h <= 23, 0 <= m <= 59, 0 <= s <= 59
