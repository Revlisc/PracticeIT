/*
Write a method swapPairs that switches the order of values in an ArrayList of Strings 
in a pairwise fashion. Your method should switch the order of the first two values, then 
switch the order of the next two, switch the order of the next two, and so on. For example, 
if the list initially stores these values: {"four", "score", "and", "seven", "years", "ago"} 
your method should switch the first pair, "four", "score", the second pair, "and", "seven", 
and the third pair, "years", "ago", to yield this list: {"score", "four", "seven", "and", "ago", "years"}

If there are an odd number of values in the list, the final element is not moved. For example,
 if the original list had been: {"to", "be", "or", "not", "to", "be", "hamlet"} It would again 
 switch pairs of values, but the final value, "hamlet" would not be moved, yielding this list: 
 {"be", "to", "not", "or", "be", "to", "hamlet"}
*/
public static void swapPairs (ArrayList<String> array) {
       for (int i = 0; i < array.size() - 1; i+=2) {
          String s = array.get(i + 1);
          String d = array.get(i);
          array.set(i, s);
          array.set(i + 1, d);
       }
    }