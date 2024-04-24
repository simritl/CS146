from typing import List


class Change:
    def coinChange(self, coins: List[int], amount: int) -> int:
        dp = [0] + [float('inf')] * amount

        for i in range(1, amount + 1):
            for coin in coins:
                if i - coin >= 0:
                    dp[i] = min(dp[i], dp[i - coin] + 1)

        return dp[amount] if dp[amount] != float('inf') else -1


if __name__ == "__main__":
    change = Change()
    coins = [1, 2, 5]
    amount = 11
    result = change.coinChange(coins, amount)
    print(result)
