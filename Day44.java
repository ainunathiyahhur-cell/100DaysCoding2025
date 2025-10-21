import java.util.Scanner;

public class day44 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nilai Anda (0-100): ");
        int nilai = input.nextInt();

        if (nilai < 0 || nilai > 100) {
            System.out.println("Nilai tidak valid! Harus antara 0 sampai 100.");
        } else {
            String predikat;

            if (nilai >= 85) {
                predikat = "A";
            } else if (nilai >= 75) {
                predikat = "B";
            } else if (nilai >= 65) {
                predikat = "C";
            } else if (nilai >= 50) {
                predikat = "D";
            } else {
                predikat = "E";
            }

            System.out.println("Nilai Anda: " + nilai);
            System.out.println("Predikat Anda: " + predikat);
        }
    }
}