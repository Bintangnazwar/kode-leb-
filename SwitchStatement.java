public class SwitchStatement {
    public static void main(String[] args) {

        var nilai = "";

        switch(nilai){
            case "A":
            System.out.println("wow nilai anda sangat bangus");
            break;

            case "B":
            case "C":
                System.out.println("nilai anda cukup baik");
                break;

            case "D":
                System.out.println("anda tidak lulus");
                break;
            default:
                System.out.println("munkin anda salah jurusan");
        }
    }
}
