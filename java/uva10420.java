import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class uva10420 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        // Use TreeMap to store country names and their counts, automatically sorted
        Map<String, Integer> countryCounts = new TreeMap<>();

        for (int i = 0; i < n; i++) {
            String line = scanner.nextLine();
            String[] parts = line.split(" ");
            String country = parts[0];

            // Update the count for the country
            countryCounts.put(country, countryCounts.getOrDefault(country, 0) + 1);
        }

        // Output the results
        for (Map.Entry<String, Integer> entry : countryCounts.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

        scanner.close();
    }
}
