package method;

import java.util.Scanner;

public class Circle_Area {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Radius : ");
		double r = sc.nextDouble();
		area(r);
		SumNum sm = new SumNum();
		sm.sum(6, 9);
		SumNum.sum(4, 6);
	}
	public static void area(double r) {
		double result = Math.PI * Math.pow(r, 2);
		System.out.println("Area of circle : "+ result);
		}
}
