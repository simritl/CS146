I implemented this recursively.  
First check if the root is null, if it null then return nothing.  
Then check if both the values at p and q are less than the value of the root.  
If they are, then this function will recursively call itself with the left child becoming the new root node.  
If both values at p and q were greater than the value of the root, then the function will recursuvely call itself with the right child becoming the new root node.  

Otherwise, if none of those apply then just return the root itself. This could happen in cases when the one of the nodes is the root itself, or one node is from the left subtree and the other is from the right subtree.     
