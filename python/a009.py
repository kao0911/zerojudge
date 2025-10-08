import sys
'''
try:
    while True:
        text=input()
        ch=sys.stdin.read(1)
        result=""
        for ch in text:
        因為 ch = sys.stdin.read(1) 的結果沒有被用在後續程式中。
迴圈裡重新用 for ch in text: 定義了新的 ch，覆蓋前一個變數。
            result +=chr(ord(ch)-7)
        print(result)
except EOFError:
    pass
'''


try:
    while True:
        s = input()
        result = ""
        for ch in s:
            #for ch in s:：依序取出 s 的每個字元存入變數 ch
            result += chr(ord(ch) -7)
            #ChatGPT 說：ord(ch)：把字元轉成 ASCII（或 Unicode）數值。chr(n)：把數值轉回字元。
        print(result)
except EOFError:
    pass