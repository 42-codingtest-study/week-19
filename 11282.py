def change(n) :
    return chr(ord('가') + n - 1)

if __name__ == "__main__" :
    n = int(input())
    print(change(n))