/*Write a method called removeInRange that accepts four parameters: a List of integers, 
an element value, a starting index, and an ending index. The method's behavior is to remove 
all occurrences of the given element that appear in the list between the starting index (inclusive) 
and the ending index (exclusive). Other values and 
occurrences of the given value that appear outside the given index range are not affected.  */
public static void removeInRange(List<Integer> list, int value, int min, int max) {
	for (int i = min; i < max; i++) {
        if (list.get(i) == value) {
            list.remove(i);
            i--;
            max--;
              
        }  
        
    }    
}