package ds;
/* UVa 10812 - Beat the Spread!
 by C111193110 高晨軒,
 2023/10/4
*/ 
import java.util.Scanner;
public class Main
{
    static Scanner keyboard = new Scanner(System.in);
    public static void main(String args[]) 
    {   
        int cases = keyboard.nextInt();
	for (int i = 0;i < cases;i++)
	{
		int sum = keyboard.nextInt();
		int diff = keyboard.nextInt();
		int a = (sum + diff)/2;
		int b = sum-a;
		if(a<0 || b<0 || (sum + diff)%2 == 1)
		{
			System.out.println("impossible");
		}
		else
		{
			System.out.println(a + " " + b);
		}
	}
        
    }
}
