First set a random version as the bad version and each version after that will be bad as well.   
In this case version 15 is the first bad version.   
And the boolean will return true if the version is 15 or greater.     



Then for the firstBadVersion:  
Initialize three variables start = 1, end = n, and middle = 0.   
Using a while loop that continues as long as the start is less than the end.  
Calulate the middle by subtracting the start from the end dividing by 2 and adding start to it.   
Then using an if loop we check if the version at the middle index is bad or not using the boolean.  
If it is bad then update the end index to the middle, otherwise the start index updates to middle + 1.   
The loop continues until the first bad version is found and that is returned as the start index.
