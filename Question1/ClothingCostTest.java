package CourseWork.Question1;

import CourseWork.Question1.ClothingCost;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ClothingCostTest {
    @Test
    public void testMinimumCost() {
        int[][] price = {
                { 18, 8, 12 },
                { 11, 14, 3 },
                { 14, 2, 10 }
        };
        int expectedMinimumCost = 9; // The minimum cost is achieved by selecting clothing 1, clothing 3, and
                                     // clothing 3.

        int result = ClothingCost.minimumCost(price);
        assertEquals(expectedMinimumCost, result);
    }
}
