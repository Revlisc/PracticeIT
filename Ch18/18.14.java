public int[] toArray() {
    int[] result = new int[size];
    for (int i = 0; i < size; i++) {
        result[i] = elementData[i+1];
    }
    return result;
}