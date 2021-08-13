package warmke.mike.leet.p8;

public class Solution {

    public int myAtoi(String s) {
        var inputString = s.trim();
        var isNegative = false;
        long result = 0;

        if (inputString.startsWith("+") || inputString.startsWith("-")) {
            isNegative = inputString.startsWith("-");
            inputString = inputString.substring(1);
        }

        for(char c: inputString.toCharArray()) {
            if (!Character.isDigit(c)) {
                break;
            }

            result *= 10;

            if (isNegative) {
                result -= Character.getNumericValue(c);
            } else {
                result += Character.getNumericValue(c);
            }

            if (result <= Integer.MIN_VALUE) return Integer.MIN_VALUE;
            if (result >= Integer.MAX_VALUE) return Integer.MAX_VALUE;
        }

        return (int) result;
    }
}

