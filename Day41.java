import java.util.Scanner;
public class day41 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Pilihan menu");
        System.out.println("1. Nasi Goreng - Rp15.000");
        System.out.println("2. Mie Goreng - Rp12.000");
        System.out.println("3. Ayam Bakar - Rp18.000");

        System.out.print("Masukkan pilihan menu = ");
        int pilihan = input.nextInt();

        System.out.print("Masukkan jumlah porsi = ");
        int porsi = input.nextInt();

        String menu = "";
        double harga = 0;

        if (pilihan == 1) {
            menu = "Nasi Goreng";
            harga = 15000;
        } else if (pilihan == 2) {
            menu = "Mie Goreng";
            harga = 12000;
        } else if (pilihan == 3) {
            menu = "Ayam Bakar";
            harga = 18000;
        } else {
            System.out.println("Pilihan menu tidak tersedia.");
            return;
        }

        double total = harga * porsi;
        double diskon = 0;

        if (porsi > 2) {
            diskon += 0.05;
        }
        if (total > 50000) {
            diskon += 0.05;
        }

        total = total - (total * diskon);

        System.out.println("\nMenu: " + menu);
        System.out.println("Jumlah: " + porsi);
        System.out.println("Total harga = " + total);
    }
}