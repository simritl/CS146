package coin;

public class Change {
	
	
	public int coinChange(int[] coins, int amount) {
		
		int[] dp = new int[amount+1];
       
		for (int i = 1; i<= amount;i++){
            
			int min = amount+1;
           
			for (int j = 0; j<coins.length;j++){
                
				int remaining = i - coins[j];
               
				if (remaining >= 0 && dp[remaining] != -1) {
                   
					int temp = dp[remaining] + 1;
                   
					if (temp < min) {
                       
						min = temp; 
                    }
                }
            }

            if (min == amount+1) {
                
            	dp[i] = -1;
            } 
           
            else {
               
            	dp[i] = min;
            }

        }
        return dp[amount];
   }
	
	public static void main(String[] args) {
        
		Change change = new Change();

 
        int[] coins = {1, 2, 5};
        int amount = 11;
       
        int result = change.coinChange(coins, amount);
        
        System.out.println(result);
   

    }
		
	 }
	
	
	



