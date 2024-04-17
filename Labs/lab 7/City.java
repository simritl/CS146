package lab07;

public class City {
	
	public int findTheCity(int n, int[][] edges, int distanceThreshold) {
		
		
		int[][] distanceMatrix = new int[n][n];
	    
		for (int i = 0; i < n; i++) {
	        
			for (int j = 0; j < n; j++) {
	            
				if (i == j) {
	                
					distanceMatrix[i][j] = 0; 
	            
				} else {
	                
					distanceMatrix[i][j] = n * 10001; 
	            }
	        }
	    }

	    
	    for (int[] edge : edges) {
	        
	    	int city1 = edge[0];
	        int city2 = edge[1];
	        int distance = edge[2];

	        distanceMatrix[city1][city2] = distance;
	        distanceMatrix[city2][city1] = distance;
	    }

	    
	    for (int k = 0; k < n; k++) {
	        
	    	for (int i = 0; i < n; i++) {
	            
	    		for (int j = 0; j < n; j++) {
	                
	    			if (distanceMatrix[i][k] + distanceMatrix[k][j] < distanceMatrix[i][j]) {
	                    
	    				distanceMatrix[i][j] = distanceMatrix[i][k] + distanceMatrix[k][j];
	                }
	            }
	        }
	    }

	   
	    int minReachableCities = n;
	    int optimalCity = -1;
	    
	    for (int city = 0; city < n; city++) {
	        
	    	int reachableCities = 0;
	        
	    	for (int otherCity = 0; otherCity < n; otherCity++) {
	            
	    		if (distanceMatrix[city][otherCity] <= distanceThreshold) {
	                
	    			reachableCities++;
	            }
	        }
	        
	    	if (reachableCities <= minReachableCities) {
	            
	    		minReachableCities = reachableCities;
	            optimalCity = city;
	        }
	    }

	    return optimalCity;

        

    }
	
	
	
	
	public static void main(String[] args) {
		 
		 City city = new City(); 
	     
		 int n = 4;
		 int[][] edges = {{0, 1, 3}, {1, 2, 1}, {1, 3, 4}, {2, 3, 1}};
	     int distanceThreshold = 4;
	     int result = city.findTheCity(n, edges, distanceThreshold); 
	     
	     System.out.println(result);
    }
	
	
	
	

	
	
	
	
	

}
