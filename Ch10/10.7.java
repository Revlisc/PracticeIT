/*
Write a method removeDuplicates that takes as a parameter a sorted ArrayList of Strings and 
that eliminates any duplicates from the list. For example, suppose that a variable called 
list contains the following values: {"be", "be", "is", "not", "or", "question", "that", "the", "to", "to"} 
After calling removeDuplicates(list); the list should store the following values: 
{"be", "is", "not", "or", "question", "that", "the", "to"}

Because the values will be sorted, all of the duplicates will be grouped together.
*/
public static void removeDuplicates(ArrayList<String> array) {

        for (int i = 0; i < array.size() - 1; i++) {
            if (array.get(i).equals(array.get(i + 1))) {
                array.remove(i + 1);
                i--;
            }
        }
        
    }