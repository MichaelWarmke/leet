package warmke.mike.leet.p7;

import java.util.Arrays;

public class Solution {

    public int reverse(int x) {
        var integer = String.valueOf(x);
        var arrayList = Arrays.asList(integer.split(""));
        var builder = new StringBuilder(" ");

        if (arrayList.get(0).equals("-")) {
            builder.replace(0,1,"-");
            arrayList = arrayList.subList(1, arrayList.size());
        }

        for(String c: arrayList) {
            builder.insert(1, c);
        }

        String unsignedString = String.join("", builder).trim();

        try {
            return Integer.parseInt(unsignedString);
        } catch (NumberFormatException e) {
            return 0;
        }
    }
}
