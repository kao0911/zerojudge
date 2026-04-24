while True:
    try:
        n,m =map(int,input().split())
        a = [n]
        status = True
        while n>1:
            if m==1 or m==0:
                status = False
                #[x1]print('Boring!')
                break
            if n%m==0:
                #[x2] n//=m
                #[x3]a.append(n)
                a.append(n//m)
            else:
                status=False
                #[x1]print('Boring!')
                break
            n//=m
        if len(a) ==1:
            status = False
        if status:
            first = True
            for n in a:
                if first:
                    print(n,end='')
                    first = False
                else:
                    print(f' {n}',end='')
            print()
        else:
            print('Boring!')    
    except EOFError:
        break
