package ru.stqa.pft.sandbox;


public class MyFirstProgram{
	public static void main(String[] args) {
		helloWorld("world");

		Square s = new Square(5);
		System.out.println("Площадь квадрата " + s.l + " равняется: " + s.area());

		Rectangle r = new Rectangle(6, 7);
		System.out.println("Площадь прямоугольника со сторонами: "+r.a+" и " +r.b+" равняется: " + r.area());

		Point p = new Point(2,3,4,5);
		System.out.println(p.distance());
	}

    public static void helloWorld(String name){
		System.out.println("Hello, " + name+"!");
	}
}