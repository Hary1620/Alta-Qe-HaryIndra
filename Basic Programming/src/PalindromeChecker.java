import java.util.Scanner;

public class PalindromeChecker {
    public static boolean palindrome(String kata) {
        int panjang = kata.length();
        for (int i = 0; i < panjang / 2; i++) {
            if (kata.charAt(i) != kata.charAt(panjang - 1 - i)) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Masukkan kata (atau ketik '-404' untuk keluar): ");
            String kata = scanner.nextLine();

            if (kata.equals("-404")) {
                System.out.println("Program berhenti.Terimakasih Have a Nice Day!! :)");
                break;
            }

            if (palindrome(kata)) {
                System.out.println("True");
            } else {
                System.out.println("False");
            }
        }
    }
}
