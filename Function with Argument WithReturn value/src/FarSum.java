import java.util.Scanner;

public class FarSum {
public static void main(String[] args) {
	Scanner S=new Scanner(System.in);
	System.out.println("Enter 2 Numbers");
	int a=S.nextInt();
	int b=S.nextInt();
	int R=Sum(a,b);
	System.out.println("Result is "+R);
}
static int Sum(int n1,int n2) {
	int c=n1+n2;
	return c;

}

}
