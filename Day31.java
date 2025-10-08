import java.util.Scanner;
public class day31 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan usia: ");
        int usia = input.nextInt();

        System.out.print("Masukkan nilai ujian: ");
        int nilai = input.nextInt();

        if (usia >= 17 && nilai >= 75) {
            System.out.println("Kamu lulus seleksi.");
        } else {
            System.out.println("Kamu belum memenuhi syarat.");
        }
    }
}