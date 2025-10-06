#2025-10-06
'''
i=0
k= int(input())
for i in range(k):
    try:
        while True:
            a,b,c,d = map(int,input().split())
            i=i+1
    except i=k-1:
        pass
錯誤主要有兩個：

except i=k-1: 是非法語法。

except 後面只能接例外類型（例如 except ValueError:），不能放條件式。

你可能想用 if i == k - 1:。

整體邏輯有問題：

while True: 會造成無限迴圈。

你在 try 裡不會拋出例外，所以 except 不會被執行。
'''
#1 2 3 4
#1 2 4 8
k= int(input())
for i in range(k):
    p = list(map(int,input().split()))
    if p[1]-p[0]==p[2]-p[1]==p[3]-p[2]:
        ans=p[1]-p[0]+p[3]
        print(p[0] , p[1] ,p[2] ,p[3] ,ans)
    elif p[1]//p[0]==p[2]//p[1]==p[3]//p[2]:
            ans=p[1]//p[0]*p[3]
            print(p[0] , p[1] ,p[2] ,p[3] ,ans)
    else:
         break

''' 這行意思是：把使用者輸入的一串數字轉成整數列表。

分解說明：

input().split()：讀一行輸入，依空白分割成字串列表。

例如輸入：1 2 3 4 → ["1", "2", "3", "4"]

map(int, ...)：把每個字串轉成整數。

得到一個可迭代物件，內容是 1, 2, 3, 4

list(...)：把 map 轉成真正的列表。

結果是 [1, 2, 3, 4]

指派給變數 p。'''
