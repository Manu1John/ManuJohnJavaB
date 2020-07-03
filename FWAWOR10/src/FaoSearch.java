import java.util.Scanner;

public class FaoSearch {
public static void main(String[] args) {
	Scanner S=new Scanner(System.in);
	System.out.println("Enter a Limit");
	int K=S.nextInt();
	ArraySearch(K);
}
static void ArraySearch(int L) {
	Scanner S2=new Scanner(System.in);
	System.out.println("Enter Values");
	int a[]=new int[L];
	int i=0;
	for(i=0;i<L;i++) {
		a[i]=S2.nextInt();
	}
	System.out.println("Enter a Search Key");
	int Sa=S2.nextInt();
	int flag=0;
	for(i=0;i<L;i++) {
		if(Sa==a[i]) {
			flag=1;
			break;
		}
	}
	if(flag==1) {
		System.out.println("Value found at Positiom "+(i+1));
	}else {
		System.out.println("Value Not Found");
	}

}
}
