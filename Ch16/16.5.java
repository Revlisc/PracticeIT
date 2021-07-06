public int countDuplicates() {
    ListNode current = front;
    int sum = 0;
    
    if (front == null) {
       return sum; 
    }    
    
    while (current.next != null) {
        if (current.data == current.next.data) {
            sum++;
        }  
        current = current.next;
    }  
    return sum;
}