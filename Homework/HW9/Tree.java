package b;

public class Tree {
	
	
	
	public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
		
		if(root == null) {
			return null;
			
		}
		
		if (root.val > p.val && root.val > q.val) {
            
			return lowestCommonAncestor(root.left, p, q);
        } 
		
		else if (root.val < p.val && root.val < q.val) {
            
			return lowestCommonAncestor(root.right, p, q);
        } 
		
		else {
            
			return root;
        }
		
		
	  

	    }
	
	
	
	public static void main (String [] args) {
		
		TreeNode root = new TreeNode(4);
		
		root.left = new TreeNode(2);
	    root.right = new TreeNode(7);
	    root.left.left = new TreeNode(1);
	    root.left.right = new TreeNode(3);
	    root.right.left = new TreeNode(6);
	    root.right.right = new TreeNode(9);
	    
	    TreeNode p = root.left.left; 
	    TreeNode q = root.left;  
	    
	    Tree tree = new Tree();
	    TreeNode ancestor = tree.lowestCommonAncestor(root, p, q);
	    
	    System.out.print(ancestor.val);
	    
		
		
	}
	
	
	
	
	
	
	
	
	
	
	

}
