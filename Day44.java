import java.util.Scanner;

public class day44 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nilai Anda: ");
        int nilai = input.nextInt();

        String predikat;

        if (nilai >= 85 && nilai <= 100) {
            predikat = "A";
        } else if (nilai >= 75) {
            predikat = "B";
        } else if (nilai >= 65) {
            predikat = "C";
        } else if (nilai >= 50) {
            predikat = "D";
        } else if (nilai >= 0) {
            predikat = "E";
        } else {
            predikat = "Nilai tidak valid";
        }

        System.out.println("Predikat Anda: " + predikat);
    }
}