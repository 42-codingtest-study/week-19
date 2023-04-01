import sys
from decimal import Decimal, getcontext

# import decimal
# decimal.Decimal(3)

getcontext().prec = 10**6
input = sys.stdin.readline
a, b = map(int, input().split())

print(Decimal(a) + Decimal(b))