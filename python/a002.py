#2025-08-31

'''
原本是這樣寫的
try:
    while True:
        a = int(input())
        b = int(input())
        print(a+b)
except EOFError:
    pass
'''
try:
    while True:
        a, b = map(int, input().split())  # 讀取一行並分割成兩個整數
        print(a + b)
except EOFError:
    pass
'''
Q1:split後[5, 10]這個是陣列嗎
A1:不是，這是list串列
Q2:map是幹嘛
A2:map是把input()讀進來的東西，透過split()分割後，套用int()轉成整數
Q3:為什麼要用map
A3:因為input()讀進來的東西是字串，要用int()轉成整數才能做加法運算
'''