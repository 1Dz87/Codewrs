package main.java;

public class Bonus {
    public static long[] bonus(int[] arr, long s) {
        double zn = arr[0]*arr[1];
        double y=0;
        double chisl=arr[0]+arr[1];
        double result=0;
        for(int i=2;i<arr.length;i++){
            chisl=chisl*arr[i]+zn;
            zn*=arr[i];
        }
        result=chisl/zn;
        double sd = (double)s;
        y=sd/result;
        long[] bonus = new long[arr.length];
        for(int i=0;i<bonus.length;i++){
            bonus[i]=Math.round(y/arr[i]);
        }
        return bonus;
    }
}
