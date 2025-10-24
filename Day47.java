import java.util.Scanner;

public class day47{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Program Menentukan Hari");
        System.out.println("=======================");
        System.out.println("1. Senin");
        System.out.println("2. Selasa");
        System.out.println("3. Rabu");
        System.out.println("4. Kamis");
        System.out.println("5. Jumat");
        System.out.println("6. Sabtu");
        System.out.println("7. Minggu");

        System.out.print("Masukkan angka (1-7): ");
        int hari = input.nextInt();

        String namaHari;

        switch (hari) {
            case 1:
                namaHari = "Senin";
                break;
            case 2:
                namaHari = "Selasa";
                break;
            case 3:
                namaHari = "Rabu";
                break;
            case 4:
                namaHari = "Kamis";
                break;
            case 5:
                namaHari = "Jumat";
                break;
            case 6:
                namaHari = "Sabtu";
                break;
            case 7:
                namaHari = "Minggu";
                break;
            default:
                namaHari = "Angka tidak valid! Harap masukkan 1-7.";
        }

        System.out.println("Hari yang kamu pilih adalah: " + namaHari);
    }
}