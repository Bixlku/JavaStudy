import java.util.Arrays;

public class Homework04 {
    public static void main(String[] args) {
        try {
            int[] ans = Count("yyh114514QWERTY");
            System.out.println(Arrays.toString(ans));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static int[] Count(String str) {
        char[] ch = str.toCharArray();
        int up = 0, down = 0, num = 0;
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] < 'z' && ch[i] > 'a') down++;
            else if (ch[i] < 'Z' && ch[i] > 'A') up++;
            else if (ch[i] < '9' && ch[i] > '0') num++;
            else throw new RuntimeException("请输入字母或数字");
        }
        return new int[]{up, down, num};
    }
}
