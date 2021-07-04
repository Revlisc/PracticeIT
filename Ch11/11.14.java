/* Write a method intersect that takes two Maps of strings to integers as parameters and 
that returns a new map whose contents are the intersection of the two. The intersection 
of two maps is defined here as the set of keys and values that exist in both maps. So if 
some key K maps to value V in both the first and second map, include it in your result. 
If K does not exist as a key in both maps, or if K does not map to the same value
 V in both maps, exclude that pair from your result. */

 public static Map<String, Integer> intersect(Map<String, Integer> map1, Map<String, Integer> map2) {
           Map<String, Integer> result = new TreeMap<String, Integer>();
           Iterator<String> i = map1.keySet().iterator();
           while (i.hasNext()) {
              String a = i.next();
              if (map2.containsKey(a) && map1.get(a).equals(map2.get(a))) {
                 result.put(a, map1.get(a));
              }
           }
           return result;
        }