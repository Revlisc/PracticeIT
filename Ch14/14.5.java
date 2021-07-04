/* Write a method equals that takes as parameters two stacks of integers and 
returns true if the two stacks are equal and that returns false otherwise. To be 
considered equal, the two stacks would have to store the same sequence of integer
 values in the same order. Your method is to examine the two stacks but must return 
 them to their original state 
before terminating. You may use one stack as auxiliary storage. */

public boolean equals(Stack<Integer> s1, Stack<Integer> s2) {
        if (s1.size() != s2.size()) {
            return false;
        }
        
        Stack<Integer> s3 = new Stack<Integer>();
        boolean same = true;
        while (same && !s1.isEmpty()) {
            int num1 = s1.pop();
            int num2 = s2.pop();
            if (num1 != num2) {
                same = false;
            }
            s3.push(num1);
            s3.push(num2);
        }
        same = same && s1.isEmpty();
        while (!s3.isEmpty()) {
            s2.push(s3.pop());
            s1.push(s3.pop());
        }
        return same;
    }