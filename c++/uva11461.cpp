/*錯誤
#include <iostream>
#include <cmath>
using namespace std;
int main(){
    int a , b;
    cin >> a >> b;
    while(a!=0 && b!=0){
        int count = 0;
        for(int i=a;i<=b;i++){// 錯誤點在這裡，逐一檢查每個數字
            int result = sqrt(i);// 錯誤邏輯，sqrt(i) 可能是浮點數
			if(result%1==0){
				count++;
			}
			cout << count << endl;
            cin >> a >> b;// 應該放在 while 外面
		}
    }
}

錯誤點：
1.	逐一檢查每個數字的平方根： 你在 for 迴圈中檢查每個 i 的平方根，這會導致效率很低，尤其當 a 和 b 相差很大時。我們其實不需要逐個檢查所有數字，只需要找到範圍內的平方數數量。
2.	平方根的計算： sqrt(i) 會回傳浮點數，所以 if(result % 1 == 0) 這段邏輯是錯的。浮點數沒有辦法用 % 去檢查是否為整數。
3.	輸入的處理： cin >> a >> b; 應該放在 while 迴圈的外面，否則你會在每次迴圈裡不斷要求新的輸入，而不是每次循環結束後輸入新的範圍。
*/
/*正確(簡單)
#include <iostream>
#include <cmath>
using namespace std;
int main(){
    int a , b ,n;
    while(cin >> a >> b){
        int count=0;
        if(a==0 && b==0){
            break;
        }
        for(int i=a;i<=b;i++){
            n=sqrt(i);
            if(n*n==i){
                count++;
            }
        }
        cout << count <<endl;
    }
    return 0;
}
*/
//正確(困難)
#include <iostream>
#include <cmath>
using namespace std;

int main() {
    int a, b;
    while (cin >> a >> b, a != 0 && b != 0) {
        int start = ceil(sqrt(a));  // 找到第一個平方數的根
        int end = floor(sqrt(b));   // 找到最後一個平方數的根
        int count = (end >= start) ? (end - start + 1) : 0; // 計算平方數的個數
        cout << count << endl;
    }
    return 0;
}
