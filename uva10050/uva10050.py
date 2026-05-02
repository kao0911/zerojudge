'''
T=int(input()) #幾組測資
N=int(input()) #模擬天數
P=int(input()) #政黨數
numbers=[]
for i in range(P):
    val = int(input())
    numbers.append(val)
'''
'''
20200707    v1.0    jlhung
'''

n = int(input())

for k in range(n):
    d = int(input())
    m = int(input()) #政黨數
    c = [0] * m
    '''
    舉例來說：假設你的政黨數 m = 3，那麼：c = [0] * 3
    執行後，c 就會變成：[0, 0, 0]。
    '''
    for i in range(m):
        c[i] = int(input()) #罷會參數
    
    #模擬罷會
    total = 0
    for i in range(1, d+1):
        #跳過星期五星期六
        if i % 7 == 6 or i % 7 == 0:
            continue
        
        #只要一個罷會就加一 第i天第j個政黨罷會參數
        for j in range(m): #這裡的j代表政黨數迴圈
            if i % c[j] == 0: #第J個政黨的罷會參數
                total += 1
                break
                '''
                有了 break：
                只要第一個政黨被發現要罷會，total += 1 之後，break 就會立刻「切斷」內層迴圈。程式不再去管其他政黨有沒有要罷會，直接跳到下一天（i + 1）。
                '''
    print(total)
'''
你目前的寫法是用「天數當主軸」去查「政黨」。時間複雜度： $O(N \times P)$如果你未來遇到更難的題目，天數 $N$ 很大（例如 1 億天），這種寫法會太慢。那時候就會改成用「政黨當主軸」去標記陣列（像我在前幾輪提到的 range 步進值標記法）。但在這題 $N \le 3650$ 的情況下，你的做法完全合格且邏輯非常穩健。恭喜你，這部分的邏輯已經完全符合題目要求了！這整題現在你應該可以自己跑通了吧？
'''