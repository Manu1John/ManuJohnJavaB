import java.util.Scanner;

public class FoSum {
public static void main(String[] args) {
	sum();
}
static void sum() {
	Scanner S=new Scanner(System.in);
	System.out.println("Enter 2 numbers");
	int num1=S.nextInt();
	int num2=S.nextInt();
	int R=num1+num2;
	System.out.println("Result is "+R);
}


}	