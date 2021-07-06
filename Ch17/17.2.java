public int countEmpty() {
    return countEmpty(overallRoot);
}    

private int countEmpty(IntTreeNode root) {
    if (root == null) {
       return 1; 
    } else {
       return countEmpty(root.left) + countEmpty(root.right); 
    }    
}