package hw12;

import java.util.Arrays;

public class House {
	
	
	public int minCostToSupplyWater(int n, int[] wells, int[][] pipes) {
		
		int[][] graph = new int[n + 1][n + 1];
       
		for (int[] pipe : pipes) {
           
			int house1 = pipe[0], house2 = pipe[1], cost = pipe[2];
            graph[house1][house2] = cost;
            graph[house2][house1] = cost;
        }
        
		for (int i = 0; i < wells.length; i++) {
            
			graph[0][i + 1] = wells[i];
            graph[i + 1][0] = wells[i];
        }

        boolean[] visited = new boolean[n + 1];
        
        int[] minCosts = new int[n + 1];
        Arrays.fill(minCosts, Integer.MAX_VALUE); 
        minCosts[0] = 0;

        for (int i = 0; i <= n; i++) {
            
        	int minCostNode = -1;
            
        	for (int j = 0; j <= n; j++) {
                
        		if (!visited[j] && (minCostNode == -1 || minCosts[j] < minCosts[minCostNode])) {
                    
        			minCostNode = j;
                }
            }
            
        	visited[minCostNode] = true;
            
        	for (int j = 0; j <= n; j++) {
                
        		if (!visited[j] && graph[minCostNode][j] != 0 && minCosts[j] > graph[minCostNode][j]) {
                    
        			minCosts[j] = graph[minCostNode][j];
                }
            }
        }

        int totalCost = 0;
        
        for (int cost : minCosts) {
            
        	totalCost += cost != Integer.MAX_VALUE ? cost : 0;
        }

        return totalCost;
    }
	
	
	
	public static void main(String[] args) {
        
		int n = 2;
        int[] wells = {1, 1};
        int[][] pipes = {{1, 2, 1}, {1, 2, 2}};
        
        House house = new House();
       
        int minCost = house.minCostToSupplyWater(n, wells, pipes);
        
        System.out.println(minCost);
    }
	
	
}
