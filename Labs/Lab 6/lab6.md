To solve this problem I implemented topological sort.  
First I made an adjacency matrix that will keep track of what course must taken before an another course. And there is an array that will keep track of the number of pre-reqs(in degree).  
Then iterate through the given prereq array and add to the matrix and array.  
Then using a queue add all the elements with in degree 0 to it (these are all the courses that dont have prereqs).  
Then while the queue is not empty remove a course from the queue and increment the count for taken courses and then decrement the in degree of its neighbour courses in the matrix.  Then if there any courses that now have an in degree of 0 add them to the queue, keep going until we have gone through all the courses.  
At the end if the number of taken courses is equal to the total number of courses return true otherwise return false.  
