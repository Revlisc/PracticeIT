/* Write a recursive method indexOf that accepts two Strings as parameters and 
that returns the starting index of the first occurrence of the second String inside 
the first String (or -1 if not found). The table below lists several calls to your 
method and their expected return values. Notice that case matters, as in the last example
 that returns -1.

Call	Value Returned
indexOf("Barack Obama", "Bar")	0
indexOf("Barack Obama", "ck")	4
indexOf("Barack Obama", "a")	1
indexOf("Barack Obama", "McCain")	-1
indexOf("Barack Obama", "BAR")	-1
Strings have an indexOf method, but you are not allowed to call it. You are limited to these methods: */
public static int indexOf(String a, String b) {
        if (a.length() == b.length()) {
            if (a.equals(b)) {
                return 0;
            } 
        } else if (a.length() >= b.length()) {
            int length = b.length();
            if (a.substring(0, length).equals(b)) {
                return 0;
            } else {
                int result = 1 + indexOf(a.substring(1), b);
                if (result != 0) {
                    return result;
                }
            }
        }
        return -1;
    }