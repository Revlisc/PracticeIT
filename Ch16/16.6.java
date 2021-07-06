public boolean hasTwoConsecutive() {
    ListNode current = front;
    
    if (front == null) {
        return false;
    } else {
        while (current != null) {
            if (current.data == current.next.data - 1) {
                return true;
            }  
                current = current.next;  
        }    
    }  
    return false;
}