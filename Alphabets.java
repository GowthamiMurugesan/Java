import java.util.*;
public class Alphabets {

	public static void main(String[] args) {
String alphabets;
Scanner in=new Scanner(System.in);
alphabets=in.nextLine();
if(alphabets.equals("a")||alphabets.equals("e")||alphabets.equals("i")||alphabets.equals("o")||alphabets.equals("u")){
	System.out.println("vowels");
}
else{
	System.out.println("consonants");
}
	}

}
