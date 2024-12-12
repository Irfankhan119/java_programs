//Program demonstrating different Types of methods

public class Calci{
	int num1,num2;
	void sum(){
		int sum=num1+num2;
		System.out.println("Sum="+sum);
	}
	//method with returntype
	int difference(){
		int difference=num1-num2;
		return difference;
	}
	//method with Parameters
	void product(int a,int b){
		int product=a*b;
		System.out.println("Product="+product);
	}
	//method with return type and parameters
	int division(int a,int b){
		int quotient=a/b;
		return quotient;
	}

	public static void main(String args[]){
	
	Calci calci=new Calci();
	calci.num1=30;
	calci.num2=20;
	calci.sum();
	int val=calci.difference();
	System.out.println("Difference"+val);
	calci.product(76,9);
	System.out.println("Division val="+calci.division(20,4));
	}
}