/* Write a method maxOccurrences that accepts a List of integers as a parameter and 
returns the number of times the most frequently occurring integer (the "mode") occurs in the list. 
Solve this problem using a Map as auxiliary storage. If the list is empty, return 0. */

public static int maxOccurrences(List<Integer> list) {
           Map<Integer, Integer> map = new HashMap<Integer, Integer>();
           Iterator<Integer> i = list.iterator();
           for (int a: list) {
              if (map.containsKey(a)) {
                 map.put(a, map.get(a) + 1);
              } else {
                 map.put(a, 1);
              }
           }
           int max = 0;
           for (int b: map.values()) {
              max = Math.max(max, b);
           }
           return max;
        }