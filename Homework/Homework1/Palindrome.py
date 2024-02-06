def is_palindrome(s):
    s = s.lower()
    s = ''.join(char for char in s if char.isalnum())

    reverse = ""
    for i in range(len(s) - 1, -1, -1):
        reverse += s[i]

    return s == reverse

if __name__ == "__main__":
    test_string = "racecar"
    print(is_palindrome(test_string))
