public static void descending(int[] a) {
    Queue<Integer> pq = new PriorityQueue<Integer>();
    for (int n : a) {
        pq.add(n);
    }
    for (int i = 0; i < a.length; i++) {
        a[i] = pq.remove();
    }
}