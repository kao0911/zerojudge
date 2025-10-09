'''
import math
try:
    while True:
        a,b,c=map(int,input().split())
        k=b**2-4*a*c
        if k>0:
            x1 = (-b + math.sqrt(k)) / (2 * a)
            x2=  (-b - math.sqrt(k)) / (2 * a)
            if x1>x2:
                print(f"Two different roots x1={x1} , x2={x2}")
            else:
                print(f"Two different roots x1={x2} , x2={x1}")
        elif k==0:
            x1=x1 = (-b + math.sqrt(k)) / (2 * a)
            x2=x1
            print("Two same roots x="+x1)
        else:
            print("No real root")
except EOFError:
    pass
'''
import math

try:
    while True:
        # 讀取 a, b, c
        a, b, c = map(int, input().split())
        
        # 計算判別式 k = b^2 - 4ac
        k = b**2 - 4*a*c
        
        # 情況 1: 兩個不同的實數根 (k > 0)
        if k > 0:
            # 【關鍵修正】分母 (2*a) 必須加上括號
            x1 = (-b + math.sqrt(k)) / (2 * a)
            x2 = (-b - math.sqrt(k)) / (2 * a)
            
            # 輸出時讓較大的根為 x1
            # 使用 f-string 並格式化到小數點後兩位 (:.2f)
            if x1 > x2:
                print(f"Two different roots x1={int(x1):d} , x2={int(x2):d}")
            else:
                print(f"Two different roots x1={int(x2):d} , x2={int(x1):d}")

        # 情況 2: 兩個相同的實數根 (k = 0)
        elif k == 0:
            # 【關鍵修正】分母 (2*a) 必須加上括號
            x = (-b + math.sqrt(k)) / (2 * a)
            
            #int(x):d 時，它是執行 無條件捨去 的操作
            print(f"Two same roots x={int(x):d}")

        # 情況 3: 無實數根 (k < 0)
        else:
            print("No real root")
            
# 處理 EOFError (例如在線上評測系統中輸入結束時)
except EOFError:
    pass
# 額外處理可能發生的 ValueError (例如輸入非數字)
except ValueError:
    # 這裡可以選擇不處理或印出錯誤訊息，取決於題目要求
    pass
