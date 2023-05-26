def sub(n) :
    finger = n % 8
    if finger in {1} : 
        ans = 1
    elif finger in {0, 2} :
        ans = 2
    elif finger in {3, 7} :
        ans = 3
    elif finger in {4, 6} :
        ans = 4
    else :
        ans = 5
    return (ans)

if __nam__ == "__main__" :
    n = int(input())
    print(sub(n=n))