package i;

public class Tree {

	
	
	
	
	  public TreeNode invertTree(TreeNode root) {
		
		  if(root == null) {
			  return null;
			  
		  }
		  
		  TreeNode tree = root.left;
	       root.left = invertTree(root.right);
	       root.right = invertTree(tree);
	       
		  
		  return root;
	    }
	  
	  
	  
	  public static void main(String[] args) {
		  
		  
	        TreeNode root = new TreeNode(1);
	        
	        root.left = new TreeNode(2);
	        root.left.left = new TreeNode(3);
	        root.left.right = new TreeNode(4);
	        
	        root.right = new TreeNode(8);
	        root.right.left = new TreeNode(5);
	        root.right.right = new TreeNode(6);
	        
	        
	        Tree tree = new Tree();
	        
	        
	        TreeNode invert = tree.invertTree(root);
	        System.out.print(invert.val);
	    }
	  
	  
	  
	  
	  
	  
	  
	  
}
