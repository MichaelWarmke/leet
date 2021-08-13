package warmke.mike.leet.p8;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {

    Solution solution;

    @BeforeEach
    public void setup() {
        solution = new Solution();
    }

    @Test
    public void test() {
        assertEquals(42, solution.myAtoi("42"));
        assertEquals(-42, solution.myAtoi("-42"));
        assertEquals(4193,  solution.myAtoi("4193 with words"));
        assertEquals(Integer.MIN_VALUE,  solution.myAtoi("-91283472332"));
        assertEquals(0, solution.myAtoi("words and 987"));
        assertEquals(0, solution.myAtoi("+-12"));
        assertEquals(3, solution.myAtoi("3.14159"));
        assertEquals(-12, solution.myAtoi("  -0012a42"));
        assertEquals(-2147483647, solution.myAtoi("-2147483647"));
        assertEquals(Integer.MAX_VALUE, solution.myAtoi("20000000000000000000"));
    }

    @Test
    public void stuff() {
        System.out.println(Character.isDigit('+'));
        System.out.println(Character.isDigit('-'));
        System.out.println(Character.isDigit('.'));
        System.out.println(((int)'9') >>> 16);
    }
}
