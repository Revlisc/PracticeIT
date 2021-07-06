public boolean isFull() {
    return isFull(overallRoot);
}
private boolean isFull(IntTreeNode root) {
    if (root == null) {
        return true;
    } else if (root.left != null || root.right != null) {
        return false;
    
    } else {
        return isFull(root.left) && isFull(root.right);
    }

}