public class Codingday14 {
    public static void main(String[] args) {
        
        String strInt = "789";
        int angka = Integer.parseInt(strInt);

        String strLong = "123456789";
        long angkaBesar = Long.parseLong(strLong);

        String strBoolean = "false";
        boolean kondisi = Boolean.parseBoolean(strBoolean);

        System.out.println("Angka : " + angka);
        System.out.println("Angka : " + angkaBesar);
        System.out.println("Kondisi : " + kondisi);
    }
}