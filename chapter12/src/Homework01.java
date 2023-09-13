public class Homework01 {
    public static void main(String[] args) {
        try {
            if(args.length!=2) {
                throw new ArrayIndexOutOfBoundsException();
                //这里抛出一个ArrayIndexOutOfBoundsException
            }
            int n1 = Integer.parseInt(args[0]);
            int n2 = Integer.parseInt(args[1]);

            double ans = cal(n1,n2);
            System.out.println(ans);

        } catch (NumberFormatException e) {
            System.out.println("数字格式有问题（例如把字母转成了数字）");
        } catch (ArrayIndexOutOfBoundsException e){
            //这里接受抛出的ArrayIndexOutOfBoundsException
            System.out.println("数组长度不对");
        } catch(ArithmeticException e){
            System.out.println("出现了数学错误");
        }
    }

    static double cal(int n1, int n2){
        return n1/n2;
    }
}


