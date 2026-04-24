import java.util.Scanner;

public class uva11461{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        while(sc.hasNext()){
            int a = sc.nextInt();
            int b = sc.nextInt();
            while(a!=0 && b!=0){
                for(int i = a; i<=b;i++){
                    if(Math.sqrt(i)%1==0){
                        System.out.print(i + " ");
                    }
                }
                System.out.println(); // 在每組測試案例後換行
                a=sc.nextInt();
                b=sc.nextInt();
            }
        }
    }
}