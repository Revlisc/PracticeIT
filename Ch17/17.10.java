public void doublePositives() {
    doublePositives(overallRoot);
}    
private void doublePositives(IntTreeNode root) {
    if (root != null) {
         if (root.data > 0) {
             int a = root.data;
             root.data = 2 * a;
         }
        doublePositives(root.left);
        doublePositives(root.right);
    }    
}