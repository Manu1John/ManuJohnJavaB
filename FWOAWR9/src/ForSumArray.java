import java.util.Scanner;

public class ForSumArray {
public static void main(String[] args) {

int R=ArraySum();
System.out.println("Sum of Array\t"+R);
}
static int ArraySum() {
	Scanner S=new Scanner(System.in);
	System.out.println("Enter a limit");
	int L=S.nextInt();
	System.out.println("Enter values");
	int a[]=new int[L];
	int i=0;
	int Sum=0;
	for(i=0;i<L;i++) {
		a[i]=S.nextInt();
		Sum=Sum+a[i];
	}
	return Sum;
}
}
