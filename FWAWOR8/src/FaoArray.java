import java.util.Scanner;

public class FaoArray {
public static void main(String[] args) {
	Scanner S = new Scanner(System.in);
		System.out.println("Enter a Limit");
		int K=S.nextInt();
		Array(K);
	}

static void Array(int L) {
	Scanner S1=new Scanner(System.in);
	System.out.println("Enter values");
	int a[]=new int[L];
	for(int p=0;p<L;p++) {
	a[p]=S1.nextInt();
	}
	System.out.println("Entered values of Array");
	for(int p=0;p<L;p++) {
		System.out.println(a[p]);
	}
}
}
