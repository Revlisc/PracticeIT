public void completeToLevel(int level) {
    if (level < 1) {
        throw new IllegalArgumentException();
    } else {   
        overallRoot = completeToLevel(overallRoot, level);
    }    
}    

private IntTreeNode completeToLevel(IntTreeNode root, int level) {
    if (root == null) {
       root = new IntTreeNode(-1); 
    }
    if (level == 1) {
       return root; 
    }    
    root.left = completeToLevel(root.left, level - 1);
    root.right = completeToLevel(root.right, level - 1);
    return root;
}