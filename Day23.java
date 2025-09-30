import java.util.Scanner;

public class Day23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan panjang: ");
        int panjang = input.nextInt();

        System.out.print("Masukkan lebar: ");
        int lebar = input.nextInt();
         
        // rumus luas persegi panjang
        int luas = panjang * lebar;


        System.out.println("Luas persegi panjang adalah: " + luas);
    }
}