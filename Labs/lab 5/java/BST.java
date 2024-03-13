package v;

public class BST {

	
	
	public boolean isValidBST(TreeNode root) {
		
		boolean valid = isBST(root,Integer.MIN_VALUE, Integer.MAX_VALUE);
		return valid;

	 }
	
	boolean isBST(TreeNode root, int min, int max) {
		
		if(root == null) {
			return true;
		}
		
		if (root.val <= min || root.val >= max) {
            return false;
        }

        return isBST(root.left, min, root.val) && isBST(root.right, root.val, max);
    }
		
	
	  public static void main(String[] args) {
	  
		  
	        TreeNode root = new TreeNode(1);
	        
	        root.left = new TreeNode(2);
	        root.left.left = new TreeNode(3);
	        root.left.right = new TreeNode(4);
	        
	        root.right = new TreeNode(8);
	        root.right.left = new TreeNode(5);
	        root.right.right = new TreeNode(6);
	        
	        
	        BST bst = new BST();
	        
	        
	        System.out.print( bst.isValidBST(root));
	    }
		
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
}
