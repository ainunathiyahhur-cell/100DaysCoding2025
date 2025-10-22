import java.util.Scanner;

public class day45 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== MENU MAKANAN ===");
        System.out.println("1. Nasi Goreng");
        System.out.println("2. Mie Ayam");
        System.out.println("3. Soto Ayam");
        System.out.println("4. Bakso");
        System.out.print("Pilih menu (1-4): ");
        int pilihan = input.nextInt();

        switch (pilihan) {
            case 1:
                System.out.println("Anda memilih Nasi Goreng. Harga: Rp15.000");
                break;
            case 2:
                System.out.println("Anda memilih Mie Ayam. Harga: Rp12.000");
                break;
            case 3:
                System.out.println("Anda memilih Soto Ayam. Harga: Rp14.000");
                break;
            case 4:
                System.out.println("Anda memilih Bakso. Harga: Rp13.000");
                break;
            default:
                System.out.println("Pilihan tidak tersedia!");
        }
    }
}