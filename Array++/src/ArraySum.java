import java.util.Scanner;

public class ArraySum {
public static void main(String[] args) {
	Scanner SC=new Scanner(System.in);
	System.out.println("Enter a limit");
	int L=SC.nextInt();
	System.out.println("Enter values");
	int i=0;
	int a[]=new int[L];
	int sum=0;
	for(i=0;i<L;i++) {
		a[i]=SC.nextInt();
		sum=sum+a[i];
	}
System.out.println(sum+"\t");
}
}