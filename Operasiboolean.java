public class Operasiboolean {
    public static void main(String[] args) {

        var absen = 100;
        var nilaiAkhir = 100;

        boolean lulusAbsen = absen >= 75;
        boolean lulusNilai = nilaiAkhir >= 75;

        var lulus = lulusAbsen && lulusNilai;
        System.out.println(lulus);
    }
}
