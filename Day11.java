import java.util.Scanner;

public class Day11 {
    public static void main(String[] args) {
        // Membuat objek Scanner
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nama lengkap Anda: ");
        String nama = input.nextLine();

        System.out.print("Masukkan umur Anda: ");
        int umur = input.nextInt();

        System.out.print("Masukkan tinggi badan Anda (cm): ");
        double tinggi = input.nextDouble();

        System.out.print("Masukkan berat badan Anda (kg): ");
        float berat = input.nextFloat();

        System.out.print("Masukkan jenis kelamin (L/P): ");
        char gender = input.next().charAt(0);

        System.out.println("Nama Lengkap : " + nama);
        System.out.println("Umur         : " + umur + " tahun");
        System.out.println("Tinggi Badan : " + tinggi + " cm");
        System.out.println("Berat Badan  : " + berat + " kg");

    }
}