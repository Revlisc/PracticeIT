/*
Write a method doubleList that takes an ArrayList of Strings as a parameter and that 
replaces every string with two of that string. For example, if the list stores the values 
{"how", "are", "you?"} before the method is called, it should store the values
 {"how", "how", "are", "are", "you?", "you?"} after the method finishes executing.
*/
public static void doubleList (ArrayList<String> array) {
       for (int i = 0; i < array.size(); i+=2) {
          String s = array.get(i);
          array.add(i, s);
       }
    }