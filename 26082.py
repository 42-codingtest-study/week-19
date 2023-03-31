def war(a, b, c) :
    return (b //a) * 3 * c

if __name__ == "__main__" :
    a, b, c = map(int, input().split())
    print(war(a = a, b = b, c = c))