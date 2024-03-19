package hw10;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Order {
	
	
	
    public List<List<Integer>> levelOrder(TreeNode root) {
    	
    	
    	List<List<Integer>> result = new ArrayList<>();

         if (root == null) {
            
        	 return result;
         }

         Queue<TreeNode> queue = new LinkedList<>();
         
         queue.offer(root);

         while (!queue.isEmpty()) {
             
        	 int levelSize = queue.size();
             
        	 List<Integer> currentLevel = new ArrayList<>();

             for (int i = 0; i < levelSize; i++) {
                
            	 TreeNode current = queue.poll();
                 currentLevel.add(current.val);

                 if (current.left != null) {
                     
                	 queue.offer(current.left);
                 }

                 if (current.right != null) {
                     
                	 queue.offer(current.right);
                 }
             }

             result.add(currentLevel);
         }

         return result;
     }
    
    
    
    
    public static void main(String[] args) {
        
    	TreeNode root = new TreeNode(4);

        
        root.left = new TreeNode(3);
        root.left.left = new TreeNode(1);
        
        root.right = new TreeNode(8);
        root.right.left = new TreeNode(5);
        root.right.right = new TreeNode(9);

        Order order = new Order();

        List<List<Integer>> result = order.levelOrder(root);

        for (List<Integer> level : result) {
            System.out.println(level);
        }
    }
    
    

}
