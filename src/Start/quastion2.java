package Start;

import java.util.Scanner;
public class quastion2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		//A
		System.out.println("Please enter a number : ");
		int num = sc.nextInt();
		
		System.out.println(NumberPrime(num));
		
		//B
		int counter = 0;
		System.out.println("Please enter a number of pairs that you wanna check : ");
		int pairs = sc.nextInt();
		for(int i = 1; i<=pairs;i++) {
			
			System.out.println("That is pair numbers No : "+ i);
			System.out.println("Please enter a first number : ");
			int num1 = sc.nextInt();
			System.out.println("Please enter a second number : ");
			int num2 = sc.nextInt();
			
			NumberPrime(num1);
			NumberPrime(num2);
			if(NumberPrime(num1) || NumberPrime(num2)) {
				counter++;
			}

		}
		if(counter != 0) {
			System.out.println("This is Preliminary collection.");
		}else {
			System.out.println("Freak Collection.");
	}
	}
	//A
	public static boolean NumberPrime(int num) {
		
		boolean flag = false;
		
		for(int i = 1; i<=(num/2); i++) {
			
		if(num%(i)==0) {
			flag = false;
		}else{
			flag = true;
		}
	}
		if(flag)
			return true;
		else 
			return false;
	}
}
