package main.java;

public class SumParts {

    public static void main(String[] args) {
        sumParts(new int[] {0, 1, 3, 6, 10});
    }

    public static int[] sumParts(int[] ls) {

        int[] result = new int[ls.length + 1];
        result[result.length-1]=0;
        for(int i = ls.length - 1; i >= 0; i--){
            result[i] = result[i + 1] + ls[i];
        }
        return result;
    }
}