/*
import java.util.*;
public class uva10222{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine(); 
        String[][] names = {
            {"q", "w", "e","r","t","y","u","i","o","p","[","]"},
            {"a", "s", "d","f","g","h","j","k","l",";","'"},
            {"z", "x", "c","v","b","n","m",",",".","/"}
        };
        System.out.print(names[2][2]);
        String text = "Java is a fun programming language";
        String[] result = text.split(""); // 以空格為分隔符
        System.out.println(result[0]);
        
        for (String words : result) {
            System.out.println(words);
        }
        
    }
}*/
import java.util.*;

public class uva10222 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine(); // 讀取使用者輸入的字串
        String[][] keyboard = {
            {"q", "w", "e", "r", "t", "y", "u", "i", "o", "p", "[", "]", "\\"},
            {"a", "s", "d", "f", "g", "h", "j", "k", "l", ";", "'"},
            {"z", "x", "c", "v", "b", "n", "m", ",", ".", "/"}
        };

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if (c == ' ') {
                result.append(" ");
            } else {
                for (int j = 0; j < keyboard.length; j++) {
                    for (int k = 0; k < keyboard[j].length; k++) {
                        if (keyboard[j][k].equalsIgnoreCase(String.valueOf(c))) {
                            if (k >= 2) {
                                result.append(keyboard[j][k - 2]);
                            } else {
                                int prevRow = j - 1;
                                int prevCol = keyboard[prevRow].length + k - 2;
                                if (prevRow >= 0) {
                                    result.append(keyboard[prevRow][prevCol % keyboard[prevRow].length]);
                                } else {
                                    result.append(keyboard[j][keyboard[j].length - 1]);
                                }
                            }
                            break;
                        }
                    }
                }
            }
        }

        System.out.println(result.toString());
    }
}