//2025-08-31
import java.util.Scanner;
public class a002{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.print(a+b+"\n");
        }
        sc.close();
    }
}