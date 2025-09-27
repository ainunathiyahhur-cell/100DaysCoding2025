public class PrimitifKeString5 {
    public static void main(String[] args) {
        int umur = 18;
        float suhu = 28.5f;
        double beratBadan = 56.7;
        char grade = 'B';
        boolean aktif = true;

        String strUmur = umur + "";
        String strBeratBadan = Double.toString(beratBadan);
        String strSuhu = String.valueOf(suhu);
        String strGrade = grade + "";
        String strAktif = Boolean.toString(aktif);

        System.out.println("Umur ke String: " + strUmur);
        System.out.println("Berat Badan ke String: " + strBeratBadan);
        System.out.println("Suhu ke String: " + strSuhu);
        System.out.println("Grade ke String: " + strGrade);
        System.out.println("Aktif ke String: " + strAktif);
    }
}