import java.io.FileNotFoundException;

public class Exception01 {
    public static void main(String[] args) {

    }

    public static void f1(){
        //f2();
    }
    public static void f2() throws FileNotFoundException {

    }

    public static void f3(){
        f4();
    }
    public static void f4() throws ArithmeticException{

    }

}