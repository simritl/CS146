First we check if the given string is null or empty and if it is we return 0 because that wil be the length of its longest palindrome.  
Next we create a variable counter and set it to 0 to start.  
Then create a new hash set of Characters that we will use to keep track of the count of the characters of the string.  
Then iterate through each character of the string and check if it exists in the hash set.  
If it does not exist we will add it to the hash set.  
If it does exist we will remove the character from the hash set and increment the count variable indicating we have a pair of characters.  
Next we will check if the hash set is empty or not.  
At this point the hash set will be empty if there were only an even number of each characters in the string if the hash set is not empty then it contains one of each remaining character.  
If it is empty return the count times 2 which is the length of the longest palindrome.  
If it is not empty then multiply the count by 2, add 1 and return accounting for the adding one element of odd count from the hash set and that would be the longest palindrome in that case.  
