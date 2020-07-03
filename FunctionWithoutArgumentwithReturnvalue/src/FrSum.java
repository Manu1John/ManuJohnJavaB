import java.util.Scanner;

public class FrSum {
	public static void main(String[] args) {
		int C= Sum();
		System.out.println("Result is : "+C);
	}
	static int Sum() {
		Scanner S=new Scanner(System.in);
		System.out.println("Enter 2 numbers");
		int n1=S.nextInt();
		int n2=S.nextInt();
		int R=n1+n2;
		return R;
	}


	
}