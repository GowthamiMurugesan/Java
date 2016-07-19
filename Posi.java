import java.util.Scanner;


public class Posi {

	
	public static void main(String[] args) {

		int number;
		Scanner in=new Scanner(System.in);
		System.out.println("enter a number");
		number=in.nextInt();
		if(number>0){
			int a= number%100;
			System.out.println(a);
		}
		else if(number<0){
		System.out.println(0);
		
		}
	}}


