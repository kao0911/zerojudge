#10057 - A mid-summer nights dream
#output1：第一個數字（最小可能的 A）
#output2：從你輸入的那堆數字裡，挑出那些落在『中位數區間』裡的數字，並算出總共有幾個。
#output3：第三個數字（所有可能的 A 總共有幾種）也就是說能讓算式達到最小值的 A 總共有幾種可能
'''
numbers=[]
k=int(input("你想輸入幾個數字？ "))
for i in range(k):
   val = int(input(f"請輸入第 {i+1} 個數字："))
   numbers.append(val)
numbers.sort()
print("排序後的結果：", numbers)
if k%2 !=0:
   a=numbers[k//2]
   print(a)
   q_3=1
else:
   a=numbers[k//2-1]
   print(a)
   q_3=numbers[k//2]-numbers[k//2-1]+1
how_many = numbers.count(a)
print(f"數字 {a} 總共出現了 {how_many} 次！")
print(q_3)
'''
import sys
while True:
    try:
        numbers=[]
        k=int(input())
        for i in range(k):
            val = int(input())
            numbers.append(val)
        numbers.sort()
        if k%2 !=0:
            a=numbers[k//2]
            q_3=1
            how_many=1 # <--- 這裡錯了！
            '''
            錯誤原因： 你直接設定 how_many = 1，這代表你假設「輸入的數字中，等於中位數的只有一個」。
            但如果輸入是 [1, 3, 3]，$k=3$（奇數），中位數是 3。但在輸入資料裡，3 出現了 2 次。
            所以正確答案應該是 3 2 1，你的程式卻會印出 3 1 1。
            '''
        else:
            a=numbers[k//2-1]
            q_3=numbers[k//2]-numbers[k//2-1]+1
            how_many = 0
            for x in numbers:
                if x >= numbers[k//2-1] and x <= numbers[k//2]:
                    how_many += 1
        print(a,how_many,q_3)
    except EOFError:
        break  # 讀到檔案結尾，優雅地結束程式
'''
更正：
import sys

while True:
    try:
        numbers = []
        k = int(input())
        for i in range(k):
            val = int(input())
            numbers.append(val)
        
        numbers.sort()

        # 這裡我們定義 mid1 (左邊那個) 和 mid2 (右邊那個)
        if k % 2 != 0:
            mid1 = numbers[k // 2]
            mid2 = numbers[k // 2] # 奇數時，左右都是同一個
            a = mid1
            q_3 = 1
        else:
            mid1 = numbers[k // 2 - 1]
            mid2 = numbers[k // 2]
            a = mid1
            q_3 = mid2 - mid1 + 1
        
        # 統一計算有多少個數字落在 [mid1, mid2] 區間
        how_many = 0
        for x in numbers:
            if x >= mid1 and x <= mid2:
                how_many += 1
                
        print(a, how_many, q_3)

    except EOFError:
        break
    except ValueError: # 防止讀到空行報錯
        break
'''



#gemini
'''
import sys

while True:
    # 改用 sys.stdin.readline 處理大數據比較穩
    line = sys.stdin.readline()
    if not line:
        break
    try:
        k = int(line.strip())
        numbers = []
        for i in range(k):
            val = int(sys.stdin.readline().strip())
            numbers.append(val)
        # --- 修正 1：把 sort 移出來，只排一次 ---
        numbers.sort()

        if k % 2 != 0:
            # 奇數：中間只有一個點
            mid_left = numbers[k // 2]
            mid_right = numbers[k // 2]
            a = mid_left
            q_3 = 1
        else:
            # 偶數：中間有兩個點
            mid_left = numbers[k // 2 - 1]
            mid_right = numbers[k // 2]
            a = mid_left
            q_3 = mid_right - mid_left + 1

        how_many = 0
        #這裡的 x 是一個**「變數名稱」，它代表你在 for 迴圈中，「每一次輪流從 numbers 盒子裡拿出來的那一個數字
        for x in numbers:
            if x >= mid_left and x <= mid_right:
                how_many += 1
                
        print(a, how_many, q_3)

    except (EOFError, ValueError):
        break
'''