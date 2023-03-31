a, b, c, d = map(int, input().split())
n = (b // d) * (c // d)

if n >= a :
    print(a)
else :
    print(n)