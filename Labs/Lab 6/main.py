from collections import deque

def canFinish(numCourses, prerequisites):
    adjMatrix = [[0] * numCourses for _ in range(numCourses)]
    inDegree = [0] * numCourses

    for prerequisite in prerequisites:
        from_course, to_course = prerequisite[1], prerequisite[0]
        if adjMatrix[from_course][to_course] == 0:
            adjMatrix[from_course][to_course] = 1
            inDegree[to_course] += 1

    queue = deque()
    for i in range(numCourses):
        if inDegree[i] == 0:
            queue.append(i)

    count = 0
    while queue:
        course = queue.popleft()
        count += 1
        for i in range(numCourses):
            if adjMatrix[course][i] == 1:
                inDegree[i] -= 1
                if inDegree[i] == 0:
                    queue.append(i)

    return count == numCourses


numCourses = 2
prerequisites = [[1, 0]]
print(canFinish(numCourses, prerequisites))
