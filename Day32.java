import java.util.Scanner;
public class day32 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan angka: ");
        int a = input.nextInt();
        System.out.print("Masukkan angka: ");
        int b = input.nextInt();

        boolean hasil = (a > 10 || b > 10);

        System.out.println("Apakah salah satu angka lebih dari 10? " + hasil);
    }
}