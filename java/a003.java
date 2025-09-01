import java.util.Scanner;
public class a003{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int M,D;
        
        while(sc.hasNext()){
            M =sc.nextInt();
            D =sc.nextInt();
            int S =(M*2+D)%3;
            if(S==0){
                System.out.println("普通");
            }
            else if(S==1){
                System.out.println("吉");    
            }
            else{
                System.out.println("大吉");
            }

        }
    } 
}