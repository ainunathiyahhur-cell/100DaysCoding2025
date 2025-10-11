import java.util.Scanner;
public class day34 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan umur kamu: ");
        int umur = input.nextInt();

        System.out.print("Apakah kamu punya KTP? (true/false): ");
        boolean punyaKTP = input.nextBoolean();

        if (umur >= 18 && punyaKTP) {
            System.out.println("Kamu sudah dewasa dan punya KTP");
        } else {
            System.out.println("Kamu belum memenuhi syarat");
        }
    }
}