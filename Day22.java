import java.util.Scanner;

public class Day22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan sisi persegi: ");
        long sisi = input.nextLong();

        long luas = sisi * sisi;

        System.out.println("Luas persegi = " + luas);
    }
}