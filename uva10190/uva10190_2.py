while True:
    try:
        n,m=map(int,input().split())
        a=[n]
        status = True
        while n>1:
            if m==1 or m==0:
                status = False
                break
            if n%m==0:
                a.append(n//m)
            else:
                status = False
                break
            n//=m
        if len(a)==1:
            #[x]break
            status = False
        #[x]first = True
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