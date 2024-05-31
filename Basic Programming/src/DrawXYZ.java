import java.util.Scanner;

public class DrawXYZ {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            String choice;

            do {
                System.out.print("Masukkan nilai input atau ketik 'exit' untuk keluar: ");
                choice = scanner.nextLine();

                if (!choice.equalsIgnoreCase("exit")) {
                    try {
                        int input = Integer.parseInt(choice);
                        xyz(input);
                    } catch (NumberFormatException e) {
                        System.out.println("Input tidak valid. Silakan masukkan angka atau 'exit'.");
                    }
                }
            } while (!choice.equalsIgnoreCase("exit"));

            System.out.println("Program Berhenti. Terimakasih Have A Nice Day :)");
            scanner.close();
        }

        private static void xyz(int input) {
            int count = 1;

            for (int i = 1; i <= input; i++) {
                for (int j = 1; j <= input; j++) {
                    if (count % 3 == 0) {
                        System.out.print("X");
                    } else if (count % 2 == 0) {
                        System.out.print("Z");
                    } else {
                        System.out.print("Y");
                    }
                    count++;
                }
                System.out.println();
            }
        }
    }

