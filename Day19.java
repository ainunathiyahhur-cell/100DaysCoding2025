public class Day19 {
    public static void main(String[] args) {
        double angkaBesar = 45.67;

        int angkaKecil = (int) angkaBesar;
        byte dataByte = (byte) angkaBesar;

        System.out.println("Angka double   : " + angkaBesar);
        System.out.println("Konversi ke int: " + angkaKecil);
        System.out.println("Konversi ke byte: " + dataByte);
    }
}