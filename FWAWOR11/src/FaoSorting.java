import java.util.Scanner;

public class FaoSorting {
public static void main(String[] args) {
	Scanner s1=new Scanner(System.in);
System.out.println("Enter a Limit");
int K=s1.nextInt();
Sort(K);
}
static void Sort(int L) {
	Scanner s2=new Scanner(System.in);
System.out.println("Enter values");
int i;
int j;
int temp;
int a[]=new int[L];
for(i=0;i<L;i++) {
	a[i]=s2.nextInt();
}
for(i=0;i<L-1;i++) {
	for(j=i+1;j<L;j++) {
		if(a[i]<a[j]) {
			temp=a[i];
			a[i]=a[j];
			a[j]=temp;
		}
	}

}
System.out.println("Sorted Values are");
for(i=0;i<L;i++) {
	System.out.println(a[i]);
}
}
}
