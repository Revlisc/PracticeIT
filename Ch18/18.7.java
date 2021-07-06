public String toString() {
    if (isEmpty()) {
        return "[]";
    } else {
        String result = "[";
        for (Node front : elementData) {
            Node current = front;
            while (current != null) {
                if (result.length() > 1) {
                    result += ", ";
                }
                result += current.data;
                current = current.next;
            }
        }
        result += "]";
        return result;
    }
}