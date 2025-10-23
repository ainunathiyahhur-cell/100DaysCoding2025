import java.util.Scanner;

public class day46 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== Menu Kedai Lezat ===");
        System.out.println("1. Nasi Goreng - Rp15.000");
        System.out.println("2. Mie Goreng  - Rp12.000");
        System.out.println("3. Ayam Bakar  - Rp18.000");
        System.out.println("4. Es Teh Manis - Rp5.000");
        System.out.print("Masukkan pilihan Anda (1-4): ");
        
        int pilihan = input.nextInt();

        switch (pilihan) {
            case 1:
                System.out.println("Anda memilih Nasi Goreng");
                break;
            case 2:
                System.out.println("Anda memilih Mie Goreng");
                break;
            case 3:
                System.out.println("Anda memilih Ayam Bakar");
                break;
            case 4:
                System.out.println("Anda memilih Es Teh Manis");
                break;
            default:
                System.out.println("Pilihan tidak valid!");
        }

        System.out.println("Terima kasih sudah berkunjung!");
    }
}