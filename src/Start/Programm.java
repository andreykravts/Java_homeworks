package Start;


import java.util.Scanner;
public class Programm {

	//QUASTION 1 A B
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num, dig,  num1;
		
		System.out.println("Please enter at first a number that do you like to check, and after a digit that you want to find in this number : ");
		num = sc.nextInt();
		do {
			dig=sc.nextInt();
			if(dig<0&& dig >9)
				System.out.println("Please enter a digit! 0-9 ! : ");
		}while(dig<0&& dig >9);
		
		digit(num,dig);
		System.out.println(digit(num,dig));
		
		System.out.println("Please enter a number what you wanna chek : ");
		
		num1 = sc.nextInt();
		number(num, num1);
		System.out.println(number(num, num1));
	}

	//A
	public static boolean digit(int num, int dig) {
		while(num!=0){
			
			if(dig==num%10)
				return true;
			
			
			num=num/10;
		}
		return false;
	}
	
	//B
	public static boolean number(int num, int num1) {
		
		//we need to use flag for result (return)
		//flag will be stay false by default
		boolean flag= false;
		
		//in the loop for we use digit function
		//firstly we check what kind digits have a number "num"
		//from 0 to 09
		for(int i = 0; i<10; i++) {
			
			
			//here we just make checking if current "digit" i - iterator we have in the both number 
			//If the both function digit return the same result flag is tru and we should to continue checking
			//but if one of the digits functions have the different result from another we will stop our checking with help "BREAK"
			
			if(digit(num,i) == digit(num1,i)) {
				flag = true;
			}else {
				flag = false;
				break;
			}

			
		}
		
		if(flag)
			return true;
		else 
			return false;
		
		
		

	}
}
