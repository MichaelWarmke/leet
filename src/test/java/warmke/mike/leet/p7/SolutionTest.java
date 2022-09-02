package warmke.mike.leet.p7;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import warmke.mike.leet.bit.p7.Solution;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class SolutionTest {

    Solution solution;

    @BeforeEach
    public void setup() {
        solution = new Solution();
    }

    @Test
    public void test() {
        assertEquals(321, solution.reverse(123));
        assertEquals(-321, solution.reverse(-123));
        assertEquals(21, solution.reverse(120));
        assertEquals(0, solution.reverse(0));
        var minVal = -(int) Math.pow(2, 31);
        assertEquals(0, solution.reverse(minVal));
        var maxVal = ((int) Math.pow(2, 31)) - 1;
        assertEquals(0, solution.reverse(Integer.MIN_VALUE));
    }
}
