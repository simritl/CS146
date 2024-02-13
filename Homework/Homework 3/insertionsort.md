	Insertion-Sort (A, n)                                         1 time (c1)		                                 
	for i = 1 to                                                  n times (c2)	                                                       
	  key = A[i]                                                  n - 1 times (c3) 
	  // Insert A[i] into the sorted subarray A[1: i - 1]         n - 1 times (c4)	 
	  j = i - 1                                                   n - 1 times (c4)	 
	  while j >= 0 and A[j] > key                                 (n * n - 1)/2 (c5)			  
	    A[j + 1] = A[j]                                           (n * n - 1)/2 (c6)	   
	    j = j - 1                                                 (n * n - 1)/2 (c7)	  
	  A[j + 1] = key                                              n - 1 (c8)	  

Growth: c1 + c2(n) + c3(n - 1 ) + c4(n - 1) + c5((n * n - 1)/2) + c6((n * n - 1)/2) + c7((n * n - 1)/2) + c8(n - 1).										
		   
We can simplify this to: (1/2 * (c5 + c6 + c7))(n^2 - 1) + (c2 + c3 + c4 + c8)(n) + (c1 - c3 - c4 - c8).	

This a quadratic expression in the form and the highest degree is 2: an^2 + bn + c.

Where a = (1/2 * (c5 + c6 + c7)),   	      b = (c2 + c3 + c4 + c8),        and c = (c1 - c3 - c4 - c8).

Therefore the function has a quadratic order of growth (n^2).
       
