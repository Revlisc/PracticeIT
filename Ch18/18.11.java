public static void removeDuplicates(PriorityQueue<Integer> pq) {
    if (pq.size() <= 1) {
        return;
    }
    
    Queue<Integer> unique = new LinkedList<Integer>();
    int prev = pq.remove();
    unique.add(prev);
    
    while (!pq.isEmpty()) {
        int next = pq.remove();
        if (prev != next) {
            unique.add(next);
            prev = next;
        }
    }
    
    while (!unique.isEmpty()) {
        pq.add(unique.remove());   // restore queue
    }
}