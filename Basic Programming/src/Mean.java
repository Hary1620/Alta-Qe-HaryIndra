import java.util.Scanner;


public class Mean {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        while (true) {
            System.out.print("Masukkan  angka (gunakan format [angka1, angka2, ...]): ");
            String input = scanner.nextLine().trim();


            if (input.equalsIgnoreCase("exit")) {
                System.out.println("Program berhenti.Terimakasih!! Have A Nice Day!!");
                break;
            }


            input = input.replace("[", "").replace("]", "").replace(" ", "");


            String[] strNumbers = input.split(",");


            int[] numbers = new int[strNumbers.length];
            for (int i = 0; i < strNumbers.length; i++) {
                numbers[i] = Integer.parseInt(strNumbers[i]);
            }


            double mean = Mean(numbers);


            System.out.println("Mean: " + mean);
        }
    }

    public static double Mean(int[] numbers) {

        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }

        return (double) sum / numbers.length;
    }
}
