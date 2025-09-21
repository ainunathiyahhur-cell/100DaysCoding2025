public class Codingday14 {
    public static void main(String[] args) {
        
        String strInt = "789";
        int angka = Integer.parseInt(strInt);

        String strDouble = "99.99";
        double pecahan = Double.parseDouble(strDouble);

        String strBoolean = "false";
        boolean kondisi = Boolean.parseBoolean(strBoolean);

        System.out.println("Angka : " + angka);
        System.out.println("Pecahan : " + pecahan);
        System.out.println("Kondisi : " + kondisi);
    }
}