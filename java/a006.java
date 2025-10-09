import java.util.Scanner;
public class a006{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        while(sc.hasNext()){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int k = b*b - 4*a*c;
            if(k>0){
                int x1 = (int)(-b +Math.sqrt(k)) / (2 * a);
                int x2 = (int)(-b -Math.sqrt(k)) / (2 * a);
                if (x1 > x2){
                    System.out.printf("Two different roots x1=%d , x2=%d",x1,x2);
                }
                else{
                    System.out.printf("Two different roots x1=%d , x2=%d",x2,x1);
                }
            }else if(k==0){
                int x = (int)(-b + Math.sqrt(k)) / (2 * a);
                System.out.printf("Two same roots x=%d",x);
            }else{
                System.out.print("No real root");
            }
        }
        sc.close();
    }
}