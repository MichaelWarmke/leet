
#### Got Answer on own
- Minimum Stack
- Evaluate Reverse Polish Notation
- Generate Parentheses
- Car Fleet


#### needed help
- Daily Temperatures

#### no clue
- 

p 22
```java
import java.util.ArrayList;
import java.util.List;

class Solution {

    private List<String> result = new ArrayList<>();
    private int totalParens;

    private void recur(String curParens, int lParenCount, int rParenCount) {
        if (rParenCount == totalParens && lParenCount == totalParens) {
            result.add(curParens);
            return;
        }

        if (lParenCount < totalParens) {
            String modifiedParens = curParens + "(";
            recur(modifiedParens, lParenCount + 1, rParenCount);
        }
        if (lParenCount > rParenCount) {
            String modifiedParens = curParens + ")";
            recur(modifiedParens, lParenCount, rParenCount + 1);
        }
    }

    public List<String> generateParenthesis(int n) {
        totalParens = n;
        recur("", 0, 0);
        return result;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.generateParenthesis(3));
        solution = new Solution();
        System.out.println(solution.generateParenthesis(1));
    }
}
```

Neat's solution - time O(4^n/sqrt(n))
```java 
public class Solution {
    private void backtrack(int openN, int closedN, int n, List<String> res, StringBuilder stack) {
        if (openN == closedN && openN == n) {
            res.add(stack.toString());
            return;
        }

        if (openN < n) {
            stack.append('(');
            backtrack(openN + 1, closedN, n, res, stack);
            stack.deleteCharAt(stack.length() - 1);
        }
        if (closedN < openN) {
            stack.append(')');
            backtrack(openN, closedN + 1, n, res, stack);
            stack.deleteCharAt(stack.length() - 1);
        }
    }

    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        StringBuilder stack = new StringBuilder();
        backtrack(0, 0, n, res, stack);
        return res;
    }
}
```