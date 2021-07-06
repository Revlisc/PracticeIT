public boolean isConsecutive(PriorityQueue<Integer> pq) {
    if (pq.isEmpty())
	return true;

    Queue<Integer> aux = new LinkedList<Integer>();
    boolean isConsecutive = true;
    while (!pq.isEmpty()) {
	int element = pq.remove();
	if (isConsecutive && !pq.isEmpty() && element != pq.peek() - 1) {
	    isConsecutive = false;
	}
	aux.add(element);
    }
    while(!aux.isEmpty())
	pq.add(aux.remove());
    return isConsecutive;
}