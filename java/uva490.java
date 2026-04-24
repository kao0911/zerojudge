/*
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class uva490 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> lines = new ArrayList<>();

        // 讀取所有輸入行
        while (scanner.hasNextLine()) {
            lines.add(scanner.nextLine());
        }
        scanner.close();

        // 找出最長行的長度
        int maxLength = 0;
        for (String line : lines) {
            if (line.length() > maxLength) {
                maxLength = line.length();
            }
        }

        // 創建字符矩陣來保存旋轉後的結果
        char[][] rotated = new char[maxLength][lines.size()];

        // 初始化矩陣，用空格填充
        for (int i = 0; i < maxLength; i++) {
            for (int j = 0; j < lines.size(); j++) {
                rotated[i][j] = ' ';
            }
        }

        // 將輸入行填充到字符矩陣中
        for (int i = 0; i < lines.size(); i++) {
            String line = lines.get(i);
            for (int j = 0; j < line.length(); j++) {
                rotated[j][lines.size() - 1 - i] = line.charAt(j);
            }
        }

        // 輸出旋轉後的字符矩陣
        for (int i = 0; i < maxLength; i++) {
            for (int j = 0; j < lines.size(); j++) {
                System.out.print(rotated[i][j]);
            }
            System.out.println();
        }
    }
}
*/

/*import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class uva490 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> lines = new ArrayList<>();

        // 讀取所有輸入行，直到遇到空行為止
        while (true) {
            String line = scanner.nextLine();
            if (line.isEmpty()) {
                break;
            }
            lines.add(line);
        }
        scanner.close();

        // 找出最長行的長度
        int maxLength = 0;
        for (String line : lines) {
            if (line.length() > maxLength) {
                maxLength = line.length();
            }
        }

        // 創建字符矩陣來保存旋轉後的結果
        char[][] rotated = new char[maxLength][lines.size()];

        // 初始化矩陣，用空格填充
        for (int i = 0; i < maxLength; i++) {
            for (int j = 0; j < lines.size(); j++) {
                rotated[i][j] = ' ';
            }
        }

        // 將輸入行填充到字符矩陣中
        for (int i = 0; i < lines.size(); i++) {
            String line = lines.get(i);
            for (int j = 0; j < line.length(); j++) {
                rotated[j][lines.size() - 1 - i] = line.charAt(j);
            }
        }

        // 輸出旋轉後的字符矩陣
        for (int i = 0; i < maxLength; i++) {
            for (int j = 0; j < lines.size(); j++) {
                System.out.print(rotated[i][j]);
            }
            System.out.println();
        }
    }
}
*/
/*
 * 將輸入的所有句子做順時針90度旋轉,打印
 * 解:將每行分別存至陣列
 * 使用雙層迴圈:外層(row,最大句子長度),內層(column,倒循環陣列)
 * */
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class uva490 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> lines = new ArrayList<>();
        
        // Read input lines
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            if (line.isEmpty()) break; // Stop on empty line
            lines.add(line);
        }
        
        // Determine the maximum length of the lines
        int maxLength = 0;
        for (String line : lines) {
            if (line.length() > maxLength) {
                maxLength = line.length();
            }
        }
        
        // Create the rotated output
        StringBuilder[] output = new StringBuilder[maxLength];
        for (int i = 0; i < maxLength; i++) {
            output[i] = new StringBuilder();
            for (int j = lines.size() - 1; j >= 0; j--) {
                if (i < lines.get(j).length()) {
                    output[i].append(lines.get(j).charAt(i));
                } else {
                    output[i].append(' '); // Fill with spaces if out of bounds
                }
            }
        }
        
        // Print the rotated output
        for (StringBuilder line : output) {
            System.out.println(line.toString());
        }
        
        scanner.close();
    }
}