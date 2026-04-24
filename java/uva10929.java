/*
import java.util.Scanner;
public class uva10929{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            long a = sc.nextLong();
            if(a == 0){
                break;
            }else{
                if(a%11==0){
                    System.out.println(a+" is a multiple of 11.");
                }else{
                    System.out.println(a+" is not a multiple of 11.");
                }
            }
        }
        sc.close();
    }
}
*/
import java.util.Scanner;

public class uva10929 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        while (true) {
            String num = sc.nextLine();
            if (num.equals("0")) {
                break;
            }
            
            if (isMultipleOf11(num)) {
                System.out.println(num + " is a multiple of 11.");
            } else {
                System.out.println(num + " is not a multiple of 11.");
            }
        }
        
        sc.close();
    }
    
    private static boolean isMultipleOf11(String num) {
        int oddSum = 0, evenSum = 0;
        for (int i = 0; i < num.length(); i++) {
            int digit = num.charAt(i) - '0';  // 获取字符串中的第 i 个字符，并将其转换为数字
            if (i % 2 == 0) {
                oddSum += digit;  // 奇数位和
            } else {
                evenSum += digit;  // 偶数位和
            }
        }
        
        int diff = Math.abs(oddSum - evenSum);  // 计算奇数位和与偶数位和的差的绝对值
        return diff % 11 == 0;  // 如果差值是 11 的倍数，则原数字是 11 的倍数
    }
}
