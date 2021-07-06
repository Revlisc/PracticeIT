public void stretch(int factor) {
    if (factor <= 0) {
        front = null;
    } else {
        ListNode current = front;
        for (int i = 0; i <= factor; i++) {
            current.next = new ListNode(current.data, current.next);
            current = current.next;
        }    
    }
}