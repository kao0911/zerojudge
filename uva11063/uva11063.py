import sys
count=0
while True:
    line =sys.stdin.readline()
    if not line:
        break
    try:
        k=int(line.strip())
        number=[]
        b2=[]
        #val =int(sys.stdin.readline().strip())
        line_data = sys.stdin.readline().split()
        number = [int(x) for x in line_data]
        number.sort()
        for i in range(k):
            for j in range(k):
                if i<=j:
                    a=number[i]+number[j]
                    b2.append(a)
                else:
                    continue
        #print(b2)
        count=count+1
        if len(b2) == len(set(b2)):
            print(f"Case #{count}: It is a B2-Sequence.")
        else:
            print(f"Case #{count}: It is not a B2-Sequence.")
    except EOFError:
        break