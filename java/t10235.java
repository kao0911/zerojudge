//Presentation Error
//思路對的，運行時間符合要求，可能是空格或多一個enter之類的問題
import java.util.Scanner;
public class t10235{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int a = sc.nextInt();
            if(!isprime(a)){
                System.out.println(a+" is not prime.");
            }else{
                int reversed = reversed_a(a);
                if(a!=reversed && isprime(reversed)){
                    System.out.println(a+" is emirp.");
                }else{
                    System.out.println(a+" is prime.");
                }
            }
        }
    }
    public static boolean isprime(int num){
        if(num<=1) return false;
        for(int i=2;i<=Math.sqrt(num);i++){
            if(num % i ==0){
                return false;
            }
        }return true;
    }
    public static int reversed_a(int num){
        int reversed = 0;
        while(num>0){
            reversed = reversed*10+(num%10);
            num/=10;
        }return reversed;
    }

}