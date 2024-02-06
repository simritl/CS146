def is_bad_version(x):
    if x >= 15:
        return True
    return False


def first_bad_version(n):
    start = 1
    end = n

    while start < end:
        middle = start + (end - start) // 2

        if is_bad_version(middle):
            end = middle

        else:
            start = middle + 1

    return start


if __name__ == "__main__":
    n = 20
    print(first_bad_version(n))
