/* Write a method contains3 that accepts a List of strings as a parameter and returns 
true if any single string occurs at least 
3 times in the list, and false otherwise. Use a map as auxiliary storage. */

public static boolean contains3(List<String> list) {
           Map<String, Integer> map = new HashMap<String, Integer>();
           Iterator<String> i = list.iterator();
           for (String a: list) {
              if (map.containsKey(a)) {
                 int number = map.get(a);
                 number++;
                 map.put(a, number);
                 if (number > 2) {
                    return true;
                 }
              } else {
                 map.put(a, 1);
              }
           }
           return false;
        }