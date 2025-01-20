
## Review 9

#### Got Answer on own
- Longest Consecutive Sequence
- Valid Sudoku
- Group Anagrams

#### needed help
- Encode and Decode Strings
- Top K Frequent Elements

#### no clue
- Product of Array Except Self

p347

```java
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> numberCountMap = new HashMap<>();

        for (int num : nums) {
            if (numberCountMap.containsKey(num)) {
                numberCountMap.put(num, numberCountMap.get(num) + 1);
            } else {
                numberCountMap.put(num, 1);
            }
        }

        List<Integer> topValues = numberCountMap.values().stream()
                .sorted(Collections.reverseOrder())
                .limit(k)
                .toList();

        int[] result = numberCountMap.entrySet().stream()
                .filter(e -> topValues.contains(e.getValue()))
                .mapToInt(Map.Entry::getKey)
                .toArray();

        return result;
    }
```