def fib_num(n):
    first = 0
    second = 1

    if n == 0:
        return first

    for i in range(2, n + 1):
        next = first + second
        first = second
        second = next

    return second


if __name__ == "__main__":

    n = 11
    print(fib_num(n))