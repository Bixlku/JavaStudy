public class Object01{
	public static void main(String[] args){
		Car bmw = new Car("yyh",900,"red");
		System.out.println(bmw.toString());


	}
}

class Car{
	String name;
	double price;
	String color;

	public Car(String name,double price,String color){
		this.price = price;
		this.color = color;
		this.name = name;
	}
}

class Person{
	String name;
	int old;

	public Person(String name,int old){
		this.name=name;
		this.old=old;
	}
}

class Worker extends Person{
	String workplace;

	public Worker(String name,int old,String workplace){
		super(name,old);
		this.workplace=workplace;
	}
}

