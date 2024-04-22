from typing import List
import sys


class House:
    def minCostToSupplyWater(self, n: int, wells: List[int], pipes: List[List[int]]) -> int:
        graph = [[sys.maxsize for _ in range(n + 1)] for _ in range(n + 1)]

        for pipe in pipes:
            house1, house2, cost = pipe
            graph[house1][house2] = cost
            graph[house2][house1] = cost

        for i, well_cost in enumerate(wells):
            graph[0][i + 1] = well_cost
            graph[i + 1][0] = well_cost

        visited = [False] * (n + 1)
        min_costs = [sys.maxsize] * (n + 1)
        min_costs[0] = 0

        for _ in range(n + 1):
            min_cost_node = -1
            for j in range(n + 1):
                if not visited[j] and (min_cost_node == -1 or min_costs[j] < min_costs[min_cost_node]):
                    min_cost_node = j

            visited[min_cost_node] = True
            for j in range(n + 1):
                if not visited[j] and graph[min_cost_node][j] != 0 and min_costs[j] > graph[min_cost_node][j]:
                    min_costs[j] = graph[min_cost_node][j]

        total_cost = sum(cost if cost != sys.maxsize else 0 for cost in min_costs)

        return total_cost

    def main(self):
        n = 2
        wells = [1, 1]
        pipes = [[1, 2, 1], [1, 2, 2]]

        minCost = self.minCostToSupplyWater(n, wells, pipes)
        print(minCost)


house = House()
house.main()
