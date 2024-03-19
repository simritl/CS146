class Graph:
    def floodFill(self, image, sr, sc, newColor):
        if not image or not image[0] or sr < 0 or sr >= len(image) or sc < 0 or sc >= len(image[0]) or image[sr][sc] == newColor:
            return image

        self.fillFlood(image, sr, sc, image[sr][sc], newColor)
        return image

    def fillFlood(self, image, row, col, color, newColor):
        if row < 0 or col < 0 or row >= len(image) or col >= len(image[0]) or image[row][col] != color:
            return

        image[row][col] = newColor
        directions = [(1, 0), (-1, 0), (0, 1), (0, -1)]

        for dr, dc in directions:
            self.fillFlood(image, row + dr, col + dc, color, newColor)




if __name__ == "__main__":
    graph = Graph()

    image = [
        [1, 1, 1],
        [1, 1, 0],
        [1, 0, 1]
    ]

    sr, sc, newColor = 1, 1, 2

    result = graph.floodFill(image, sr, sc, newColor)

    print("[")
    for row in result:
        print("  [ ", end="")
        for pixel in row:
            print(pixel, end=" ")
        print("]")
    print("]")
