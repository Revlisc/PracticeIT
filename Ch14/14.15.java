/* Write a method isSorted that accepts a stack of integers as a parameter and returns true
 if the elements in the stack occur in ascending (non-decreasing) order from top to bottom, 
 and false otherwise. That is, the smallest element should be on top, growing larger toward 
 the bottom. For example, passing the following stack to your method should cause it to return true:

bottom [20, 20, 17, 11, 8, 8, 3, 2] top
The following stack is not sorted (the 15 is out of place), so passing it to your method
 should return a result of false:

bottom [18, 12, 15, 6, 1] top */
public static boolean isSorted(Stack<Integer> s) {
	if (s.size() < 2) {
       return true;   
    }    
    boolean sorted = true;
    int prev = s.pop();
    Stack<Integer> s2 = new Stack<Integer>();
    s2.push(prev);
    while (!s.empty()) {
        int cur = s.pop();
        s2.push(cur);
        if (prev > cur) {
            sorted = false;
        }  
        prev = cur;
    }    
    while (!s2.empty()) {
        s.push(s2.pop());
    }    
    return sorted;
}