import java.util.Scanner;

public class day30 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nilai a: ");
        int a = input.nextInt();

        System.out.print("Masukkan nilai b: ");
        int b = input.nextInt();

        System.out.println("Hasil a <= b: " + (a <= b));
        System.out.println("Hasil a >= b: " + (a >= b));

    }
}