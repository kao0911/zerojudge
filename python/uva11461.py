'''錯誤
import math
a,b =map(int,input().split())
while a!=0 & b!=0:
    i=a
    for i in range (a,b+1):
        count=0
        if math.sqrt(i)%1==0:
            count+1
    print(count)
    print("\n")
    a,b =map(int,input().split())
'''

'''正確(Time Limmit Exceded)
import math

a, b = map(int, input().split())
while a != 0 and b != 0:
    count = 0  # 將計數器移到循環外部
    for i in range(a, b + 1):
        if math.sqrt(i) % 1 == 0:
            count += 1  # 正確地增加計數器
    print(count)
    a, b = map(int, input().split())
'''
import math  # 引入數學模組

def count_square_numbers(a, b):
    # 計算大於等於 a 的最小整數 n，使得 n^2 >= a
    n = math.ceil(math.sqrt(a))
    # 計算小於等於 b 的最大整數 m，使得 m^2 <= b
    m = math.floor(math.sqrt(b))
    # 返回在範圍 [a, b] 內的完全平方數的個數
    return max(0, m - n + 1)

# 主程式迴圈
while True:
    # 讀取一行輸入，並將其分割為兩個整數 a 和 b
    a, b = map(int, input().split())
    # 當 a 和 b 都為 0 時，結束程式
    if a == 0 and b == 0:
        break
    # 輸出範圍 [a, b] 內的完全平方數的個數
    print(count_square_numbers(a, b))
