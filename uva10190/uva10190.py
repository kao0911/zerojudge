'''
#錯誤
import sys

def divide_recursion(n, m, number_list):
    # 將目前的 n 塞進串列
    number_list.append(n)
    #print(f"目前加入的數字: {n}") # 方便你觀察
    
    # 終止條件：當 n 小於 m 時，不再往下除
    if n < m:
        return 
    
    if n % m == 0:
        divide_recursion(n // m, m, number_list)
    else:
        # 如果不能整除，就停在這裡
        print("Boring!")
        return

# --- 主程式 ---
while True:
    line = sys.stdin.readline()
    if not line:
        break
        
    temp_list = line.split()
    if len(temp_list) >= 2:
        n = int(temp_list[0])
        m = int(temp_list[1])
        
        # 準備一個空的串列來裝結果
        my_numbers = []
        is_good = divide_recursion(n, m, my_numbers)
        if is_good:
            print(*my_numbers)
        else:
            print("Boring!")
        
        # 呼叫遞迴（把串列也傳進去）
        #divide_recursion(n, m, my_numbers)
'''
#遞迴
import sys
def divide_recursion(n, m, number_list):
    number_list.append(n)
    
    # 情況 A：成功走到底了
    if n == 1: 
        return True
    
    # 情況 B：還沒到底，但可以繼續除
    if m > 1 and n % m == 0:
        # 這裡很重要！要「接住」下一層傳回來的 True 或 False 並繼續往上傳
        return divide_recursion(n // m, m, number_list)
    
    # 情況 C：不能整除或是 m 太小，失敗了
    return False
while True:
    line = sys.stdin.readline()
    if not line:
        break
        
    temp_list = line.split()
    if len(temp_list) >= 2:
        n = int(temp_list[0])
        m = int(temp_list[1])
    # --- 主程式 ---
    # 這裡就是你問的那行
    my_numbers = []
    # 基本防錯：如果 n < 2 或 m < 2，直接判斷為 Boring
    '''
    $n$ 必須大於等於 $2$（因為要能遞減到 $1$）。$m$ 必須大於等於 $2$（因為要能讓 $n$ 變小）。註： 如果 $n=1$，有些題目會視為 Boring，有些則視為只有一個數字。但對這題來說，$n < 2$ 或 $m < 2$ 通常都是 Boring 的候選人。
    '''
    if n < 2 or m < 2:
        print("Boring!")
    else:
        is_good = divide_recursion(n, m, my_numbers)
        if is_good:
            print(*my_numbers)
        else:
            print("Boring!")
'''
#while-loop（因為除幾次是不確定的）會比 for 迴圈更自然，而且邏輯會變得非常清晰
import sys

while True:
    line = sys.stdin.readline()
    if not line:
        break
    
    temp_list = line.split()
    if len(temp_list) < 2:
        continue
        
    n = int(temp_list[0])
    m = int(temp_list[1])
    
    my_numbers = []
    is_boring = False
    
    # 1. 先處理特殊情況：m < 2 或 n < 2 (除非 n=1, m=1，但這題通常 m 必須 > 1)
    if m < 2 or n < 2:
        is_boring = True
    else:
        # 2. 開始跑迴圈
        while True:
            my_numbers.append(n)
            
            if n == 1: # 成功抵達終點
                break
                
            if n % m == 0: # 可以整除，繼續除
                n = n // m
            else: # 不能整除，失敗
                is_boring = True
                break
                
    # 3. 根據旗標(Flag)決定印出什麼
    if is_boring:
        print("Boring!")
    else:
        print(*my_numbers)
'''
        
