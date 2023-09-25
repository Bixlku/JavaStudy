import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        //System.out.println("Hello world!");
        Book book1 = new Book("三国演义","罗贯中",114);
        Book book2 = new Book("高等数学", "张宇", 51);
        Book book3 = new Book("西游记", "忘了", 41);

        Collection col = new ArrayList();
        col.add(book1);
        col.add(book2);
        col.add(book3);

        Iterator iterator = col.iterator();

        //快捷键itit可以生成while循环
        while (iterator.hasNext()) {
            Object next = iterator.next();
            System.out.println("obj= "+next);
            //默认调用的是toString方法
        }


    }
}

class Book{
    String title;
    String author;
    double price;

    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                '}';
    }
}