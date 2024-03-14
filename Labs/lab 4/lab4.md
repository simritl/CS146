I implemented this recursively too.  
First check if the root is null and if it is then return null.  
Then temporarily assign the left child of the root (current node) to a variable.  
Then set the left child to equal to the what we get after recursively calling invert method on the right child. And set the right child to what we get after recursively calling invert method on the variable we set equal to the left child in the beginning.  This will swap the values and then return the root. 
