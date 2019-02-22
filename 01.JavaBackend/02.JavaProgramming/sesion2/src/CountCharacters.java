import java.util.Scanner;

public class CountCharacters {
    public void countCharacters(String str) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        System.out.print("Enter character: ");
        char character = scanner.next().charAt(0);
        for (int i = 0; i < str.length(); i++) {
            if (character == str.charAt(i)) {
                count++;
            }
        }
        System.out.print("Number of occurrences of " + character + " is: " + count);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CountCharacters countCharacters = new CountCharacters();
        System.out.print("Enter string: ");
        String str = scanner.nextLine();
        countCharacters.countCharacters(str);

    }
}
