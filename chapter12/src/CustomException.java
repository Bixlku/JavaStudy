public class CustomException {
    public static void main(String[] args) {
        int age =1000;
        if(!(age>=18&&age<=120)){
            //这里我们可以通过构造器设置信息
            throw new AgeException("the age should be between 18 and 120");
        }
        System.out.println("年龄正确");
    }
}
//自定义一个异常
class AgeException extends RuntimeException{
    public AgeException(String message) {
        super(message);//ctrl+B可以看到，一直一直向上传
    }
}
