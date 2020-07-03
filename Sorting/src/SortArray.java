import java.util.Scanner;

public class SortArray {
public static void main(String[] args) {
	Scanner S=new Scanner(System.in);
	System.out.println("Enter a limit");
	int L=S.nextInt();
	System.out.println("Enter values");
	int a[]=new int[L];
	for(int i=0;i<L;i++) {
		a[i]=S.nextInt();
		
	}
	int temp=0;
	for(int i=0;i<L-1;i++) {
		for(int j=i+1;j<L;j++) {
			if(a[i]>a[j]) {
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		}
	}
	System.out.println("Sorted values are");
	for(int i=0;i<L;i++) {
		System.out.println(a[i]);
	}
}
}
