package ds;
import java.util.*;
public class jp2{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Please input:");
        final double kgtrn=2.20462;
        double kg=sc.nextDouble();
        double pd=kg*kgtrn;
        System.out.printf("%9.6f kg=%9.6f pd",kg,pd);
    }
}