package main.java;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Rank {

    public static String nthRank(String st, Integer[] we, int n) {

        if(st == null || st.equals("")){
            return "No participants";
        }

        String [] st1 = st.split(",");

        if(st1.length < n){
            return "Not enough participants";
        }
        Set<Participant> participantSummMap = new TreeSet<>(new Comparator<Participant>() {
            @Override
            public int compare(Participant o1, Participant o2) {
                if (o1.sum == o2.sum) {
                    return o1.name.compareTo(o2.name);
                }
                return o2.sum - o1.sum;
            }
        });
        for(int i = 0; i < st1.length; i++){
            int value = st1[i].length();
            char [] ch = st1[i].toLowerCase().toCharArray();
    	/*  "COLIN,AMANDBA,AMANDAB,CAROL,PauL,JOSEPH" = ["COLIN", "AMANDBA", "AMANDAB"....]
      		COLIN = colin = ['c', 'o', 'l', ...]
      */
            for(int j = 0; j < ch.length; j++){
                value += (int)ch[j] - 96;

            }
            value *= we[i];
            Participant part = new Participant(st1[i], value);
            participantSummMap.add(part);
        }
        int count = 0;
        String result = null;
        for(Participant p : participantSummMap){
            if(count == (n-1)){
                result = p.name;
            }
            count++;
        }

        return result;
    }

    static class Participant {

        String name;
        int sum;

        public Participant(String name, int sum){
            this.name = name;
            this.sum = sum;

        }

    }

}
