import java.util.Scanner;
public class day38 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan sebuah angka: ");
        int angka = input.nextInt();
        
        if (angka > 0) {
            System.out.println("Angka positif.");
        } else if (angka < 0) {
            System.out.println("Angka negatif.");
        } else {
            System.out.println("Angka nol.");
        }
    }
}