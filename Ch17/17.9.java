public boolean equals2(IntTree other) {
    	return equals2(this.overallRoot, other.overallRoot);
    }
    
    private boolean equals2(IntTreeNode root, IntTreeNode root2) {
    	if (root == null && root2 == null) {
    		return true;
    	} else if (root.data != root2.data) {
    		return false;
    	} else {
    		return equals2(root.left, root2.left) && equals2(root.right, root2.right);
    	}
    }