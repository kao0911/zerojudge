while True:
    try:
        v,t =map(int,input().split())
        '''
        - 從用戶輸入中讀取一行
        - 將這行按空格分割成兩個部分
        - 將這兩個部分轉換為整數
        - 將這兩個整數分別賦值給變量 v 和 t
        '''
        print(v*t*2)
    except EOFError:
        break
    '''
    當捕獲到 EOFError 異常時，執行這條語句
    break 會立即退出當前的循環
    '''
