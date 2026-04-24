/*#include <stdio.h>
#include <string.h>
#include <stdlib.h>

int count_parity(int I) {
    int binary[32];
    int count = 0;
    int index = 0;

    while (I > 0) {
        binary[index++] = I % 2;
        count += I % 2;
        I /= 2;
    }

    printf("The parity of ");
    for (int i = index - 1; i >= 0; i--) {
        printf("%d", binary[i]);
    }
    printf(" is %d (mod 2).\n", count);

    return count;
}

int main() {
    int I;
    while (scanf("%d", &I) != EOF && I != 0) {
        count_parity(I);
    }

    return 0;
}
*/
#include<stdio.h>
char a[10000000];
int main()
{
    unsigned long long x,b,c;
    while(scanf("%llu",&x)==1 && x!=0)
    {
        b=0,c=0;
        printf("The parity of ");
        while(x!=0)
        {
            a[c]=x%2+'0';
            if(a[c]=='1') b++;
            x/=2;
            c++;
        }
        while(c--)printf("%c",a[c]);
        printf(" is %llu (mod 2).\n",b);
    }
    return 0;
}