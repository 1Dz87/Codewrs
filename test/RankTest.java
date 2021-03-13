import main.java.Rank;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RankTest {

    @Test
    public void testRank() {
        String st = "Addison,Jayden,Sofia,Michael,Andrew,Lily,Benjamin";
        Integer[] we = new Integer[] {4, 2, 1, 4, 3, 1, 2};
        assertEquals("Benjamin", Rank.nthRank(st, we, 4));
    }

    @Test
    public void matthewTest() {
        String st = "Elijah,Chloe,Elizabeth,Matthew,Natalie,Jayden";
        Integer[] we = new Integer[] {1, 3, 5, 5, 3, 6};
        assertEquals("Matthew", Rank.nthRank(st, we, 2));
    }
}
