def is_anagram(s, t):
    sorted_s = sorted(s)
    sorted_t = sorted(t)
    return sorted_s ==sorted_t



def main():
    s = "elbow"
    t = "below"
    print(is_anagram(s, t))


if __name__ == "__main__":
    main()
