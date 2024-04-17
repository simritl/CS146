from typing import List
class City:
    def findTheCity(self, n: int, edges: List[List[int]], distanceThreshold: int) -> int:

        distanceMatrix = [[0 if i == j else n * 10001 for j in range(n)] for i in range(n)]


        for edge in edges:
            city1, city2, distance = edge
            distanceMatrix[city1][city2] = distance
            distanceMatrix[city2][city1] = distance


        for k in range(n):
            for i in range(n):
                for j in range(n):
                    if distanceMatrix[i][k] + distanceMatrix[k][j] < distanceMatrix[i][j]:
                        distanceMatrix[i][j] = distanceMatrix[i][k] + distanceMatrix[k][j]


        minReachableCities = n
        optimalCity = -1
        for city in range(n):
            reachableCities = sum(1 for otherCity in range(n) if distanceMatrix[city][otherCity] <= distanceThreshold)
            if reachableCities <= minReachableCities:
                minReachableCities = reachableCities
                optimalCity = city

        return optimalCity


city = City()
n = 4
edges = [[0, 1, 3], [1, 2, 1], [1, 3, 4], [2, 3, 1]]
distanceThreshold = 4
result = city.findTheCity(n, edges, distanceThreshold)
print(result)
