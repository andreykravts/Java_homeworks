package Start;
import java.util.Scanner;
public class quastion3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num1,num2,num3,num4,max=1;
		
		 for(int i = 1; i<=625 || max>4;i++){
			 //5^4=625
				num1=(int)(Math.random()*((10-5)+1));
				num2=(int)(Math.random()*((10-5)+1));
				num3=(int)(Math.random()*((10-5)+1));
				num4=(int)(Math.random()*((10-5)+1));
				
				max= Math.max(max, function(num1,num2,num3,num4));
				
//				if(max<function(num1,num2,num3,num4))
//				max=function(num1,num2,num3,num4);
				
//				System.out.println("Count steps : "+ function(num1,num2,num3,num4));
				
		}	
		 System.out.println("Max steps : "+max);
				
	}
	static int function(int num1, int num2,int num3,int num4) {
		
		int a=1,b=1,c=1,d=1,count_steps=0;
		
		while(a>0&&b>0&&c>0&&d>0) {
		a = num1-num2;
		if(a<0)
			a*=-1;
		b = num2-num3;
		if(b<0)
			b*=-1;
		c = num3-num4;
		if(c<0)
			c*=-1;
		d = num1-num4;
		if(d<0)
			d*=-1;
		//System.out.println(a+" "+b+" "+c+" "+d);
		num1=a;
		num2=b;
		num3=c;
		num4=d;
		count_steps++;
		}
		return count_steps;
	}

}
