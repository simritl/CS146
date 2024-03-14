I implemented this recursively.  
First I made a helper method to check if the binary tree is a binary search tree.  
It checks if the root (current node) is null and returns true if it is.  
If it is not null, then it checks if the current node is less than or equal to the min, or greater than or equal to the max and returns false if it is becaue that would mean it does not satisy all the conditions of a bst.  
Then it will recursively check the right and left subtrees of the current node to make sure it is satisfying the left and right property of a bst.  

