public int deleteBack() {
    ListNode current = front;
    
    if (current == null) {
       throw new NoSuchElementException(); 
    } else if (current.next == null) {
       int a = current.data;
       front = null;
       return a; 
    } else {
        while (current.next.next != null) {
            current = current.next;
        }
        
        int a = current.next.data;
        current.next = null;
        return a;
    }    
}