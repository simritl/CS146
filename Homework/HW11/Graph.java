package hw11;

public class Graph {
	
	
	
	public int[][] floodFill(int[][] image, int sr, int sc, int color) {
	
		
		if (image == null || image.length == 0 || image[0].length == 0 || sr < 0 || sr >= image.length || sc < 0 || sc >= image[0].length ) {
            return image;
        }
		
		if(image [sr][sc] == color ) {
			
			return image;
			
		}
		
		fillFlood(image, sr, sc, image[sr][sc], color);
		
		return image;

	    }
	
	
	public void fillFlood(int[][] image, int row, int col, int color, int newColor) {
		
		if (row < 0 || col < 0 || row >= image.length || col >= image[0].length || image[row][col] != color) {
            
			return;
	}
		
		image[row][col] = newColor;
        
		int[][] directions = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};
        
        for (int[] dir : directions) {
            fillFlood(image, row + dir[0], col + dir[1], color, newColor);
        }
		
	}
	
	
	
	public static void main (String [] args) {
		
		Graph graph = new Graph();
		
		int[][] image = {
                {1, 1, 1},
                {1, 1, 0},
                {1, 0, 1}
        };
		
		int sr = 1, sc = 1, newColor = 2;

        int[][] result = graph.floodFill(image, sr, sc, newColor);
        
        System.out.println("[");
        for (int[] row : result) {
            System.out.print("  [ ");
            for (int pixel : row) {
                System.out.print(pixel + " ");
            }
            System.out.println("],");
        }
        System.out.println("]");
    }
		
		
	}


