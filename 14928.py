import sys
input = sys.stdin.readline

# N = int(input())

# print(N%20000303)

from decimal import Decimal, getcontext
getcontext().prec=10**6
N = Decimal(input())
print(N%20000303)

