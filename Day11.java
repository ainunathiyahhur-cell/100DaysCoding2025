import java.util.Scanner;

public class Day11 {
    public static void main(String[] args) {
        // Membuat objek Scanner
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nama lengkap: ");
        String nama = input.nextLine();

        System.out.print("Masukkan umur: ");
        int umur = input.nextInt();

        System.out.print("Masukkan tinggi badan (cm): ");
        double tinggi = input.nextDouble();

        System.out.print("Masukkan berat badan (kg): ");
        float berat = input.nextFloat();

        System.out.println("Nama Lengkap : " + nama);
        System.out.println("Umur         : " + umur + " tahun");
        System.out.println("Tinggi Badan : " + tinggi + " cm");
        System.out.println("Berat Badan  : " + berat + " kg");

    }
}