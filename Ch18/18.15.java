public String toString() {
   String s = "[";
   for (int i = 1; i <= size; i++) {
       s += elementData[i];
       if (i < size) {
           s += ", ";
       }    
   }  
   s += "]";
   return s;
    
}