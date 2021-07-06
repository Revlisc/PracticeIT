public int countLeftNodes() {
    return countLeftNodes(overallRoot);
}

public int countLeftNodes(IntTreeNode root) {
    int count = 0;
    if (root == null) {
        return 0;
    } else if (root.left != null) {
        count++;
        return countLeftNodes(root.left);
    }    
}