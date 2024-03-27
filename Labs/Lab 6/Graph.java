package lab06;

import java.util.*;

public class Graph {
	
	
	public boolean canFinish(int numCourses, int[][] prerequisites) {
        
	int[][] adjMatrix = new int[numCourses][numCourses];
        int[] inDegree = new int[numCourses];
       
        for (int[] prerequisite : prerequisites) {
            
            int from = prerequisite[1];
            int to = prerequisite[0];
            
            if (adjMatrix[from][to] == 0) {
               
            	adjMatrix[from][to] = 1;
                inDegree[to]++;
            }
        }

        Queue<Integer> queue = new LinkedList<>();
        
        for (int i = 0; i < numCourses; i++) {
            
        	if (inDegree[i] == 0) {
                
        		queue.offer(i);
            }
        }

        int count = 0;
       
        while (!queue.isEmpty()) {
            
            int course = queue.poll();
            count++;
            
            for (int i = 0; i < numCourses; i++) {
               
            	if (adjMatrix[course][i] == 1) {
                   
            		inDegree[i]--;
                   
            		if (inDegree[i] == 0) {
                       
            			queue.offer(i);
                    }
                }
            }
        }

        return count == numCourses;
    }

    public static void main(String[] args) {
        
    	Graph g = new Graph();

  
        int numCourses = 2;
        int[][] prerequisites = {{1, 0}};
        System.out.println(g.canFinish(numCourses, prerequisites));
       
	
	
	
    }
}
