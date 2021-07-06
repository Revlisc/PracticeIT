public void removeAll(HashIntSet other) {
    for (Node front : other.elementData) {
        Node current = front;
        while (current != null) {
            if (contains(current.data)) {
                remove(current.data);
            }
            current = current.next;
        }
    }
}