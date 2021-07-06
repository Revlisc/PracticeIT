public void switchPairs() {
    ListNode current = front;
    
    while (current != null && current.next != null) {
        ListNode temp = current;
        current.data = current.next.data;
        current.next.data = temp.data;
        current = current.next.next;
    }    
}