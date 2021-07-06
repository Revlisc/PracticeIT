public void printLeaves() {
   if (overallRoot == null) {
      System.out.println("no leaves"); 
   } else {
       System.out.print("leaves: ");
       printLeaves(overallRoot);
   }    
}    
private void printLeaves(IntTreeNode root) {
    if (root == null) {
        return;
    } else if (root.right == null && root.left == null) {
        System.out.print(root.data + " ");
    } else {
        printLeaves(root.right);
        printLeaves(root.left);
    }    
}