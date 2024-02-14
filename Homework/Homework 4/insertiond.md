Best Case:  
The best case for insertion sort would be the case when the input is already sorted.   
In that case, no swaps would need to be made and the inner loop would not even be reached.  
If there are n elements, each element would be iterated through and compared with the element on its left for a total of n - 1 comparisions.    
Therefore in best case insertion sort would take O(n) time.           


Worst Case:  
The worst case for insertion sort would be when the input is sorted the opposite way (backwards).  
In that case, each element would have to iterated through and compared and swapped.   
If there are n elements, there would be a total of n * (n-1)/2 comparisions and swaps.  
Therefore in worst case insertion sort would take O(n^2) time.  



Average Case:  
The average case for insertion sort would be when about half of the input is sorted.  
In that case, if there are n elements, the number of comparisions and swaps would be about n * (n-1)/2.  
Therefore in average case insertion sort would take O(n^2) time.  



