public void tighten() {
    overallRoot = tighten(overallRoot);
}    
private IntTreeNode tighten(IntTreeNode root) {
    if (root == null) {
       return null; 
    } else if (root.left != null && root.right == null) {
       return tighten(root.left); 
    } else if (root.left == null && root.right != null) {
       return tighten(root.right); 
    } else {
        root.left = tighten(root.left);
        root.right = tighten(root.right);
        return root;
    }    
}