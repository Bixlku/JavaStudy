import java.util.Arrays;

public class Homework02 {
    public static void main(String[] args) {
        String name = "yyh";
        String pwd = "114515";
        String email = "ike172345@gmail.com";
        //用户名长度为2或3或4

        try {
            userRegister(name, pwd, email);
            System.out.println("注册完成");
        } catch (Exception e) {
            System.out.println(e.getMessage());
            ;
        }
    }

    public static void userRegister(String name, String pwd, String email) {
        //判断用户名长度为2或3或4
        if (!(name.length() <= 4 && name.length() >= 2)) {
            throw new RuntimeException("用户名");
        }

        //判断密码长度为6，且要求全是数字isDigital
        if (!((pwd.length() == 6) && isDigit(pwd))) {
            throw new RuntimeException("密码长度为6，且要求全是数字");
        }

        //判断邮箱中包含@和. 且@在.的前面
        if (!((email.indexOf('@') != -1) && (email.indexOf('@') < email.indexOf('.')))) {
            throw new RuntimeException("邮箱中包含@和. 且@在.的前面");
        }
    }

    public static boolean isDigit(String pwd) {
        char[] chpwd = pwd.toCharArray();
        for (int i = 0; i < chpwd.length; i++) {
            if (!(chpwd[i] <= '9' && chpwd[i] >= '0')) {
                return false;
            }
        }
        return true;
    }
}
