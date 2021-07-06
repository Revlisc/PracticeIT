public static void stutter(PriorityQueue<Integer> pq) {
	Queue<Integer> stor = new LinkedList<Integer>();
    while(!pq.isEmpty()) {
        stor.add(pq.remove());
    }    
    while(!stor.isEmpty()) {
        int a = stor.remove();
        pq.add(a);
        pq.add(a);
    }    
}