import math

# 將二進制字串轉換為十進制
def binary_to_decimal(binary_str):
    return int(binary_str, 2)
    #int(binary2, 2)：當提供第二個參數時，Python 會將該數字視為其他進制（例如二進制、八進制、十六進制等）。在這裡，2 告訴 Python 這是二進制數字，然後 int() 會將其轉換為十進制。

# 判斷兩個二進制數字是否有共同的 GCD
def has_common_love(binary1, binary2):
    decimal1 = binary_to_decimal(binary1)
    decimal2 = binary_to_decimal(binary2)
    
    # 計算 GCD
    gcd_value = math.gcd(decimal1, decimal2)
    
    # 如果 GCD 大於 1，則它們有共同點
    return gcd_value > 1

# 讀取輸入並處理每個測試案例
def solve():
    n = int(input())  # 讀取測試案例數量
    for i in range(1, n+1):
        binary1 = input().strip()
        binary2 = input().strip()
        #.strip()：這是一個字串方法，會移除字串前後的所有空白字元，包括空格、換行符號、制表符等。這在處理輸入時很常用，因為輸入的資料可能包含不必要的空白符號，這可能導致後續處理出現問題。
        
        if has_common_love(binary1, binary2):
            print(f"Pair #{i}: All you need is love!")
        else:
            print(f"Pair #{i}: Love is not all you need!")

# 呼叫 solve() 函數來處理輸入
solve()

