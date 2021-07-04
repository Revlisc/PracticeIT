/* Write a method countCommon that takes two Lists of integers as parameters and returns
 the number of unique integers that occur in both lists. 
Use one or more Sets as storage to help you solve this problem.

For example, if one list contains the values [3, 7, 3, -1, 2, 3, 7, 2, 15, 15] and 
the other list contains the values [-5, 15, 2, -1, 7, 15, 36], your method should return 
4 (because the elements -1, 2, 7, and 15 occur in both lists). */

public static int countCommon(List<Integer> list1, List<Integer> list2) {
        Set<Integer> set1 = new HashSet<Integer>(list1);
        Iterator<Integer> i1 = set1.iterator();
        int count = 0;
        
        while (i1.hasNext()) {
            if (list2.contains(i1.next())) {
               count++; 
            }    
        }   
        return count;
        
        
    }