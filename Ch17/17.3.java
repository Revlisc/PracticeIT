public int depthSum() {
    return depthSum(overallRoot, 1);
}    

private int depthSum(IntTreeNode root, int depth) {
    if (root == null) {
        return 0;
    } else {
        return depth * root.data + depthSum(root.right, depth + 1) + depthSum(root.left, depth + 1);
    }    
}