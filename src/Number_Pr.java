//U10316053 µ{¬fºú
import java.math.BigDecimal;
import java.util.Scanner;
public class Number_Pr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Number_Pr num=new Number_Pr();
	}
	Number_Pr(){
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter first number");
		BigDecimal x = new BigDecimal(input.nextLine());
		//key in first number
		System.out.println("Please enter second number");
		BigDecimal y = new BigDecimal(input.nextLine());
		//key in second number
		System.out.println("1>add 2>sub 3>mul 4>div");
		int z=input.nextInt();
		//choose 1>add 2>sub 3>mul 4>div
		if(z==1)System.out.println(x.add(y));
		else if(z==2)System.out.println(x.subtract(y));
		else if(z==3)System.out.println(x.multiply(y));
		else if(z==4)System.out.println(x.divide(y));
		else{
			System.out.println("input error");
		}
	}
	
}
