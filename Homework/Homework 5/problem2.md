    yetAnotherFunc(n):                          T(n)
      if n > 1:                                 1
        for(i=0;i<10n;i++)                      n + 1
          doSomething;                          n
        yetAnotherFunc(n/2);                    T(N/2)
        yetAnotherFunc(n/2);                    T(N/2)

Based on this we can guess that the recurrence relation for this pseudocode is T(n) = 2T(N/2)  +  N.  

T(n) = 2T(N/2)  +  n.  
a = 2, b = 2, f(n) = n.  
f(n) = O((n^log(2)2)log n).  
T(n) = O(n log n).  


        
