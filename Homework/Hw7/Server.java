package server;

import java.util.Arrays;

public class Server {
	
	
	
	
	
	public static int minMeetingRooms(int[][] intervals) {
		
		if(intervals.length <= 0) {
			return 0;
		}
		
		int[] start = new int[intervals.length];
		int[] end = new int[intervals.length];
		
		for(int i = 0; i < intervals.length; ++i) {
			start[i] = intervals[i][0];
			end[i] = intervals[i][1];
			
		}
		Arrays.sort(start);
		Arrays.sort(end);
		
		
		int servers = 0; 
		int itr = 0; 
		
		
		for(int i = 0; i < start.length; ++i) {
			if(start[i] < end[itr] ) {
				
				servers++;
				
			}
			else {
				itr++;
				
			}
			
		}
		
		return servers;
		
	}
	
	
	
	
	public static void main(String[]args) {
		
		int[][] intervals = {{0, 1}, {1, 2}, {2, 3}};
		System.out.print(minMeetingRooms(intervals));
		
		
		
	}
	
	

}
