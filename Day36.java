import java.util.Scanner;
public class day36 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan umur Anda: ");
        int umur = input.nextInt();

        if (umur >= 18) {
            System.out.print("Lulus teori?: ");
            boolean teori = input.nextBoolean();

            if (lulusTeori) {
                System.out.println("Boleh dapat SIM.");
            } else {
                System.out.println("Boleh dapat SIM.");
            }
        } else {
            System.out.println("umur belum cukup.");
        }
    }
}