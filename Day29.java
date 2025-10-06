package Codingday29;
import java.util.Scanner;
public class day29 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Masukkan angka: ");
        int a = input.nextInt();
        System.out.println("Masukkan angka: ");
        int b = input.nextInt();
        
        System.out.println(a + " hasil lebih kecil dari "+ (a<b));
        System.out.println(a + " hasil lebih besar dari "+ (a>b));
    }
    
}