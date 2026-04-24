import java.util.Scanner;

public class uva272 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder output = new StringBuilder();
        boolean open = true;

        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            for (char c : line.toCharArray()) {
                if (c == '"') {
                    if (open) {
                        output.append("``");
                    } else {
                        output.append("''");
                    }
                    open = !open;
                } else {
                    output.append(c);
                }
            }
            output.append('\n');
        }
        System.out.print(output);
        scanner.close();
    }
}

