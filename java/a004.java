/*解題報告
真正的一年其实是365.2423天 而我們的4年一閏，也就是換算一年是365.25天
Q:那為甚麼要設能被100年整除的算是"平年"呢?
A:因為365.25-365.2423=0.0077
  0.0077*400年=3.08天(過400年會多出3天)
  所以當時的教皇決定每過100年的那年就不算閏年
  舉例:西元100、200、300年都算是平年，400為閏年，西元100、200、300年是為了補這3.08天
*/
import java.util.Scanner;
public class a004{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int a = sc.nextInt();
            if(a % 4 == 0 && a % 100 != 0 || a % 400 == 0){
                System.out.print("閏年\n");
            }else{
                System.out.print("平年\n");
            }
        }
        sc.close();
    }
}