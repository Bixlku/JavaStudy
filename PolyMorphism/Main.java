public class Main {
    public static void main(String[] args) {
        Sub s = new Sub();
        System.out.println(s.count);//20
        s.display();//20
        Base b = s;
        System.out.println(b == s);//true
        System.out.println(b.count);//这里要注意了，属性的值看编译类型，此处b的编译类型是Base，因此count=10
        b.display();//与上面不同，方法从子类开始找起，看的是运行类型，所以其取20
    }
}