public class IfStatement {
    public static void main(String[] args) {

        var nilai = 70;
        var absen = 30;

        if (nilai >= 75 && absen >= 75) {
            System.out.println("selamat anda lulus");
        } else {
            System.out.println("silahkan coba lagi di tahun depan");
        }

        if (nilai >= 80 && absen >= 88) {
            System.out.println("nilia anda A");

        } else if (nilai >= 70 && absen >= 70) {
            System.out.println("nilai anda B");

        } else if (nilai >= 60 && absen >= 60){
            System.out.println("nilai anda C");

        } else if (nilai >= 50 && absen >= 50){
            System.out.println("nilai anda D");

        } else {
            System.out.println("nilai anda E");
        }



    }
}
