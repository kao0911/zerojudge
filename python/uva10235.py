import math

# 判斷質數的函數
def is_prime(num):
    if num <= 1:
        return False  # 小於或等於 1 的數不是質數
    for i in range(2, int(math.sqrt(num)) + 1):
        if num % i == 0:
            return False  # 如果 num 能被 i 整除，則不是質數
    return True  # 沒有發現任何因數，則是質數

# 反轉數字的函數
def reverse_number(num):
    return int(str(num)[::-1])  # 將數字轉換為字串後反轉，並轉回整數
#str(num)：將數字轉換為字串，例如 123 變成 "123"。
#[::-1]：反轉字串。步長 -1 表示從右向左遍歷字串，把每個字元從最後一個拿到第一個，達到反轉的效果。例如，"123" 變成 "321"。

# 主程式
while True:
    try:
        n = int(input())  # 輸入數字
    except EOFError:  # 檢查是否到達輸入結束
        break
    
    if not is_prime(n):
        print(f"{n} is not prime.")  # 如果不是質數，輸出
    else:
        reversed_n = reverse_number(n)  # 反轉數字
        if n != reversed_n and is_prime(reversed_n):
            print(f"{n} is emirp.")  # 反轉後的數字也是質數且不同，輸出 emirp
            #在 Python 中，f-string 是一種動態字串格式化方式，它會將變數或表達式的值插入到字串中的 {} 內。即使 n 是數字、列表或其他類型，Python 會自動將其轉換為字串。
        else:
            print(f"{n} is prime.")  # 是質數但不是 emirp，輸出 prime
