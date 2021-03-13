package main.java;

import java.util.Arrays;

public class Bonus2 {
    public static long[] bonus(int[] arr, long s) {
        long x2=0;
        double summ = 0;
        for(int i=0; i<arr.length; i++){
            double a2 = (double) arr[1];
            summ += a2/arr[i];
        }
        x2 = Math.round(s/summ);
        long y=x2*arr[1];
        long [] bonus=new long[arr.length];
        for(int j=0; j<arr.length; j++){
            if(j==1){
                bonus[j]=x2;
            }
            else{
                bonus[j]=y/arr[j];
            }
        }
        return bonus;
    }
}
