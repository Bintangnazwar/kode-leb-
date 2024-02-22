public class Array {
    public static void main(String[] args) {

        String[] stringArray;
        stringArray = new String[9];

        stringArray[0] = "bintang";
        stringArray[1] = "nazwar";
        stringArray[2] = "wulan";
        stringArray[3] = "akbar";

        System.out.println(stringArray[0]);
        System.out.println(stringArray[1]);
        System.out.println(stringArray[2]);
        System.out.println(stringArray[3]);

       String[][] members ={
               {"bintang" , "nazwar"},
               {"riski", "ramahan"},
               {"joko"}
       };

        System.out.print(members[0][1]);
        System.out.println(members[1][1]);
        System.out.println(members[2]);
    }
}
