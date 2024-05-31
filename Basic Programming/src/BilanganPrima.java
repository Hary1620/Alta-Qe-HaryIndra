import java.util.Scanner;

public class BilanganPrima {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        while (true) {

            System.out.print("Masukkan bilangan (atau masukkan 'Exit' untuk keluar): ");


            String userInput = input.nextLine();


            if (userInput.equalsIgnoreCase("exit")) {
                System.out.println("Program berhenti.Terimakasih Have a Nice Day!! :)");
                break;
            }


            int bilangan = Integer.parseInt(userInput);


            if (Prima(bilangan)) {
                System.out.println(bilangan + " (True) adalah Bilangan Prima");
            } else {
                System.out.println(bilangan + " (False) bukan Bilangan Prima");
            }
        }
    }


    public static boolean Prima(int bilangan) {

        if (bilangan <= 1) {
            return false;
        }


        for (int i = 2; i <= bilangan/2; i++) {
            if (bilangan % i == 0) {
                return false;
            }
        }

        return true;
    }
}
