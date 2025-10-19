import java.util.Scanner;

public class Day42 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan gaji pokok: ");
        double gajiPokok = input.nextInt();

        System.out.println("Masukkan upah lembur per jam: ");
        double lemburPerjam = input.nextInt();

        System.out.println("Masukkan jumlah jam lembur: ");
        int jamLembur = input.nextInt();

        double totalLembur = lemburPerjam * jamLembur;
        double totalGaji = gajiPokok + totalLembur;
        double pajak = 0.10 * totalGaji;
        double gajiBersih = totalGaji - pajak;

        System.out.println("Gaji Bersih: Rp " + gajiBersih);
    }
}