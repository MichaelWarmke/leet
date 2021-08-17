package warmke.mike.leet.p30;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Solution {
    public List<Integer> findSubstring(String s, String[] words) {

        if (words.length == 0) return Collections.emptyList();
        var windowSize =  words.length * words[0].length();
        if (windowSize > s.length()) return Collections.emptyList();

        Map<String, Long> wordsByCountMap = Arrays.stream(words)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        Map<String, Long> wordsInWindowMap = new HashMap<>();

        List<Integer> matches = new ArrayList<>();
        var wordSize = words[0].length();

        for (int i = 0; i <= s.length() - windowSize; i++) {

            for (int j = i; j < i + windowSize; j += wordSize) {
                var word = s.substring(j, j + wordSize);
                var count = wordsInWindowMap.get(word);
                wordsInWindowMap.put(word, count == null ? 1L : count + 1);
            }

            if (wordsInWindowMap.equals(wordsByCountMap)) {
                matches.add(i);
            }

            wordsInWindowMap.clear();
        }

        return matches;
    }
}
//            var word = s.substring(i, i + wordSize);
//            var count = wordsInWindowMap.get(word);
//
//            wordsInWindowMap.put(word, count == null ? 1L : count + 1);
//            wordsInWindow++;
//
//            if (wordsInWindow > words.length) {
//                var wordToRemove = s.substring(i - wordSize * (wordsInWindow - 1), i - wordSize * (wordsInWindow - 2));
//                var removeCount = wordsInWindowMap.get(wordToRemove);
//                if (removeCount > 1) {
//                    wordsInWindowMap.put(wordToRemove, --removeCount);
//                } else {
//                    wordsInWindowMap.remove(wordToRemove);
//                }
//                wordsInWindow--;
//            }
