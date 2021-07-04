/* Write a method isPalindrome that takes a queue of integers as a parameter and returns
 true if the numbers in the queue represent a palindrome (and false otherwise). A sequence
  of numbers is considered a palindrome if it is the same in reverse order. For example, 
  suppose a queue called q stores these values:

front [3, 8, 17, 9, 17, 8, 3] back
Then the call of isPalindrome(q); should return true because this sequence is the same in reverse order. */
public boolean isPalindrome(Queue<Integer> q) {
	Stack<Integer> s = new Stack<Integer>();
    int size = q.size();
    boolean pal = true;
    
        
    for (int i = 0; i < size; i++) {
       int a = q.remove();
       s.push(a);
       q.add(a);
    }    
    for (int i = 0; i < size; i++) {
       int first = q.remove();
       int second = s.pop();
        
       if (first != second) {
           pal = false;
       }    
       q.add(first);
    }    
    return pal;
    
}