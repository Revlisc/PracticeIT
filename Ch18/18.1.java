public void addAll(HashIntSet s) {
    for(int i = 0; i < s.elementData.length; i++) {
        Node current = s.elementData[i];

        while(current != null) {
            if(!contains(current.data))
                add(current.data);
            current = current.next;
        }
    }
}