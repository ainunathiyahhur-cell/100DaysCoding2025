import java.util.Scanner;

public class Day24 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jari-jari lingkaran: ");
        double r = input.nextDouble();

        // Rumus luas lingkaran: π × r × r
        double luas = Math.PI * r * r;

        System.out.println("Luas lingkaran dengan jari-jari " + r + " adalah: " + luas);

    }
}