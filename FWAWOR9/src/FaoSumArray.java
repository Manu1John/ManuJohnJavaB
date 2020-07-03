import java.util.Scanner;

public class FaoSumArray {
public static void main(String[] args) {
Scanner S=new Scanner(System.in);
System.out.println("Enter a Limit");
int B=S.nextInt();
SumArray(B);
}
static void SumArray(int L) {
	System.out.println("Enter Values");
	Scanner S1=new Scanner(System.in);
	int h[]=new int[L];
	int sum=0;
	for(int k=0;k<L;k++) {
		h[k]=S1.nextInt();
		sum=sum+h[k];
	}
System.out.println("Sum of Array\n"+sum);

		
	
}
}
