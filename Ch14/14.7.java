/* Write a method reverseHalf that reverses the order of half of the elements of a 
Queue of integers. Your method should reverse the order of all the elements in odd-numbered 
positions (position 1, 3, 5, etc.) assuming that the first value in the queue has position 0.
 For example, if the queue originally stores this sequence of numbers when the method is called:

index: 0  1  2  3  4  5   6   7
front [1, 8, 7, 2, 9, 18, 12, 0] back
- it should store the following values after the method finishes executing:

index: 0  1  2  3   4  5  6   7
front [1, 0, 7, 18, 9, 2, 12, 8] back */
public void reverseHalf(Queue<Integer> q) {
	Stack<Integer> s = new Stack<Integer>();
    int a = q.size();
    
    for (int i = 0; i < a; i++) {
       if (i % 2 != 0) {
           s.push(q.remove());
       } else {
           q.add(q.remove());
       }    
    }   
    while (!s.empty()) {
       q.add(q.remove());
       q.add(s.pop());
    } 
    if (a % 2 != 0) {
       q.add(q.remove()); 
    }    
}