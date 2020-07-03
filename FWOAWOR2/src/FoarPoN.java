import java.util.Scanner;

public class FoarPoN {
public static void main(String[] args) {
	PON();
}
static void PON() {
	Scanner S=new Scanner(System.in);
	System.out.println("Enter a number");
	int num =S.nextInt();
	if(num>=0) {
		System.out.println("Positive Number");
	}else {
		System.out.println("Negative Number");
	}
}
}
