/*#include <stdio.h>
#include <string.h>
#include <stdlib.h>

int main() {
    int n;
    // 在這裡輸入讀取測試案例數量的代碼
    scanf("%d",&n);
    // 在這裡開始一個循環來處理每個測試案例
    for(int i=0;i<n;i++){
        char binary1[32],binary2[32];
        scanf("%s %s",binary1,binary2);
        int decimal1 =binaryToDecimal(binary1);
        int decimal2 =binaryToDecimal(binary2);
        int gcd = calculateGCD(decimal1,decimal2);
        if(gcd>1){
            printf("Pair #%d: All you need is Love!\n",i+1);
        }else{
            printf("Pair #%d: Love is not all you need!\n",i+1);
        }
        
    }
    return 0;

}

// 
int binaryToDecimal(char binary[]){
    int decimal = 0;
    int Length = strlen(binary);//取得二進制數的長度
    for(int i=0;i<Length;i++){
        decimal = decimal *2 +(binary[i]-'0');//將二進制轉換為十進制
    }
    return decimal;
}

int calculateGCD(int a,int b){
    if(b==0) return a;
    return calculateGCD(b,a%b);
}
*/
#include<stdio.h>
#include<string.h>

// 計算最大公約數的函數
int GCD(int a, int b){
    return b == 0 ? a : GCD(b, a % b);
    //b == 0：這是條件，意思是如果 b 等於 0。
    //如果 b == 0 為真，則返回 a（表示最大公約數就是 a）。
    //如果 b != 0（假），則計算 GCD(b, a % b)，這是輾轉相除法的核心步驟，即使用遞迴計算 GCD，將數字交換，並將餘數代入。 
}

// 將二進制字符串轉換為整數並計算GCD
// 這是一個函數定義
// 函數名稱為 str_to_int
// 接受兩個參數，都是字符指針（char *）
// 用於將兩個二進制字符串轉換為整數並計算它們的最大公約數
int str_to_int(char *a, char *b){

    int num1 = 0, num2 = 0;
    int i;

    // 將第一個二進制字符串轉換為整數
    for(i = 0; i < strlen(a); i++){
        num1 = (num1 << 1) + (a[i] - '0');
    }

    // 將第二個二進制字符串轉換為整數
    for(i = 0; i < strlen(b); i++){
        num2 = (num2 << 1) + (b[i] - '0');
    }

    // 返回兩個數的最大公約數
    return GCD(num1, num2);
}

int main(){

    int N, Case = 1;

    // 讀取測試案例數量
    scanf("%d", &N);

    while(N--){

        char S1[31] = {0};//宣告並初始化一個大小為 31 的字元陣列 S1，其中所有元素都被初始化為 0（空字元），存放 30 個字元，外加一個結束字元 \0
        char S2[31] = {0};

        // 讀取兩個二進制字符串
        scanf("%s%s", S1, S2);

        // 如果GCD不為1，則輸出"All you need is love!"
        if(str_to_int(S1, S2) != 1){
            printf("Pair #%d: All you need is love!\n", Case++);
        }
        // 否則輸出"Love is not all you need!"
        else{
            printf("Pair #%d: Love is not all you need!\n", Case++);
        }
    }

    return 0;
}