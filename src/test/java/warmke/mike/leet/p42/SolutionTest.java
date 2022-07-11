package warmke.mike.leet.p42;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import warmke.mike.leet.two.pointers.p42.Solution;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {

    Solution solution;

    @BeforeEach
    public void setup() {
        solution = new Solution();
    }

    @Test
    public void test() {
        assertEquals(6, solution.trap(new int[]{0,1,0,2,1,0,1,3,2,1,2,1}));
        assertEquals(9 , solution.trap(new int[]{4,2,0,3,2,5}));
    }
}
