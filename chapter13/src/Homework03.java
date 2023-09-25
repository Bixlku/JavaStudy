public class Homework03 {
    public static void main(String[] args) {
        ChangeName("Han shun Ping");
    }

    public static String ChangeName(String str){
        String[] s1 = str.split(" ");
        char[] chs2 = s1[1].toCharArray();

        System.out.println(s1[2]+","+s1[0]+" ."+Character.toUpperCase(chs2[0]));
        return "test";
    }
}
