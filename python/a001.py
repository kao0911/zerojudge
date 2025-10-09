#2025-08-31
try:
    while True:
        a = input()
        print("hello, " + a)
except EOFError:
    pass
# try:
# 開始一個例外處理區塊，準備捕捉可能發生的錯誤（這裡是 EOFError）。
#
# while True:
# 建立一個無窮迴圈，持續執行裡面的程式碼。
#
# a = input()
# 讀取使用者輸入。如果遇到檔案結尾（EOF），會拋出 EOFError。
#
# print("hello, " + a)
# 將輸入的內容加上 "hello, " 並印出。
#
# except EOFError:
# 當遇到 EOF（例如使用 Ctrl+D 或 Ctrl+Z 結束輸入），捕捉這個錯誤。
#
# pass
# 不做任何處理，直接結束程式。