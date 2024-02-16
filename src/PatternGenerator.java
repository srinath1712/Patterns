import java.util.Scanner;

public class PatternGenerator{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            // Print the number
            System.out.print(i);

            // Print 'b', 'c', 'd', ..., 'e' (repeated i times)
            for (int j = 1; j <= i; j++) {
                char ch = (char) ('a' + j - 2);
                System.out.print(ch);
            }

            // Move to the next line after each iteration
            System.out.println();
        }

        scanner.close();
    }
}