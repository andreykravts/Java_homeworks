package Start;


import java.util.Scanner;
public class quastion1_c{

	//QUASTION 1 C
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);	
		int m, num, num1,dig;
		
		System.out.println("Please enter a positive number of pairs ");
		do {
			
		m=sc.nextInt();
		
		if(m<0)
			System.out.println("Error, please try again. /n Please enter a positive number : ");
		
		}while(m<0);
		
		
		
		for(int i = 1; i<=m; i++) {
			System.out.println("This is a pair of number No : "+i);
			System.out.println("Plese enter a first number of the pair : ");
			num = sc.nextInt();
			System.out.println("Plese enter a second number of the pair : ");
			num1 = sc.nextInt();
			
			System.out.println("True = Yes  & False = NO " + number(num,num1));
			
			if(number(num,num1))
				System.out.println("YES");
			else
				System.out.println("NO");
		}
		

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

//				32121 321 YES    	OK
//				32645 3562 NO		OK
//				123 32112 YES		OK
//				1003 3274 NO		OK
//				1012 1042 NO		ok
//			}
			
		}
		
		if(flag)
			return true;
		else 
			return false;
		
		
		

	}
}
