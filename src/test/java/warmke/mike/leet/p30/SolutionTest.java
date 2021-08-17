package warmke.mike.leet.p30;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {

    Solution solution;

    @BeforeEach
    public void setup() {
        solution = new Solution();
    }

    @Test
    public void test() {
        assertEquals(List.of(0,9), solution.findSubstring("barfoothefoobarman", new String[]{"foo", "bar"}));
        assertEquals(List.of(), solution.findSubstring("wordgoodgoodgoodbestword", new String[]{"word","good","best","word"}));
        assertEquals(List.of(6,9,12), solution.findSubstring("barfoofoobarthefoobarman", new String[]{"bar","foo","the"}));
        assertEquals(List.of(), solution.findSubstring("", new String[]{"bar","foo","the"}));
        assertEquals(List.of(), solution.findSubstring("barfoofoobarthefoobarman", new String[]{}));
        assertEquals(List.of(8), solution.findSubstring("wordgoodgoodgoodbestword", new String[]{"word","good","best","good"}));
        assertEquals(List.of(13), solution.findSubstring("lingmindraboofooowingdingbarrwingmonkeypoundcake",
                new String[]{"fooo","barr","wing","ding","wing"}));
    }
}
