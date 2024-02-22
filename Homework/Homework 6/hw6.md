First sort the input array.  
Then iterate through the array from 0 to the third last element.  
Use to pointers left and right to add two elements to the element chosen previously.  
Skip past duplicates and handle the case that all elements are 0.  
Check the sums and if they are greater than 0 decrement left if less than 0 increment right.  
Once a triplet is found add it to the list.  
Then return the list once all possible triplets of elements have been iterated through. 

