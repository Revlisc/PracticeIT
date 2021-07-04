/* Write a method countUnique that takes a List of integers as a parameter and returns 
the number of unique integer values in the list. Use a Set as auxiliary storage to help 
you solve this problem.

For example, if a list contains the values [3, 7, 3, -1, 2, 3, 7, 2, 15, 15], your method 
should return 5. The empty list contains 0 unique values. */

public static int countUnique(List<Integer> list) {
	Set<Integer> set = new HashSet<Integer>();
    for (int a: list) {
       set.add(a);        
    }    
    return set.size();
}