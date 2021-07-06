public int kthSmallest(PriorityQueue<Integer> pq, int k) {
    if (k <= 0 || k > pq.size())
	throw new IllegalArgumentException();

    Queue<Integer> q = new LinkedList<Integer>();
    int kthValue = 0;
    int i=0;
    while(!pq.isEmpty()) {
	int element = pq.remove();
	if ( ++i == k)
	    kthValue = element;
	q.add(element);
    }

    while(!q.isEmpty())
	pq.add(q.remove());

    return kthValue;
}