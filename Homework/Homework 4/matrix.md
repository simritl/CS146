Best Case:   
The best case for matrix multipliaction would be when columns(A) = rows(B) and the input size is small.   
In this case, if the size is n x n, it would still iterate throughout all elements to perform the multipliaction and it would take O(columns(A) * rows(B) * rows(A)) time.  
Therefore the best case for matrix multipliaction would take O(n^3) time.  


Worst Case:   
The worst case for matrix multipliaction would be when columns(A) ≠ rows(B) and the program terminates early.  
It would raise an error and even though it only take constant time, the program does not perform any operations so it would be worst case.  
Therefore the worst case for matrix multipliaction would take O(1) time.  

Average Case:   
In the average case for matrix multipliaction it would still have to iterate through the entire matrices regardless of the size.   
So, it would take O(columns(A) * rows(B) * rows(A)) time.  
Therefore the average case for matrix multipliaction would take O(n^3) time.   

