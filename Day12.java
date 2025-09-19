import java.util.Scanner;

public class Day12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nama lengkap: ");
        String nama = input.nextLine();

        System.out.print("Masukkan jumlah saudara kandung (byte): ");
        byte jumlahSaudara = input.nextByte();

        System.out.print("Masukkan tahun lahir (short): ");
        short tahunLahir = input.nextShort();

        System.out.print("Masukkan umur (int): ");
        int umur = input.nextInt();

        System.out.print("Masukkan nomor telepon (long): ");
        long noTelepon = input.nextLong();

        System.out.print("Masukkan nilai rata-rata rapor (float): ");
        float nilaiRapor = input.nextFloat();

        System.out.print("Masukkan tinggi badan (cm) (double): ");
        double tinggiBadan = input.nextDouble();

        System.out.print("Masukkan jenis kelamin (L/P) (char): ");
        char jenisKelamin = input.next().charAt(0);

        System.out.print("Apakah kamu sudah lulus SMA? (true/false): ");
        boolean statusLulusSma = input.nextBoolean();

        // Output biodata
        System.out.println("\n=== BIODATA ANDA ===");
        System.out.println("Nama Lengkap       : " + nama);
        System.out.println("Jumlah Saudara     : " + jumlahSaudara);
        System.out.println("Tahun Lahir        : " + tahunLahir);
        System.out.println("Umur               : " + umur + " tahun");
        System.out.println("Nomor Telepon      : " + noTelepon);
        System.out.println("Nilai Rapor        : " + nilaiRapor);
        System.out.println("Tinggi Badan       : " + tinggiBadan + " cm");
        System.out.println("Jenis Kelamin      : " + jenisKelamin);
        System.out.println("Status Lulus SMA   : " + statusLulusSma);

    }
}