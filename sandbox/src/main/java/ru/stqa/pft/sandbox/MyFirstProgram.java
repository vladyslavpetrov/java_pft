package ru.stqa.pft.sandbox;

public class MyFirstProgram{
	public static void main(String[] args) {
		helloWorld("world");
		System.out.println("Площадь квадрата 5 равняется: " + area(5));

		double a = 6;
		double b = 7;
		System.out.println("Площадь прямоугольника со сторонами: "+a+" и " +b+" равняется: " + area(a, b));
	}

    public static void helloWorld(String name){
		System.out.println("Hello, " + name+"!");
	}

	public static double area(double l){
    	return l * l;
	}

	public static double area(double a, double b){
		return a * b;
	}
}