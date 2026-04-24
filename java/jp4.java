import java.util.*;
public class jp4 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.printf("輸入第1組的x和y座標：");
        double x1=sc.nextDouble();
         double y1=sc.nextDouble();
        System.out.printf("輸入第2組的x和y座標：");
        double x2=sc.nextDouble();
        double y2=sc.nextDouble();
        double d=Math.sqrt(Math.pow((x2-x1),2)+Math.pow((y2-y1),2));
        System.out.printf("介於(%.2f,%.2f)和(%.2f,%.2f)之間的距離是%.2f\n",x1,y1,x2,y2,d);



    }
    
}
