import java.util.Scanner;
public class day39 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("===== KEDAI RASA MANTUL =====");
        System.out.println("1. Nasi Goreng");
        System.out.println("2. Mie Goreng");
        System.out.println("3. Sate Ayam");
        System.out.println("4. Keluar");
        System.out.print("Pilih menu (1-4): ");
        int pilihan = input.nextInt();
        
        if (pilihan == 1) {
            System.out.println("Anda memilih Nasi Goreng. Harga: Rp15.000");
        } 
        else if (pilihan == 2) {
            System.out.println("Anda memilih Mie Goreng. Harga: Rp12.000");
        } 
        else if (pilihan == 3) {
            System.out.println("Anda memilih Sate Ayam. Harga: Rp20.000");
        } 
        else if (pilihan == 4) {
            System.out.println("Terima kasih! Silahkan Datang Kembali.");
        } 
        else {
            System.out.println("Pilihan tidak valid, silakan coba lagi.");
        }
    }
}