//Program using unary operators

public class UnaryOperator{
	public static void main(String args[]){
		int num1=10;
		int num2;
		System.out.println("num1");
		//Pre increment
		num2=++num1;
		System.out.println(num1+" "+num2);
		//post increment
		num2=num1++;
		System.out.println(num1+" "+num2);
		//Pre decrement
		num2=--num1;
		System.out.println(num1+" "+num2);
		//post decrement
		num2=num1--;
		System.out.println(num1+" "+num2);
		char ch='d';
		System.out.println(ch);
		char ch1=++ch;
		System.out.println(ch);
		char ch2=--ch;
		System.out.println(ch);
		char ch3=--ch;
		System.out.println(ch);
}
}