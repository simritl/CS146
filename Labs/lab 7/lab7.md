First I made a matrix to store the distances between each of the cities. I made the initial values a really big number so that initially there is no connection between the cities and the distance from a city to itself is set to 0.  
Then iterate over the array with the edges and add the actual distances between the cities.  
Then I used Floyd-Warshall to find the shortest paths between the cities by looking at all the vertices and finding the shortest paths between them.  
Then for each city count the numbers of cities that can be reached from them and keep track of the minimum and break any ties if needed by choosing the higher number.  
Then return the most optimal city that was found.  
