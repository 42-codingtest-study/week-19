def chobab(t, s) :
    if (0 <= t < 12) or (16 < t <= 23) or s == 1:
        babr = 280
    else :
        babr = 320
    return babr

if __name__ == "__main__" :
    t, s = map(int, input().split())
    print(chobab(t = t, s = s))