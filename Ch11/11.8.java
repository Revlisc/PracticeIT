/* Write a method maxLength that takes a Set of strings as a parameter and that 
returns the length of the longest string 
in the set. If your method is passed an empty set, it should return 0. */

public static int maxLength(Set<String> set) {
           int max = 0;
           Iterator<String> i = set.iterator();
           
           for (String a: set) {
              if (a.length() > max) {
                 max = a.length();
              }
           }
           return max;
        }