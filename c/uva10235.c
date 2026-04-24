/*(ompilation Error)
#include <stdio.h>
#include <math.h>

// 判斷是否為質數的函數
int isPrime(int num) {
    if (num <= 1) return 0;  // 小於等於 1 的數不是質數
    int i;
    // 從 2 開始檢查是否有任何因數，檢查範圍只需要到 sqrt(num)
    for (i = 2; i <= sqrt(num); i++) {
        if (num % i == 0) {  // 如果 num 能被 i 整除，則不是質數
            return 0;
        }
    }
    return 1;  // 沒有找到因數，則 num 是質數
}

// 反轉數字的函數
int reverseNumber(int num) {
    int reversed = 0;
    // 逐位取出數字，並將其反轉
    while (num > 0) {
        reversed = reversed * 10 + num % 10;  // 將最右邊的一位數加到 reversed
        num /= 10;  // 將數字右移一位
    }
    return reversed;  // 返回反轉後的數字
}

int main() {
    int n;
    
    // 不斷讀取輸入數字
    while (scanf("%d", &n) == 1) {
        // 首先檢查 n 是否為質數
        if (!isPrime(n)) {
            printf("%d is not prime.\n", n);  // 不是質數，輸出 "not prime"
        } else {
            int reversed = reverseNumber(n);  // 反轉數字
            // 檢查反轉後的數字是否是質數，且反轉後的數字和原數字不同
            if (n != reversed && isPrime(reversed)) {
                printf("%d is emirp.\n", n);  // 原數字和反轉後的數字都是質數，且不相等，輸出 "emirp"
            } else {
                printf("%d is prime.\n", n);  // 原數字是質數，但反轉後不是質數或相等，輸出 "prime"
            }
        }
    }
    
    return 0;
}
*/
//runtime  error （執行時錯誤）就是程式執行到一半，程式就崩潰了。
/*
#include <stdio.h>
int isprime(int n)//專門判斷是否為質數用的
{
 int k;
 for(k=2; k<n; k++)
  if(n%k==0) break;
  
 return k==n;
}
int main()
{
 int n, n1, n2;
 while(scanf("%d", &n)!=EOF)
 {
  if(isprime(n))//第一先判斷這個值本身是不是質數
  {
   n1=n;
   n2=0;
   while(n1)//交換數字的位置
   {
    n2=n2*10+n1%10;
    n1/=10;
   }
  if(n2!=n && isprime(n2)){
    //如果交換完還是質數且跟交換前的數字不一樣的話
    printf("%d is emirp.\n", n);
  }else{//只符合一開始是質數
   printf("%d is prime.\n", n);
   }
  }
  else printf("%d is not prime.\n", n);
 }
}
*/
#include<stdio.h>  
// 宣告一個大小為 1000005 的陣列 prime，並初始化 0 號和 1 號位置為 1，表示 0 和 1 不是質數
int prime[1000005] = { 1, 1, 0 }; 

int main()
{
    int i, j;
    // 執行埃拉托斯特尼篩法，將非質數標記在 prime 陣列中
    for( i = 2 ; i <= 1000000 ; i++ )
        if( !prime[i] )  // 如果 i 是質數
            for( j = i + i ; j <= 1000000 ; j += i )  // 將 i 的倍數標記為非質數
                prime[j] = 1;  // 標記為 1，表示這個數不是質數
    
    int N;
    // 持續讀取輸入，直到檔案結束
    while( scanf( "%d", &N ) != EOF )
    {
        int N_origin = N;  // 儲存原來的數字 N
        int N_reverse = 0;  // 儲存反轉後的數字
        
        // 將數字 N 反轉
        while( N )
        {
            N_reverse *= 10;  // 將現有的反轉數字乘以 10，往左移一位
            N_reverse += N % 10;  // 加入 N 的最後一位數
            N /= 10;  // 將 N 去掉最後一位
        }
        
        // 如果原數字不是質數
        if( prime[N_origin] )
            printf( "%d is not prime.\n", N_origin );
        // 如果反轉後的數字不是質數，或者反轉後和原數字相同
        else if( prime[N_reverse] || N_origin == N_reverse )
            printf( "%d is prime.\n", N_origin );
        // 如果反轉後的數字是質數，且原數字和反轉後不同
        else
            printf( "%d is emirp.\n", N_origin );
    }
    
    return 0;
}
