1. T(N) = 2T(N-1) + 1  
 a = 2, b = 1, f(n) = 1.  
T(n) = O ((n^0)2^(n/1)).  
T(n) = O(2^n).    

2. T(N) = 3T(N-1) + n  
a = 3, b = 1, f(n) = n.  
T(n) = O((n^0)3^n).  
T(n) = O(3^n).  

3. T(N) = 9T(N/2) + n^2  
a = 9, b = 2, f(n) = n^2.  
f(n) = omega(n^(log2(9 + e)).    
T(n) = theta(n^2).  

4. T(N) = 100T(N/2)+ n^(log2(cn+1)).   
 a = 100, b = 2, f(n) = n^(log2(cn+1)).  
f(n) = omega(n^(log2(cn+1))).    
T(n) = theta(n^(log2(cn+1))).

5. T(N) = 4T(N/2) + n^2(logn).  
a = 4, b = 2, f(n) = n^2(logn).  
f(n) = O(n^2)  
T(n) = theta(n^2)  

6. T(N) = 5T(N/2) + (n^2)/logn.  
a = 5, b = 2, f(n) = (n^2)/logn.  
f(n) = O((n^log2(5))log2(5)).  
T(n) = theta((n^log2(5))log2(5)).    




