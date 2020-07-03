import java.util.Scanner;

public class FaLarger {
public static void main(String[] args) {
	Scanner S=new Scanner(System.in);
	System.out.println("Enter 2 Numbers");
	int Num1=S.nextInt();
	int Num2=S.nextInt();
	Greatest(Num1,Num2);
}
static void Greatest(int a,int b) {
	if(a>b) {
		System.out.println("Greatest Number is "+a);
	}else {
		System.out.println("Greatest Number is "+b);
	}
}
}
