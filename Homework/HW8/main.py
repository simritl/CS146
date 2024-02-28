class Palin:
    def longestPalindrome(self, s):
        if s is None or len(s) == 0:
            return 0

        even_count = 0
        track = set()

        for char in s:
            if char in track:
                track.remove(char)
                even_count += 1
            else:
                track.add(char)

        if not track:
            return 2 * even_count
        else:
            return 2 * even_count + 1

# Test the function
palin = Palin()
s = "speediskey"
print(palin.longestPalindrome(s))
