import java.util.Scanner;
public class Even {

	public static void main(String[] args) {
int number;
Scanner in=new Scanner(System.in);
number=in.nextInt();
if(number%2==0){
	System.out.println("even number");	
}
else{
		System.out.println("odd number");
}
	}

}
