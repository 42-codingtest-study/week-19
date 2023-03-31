def korean(word) :
    return ord(word) - ord('가') + 1

if __name__ == "__main__" :
    word = input()
    print(korean(word))