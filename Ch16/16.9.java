public void stutter() {
    ListNode current = front;
    
    while (current != null) {
        int a = current.data;
        current.next = new ListNode(a);
        current = current.next.next;
    }    
}