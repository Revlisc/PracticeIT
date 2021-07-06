public void printLevel(int level) {
    if (level <= 0) {
        throw new IllegalArgumentException();
    } else {   
       printLevel(overallRoot, level, 1);
    }    
}    

private void printLevel(IntTreeNode root, int level, int depth) {
    if (root != null) {
       if (level == depth) {
           System.out.println(root.data);
       } else {
           printLevel(root.left, level, depth + 1);
           printLevel(root.right, level, depth + 1);
       }    
    }    
}