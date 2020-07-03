import java.util.Scanner;

public class Sum {
public static void main(String[] args) {
	Scanner S1=new Scanner(System.in);
	System.out.println("Enter a Limit");
	int L=S1.nextInt();
	int F;
	F=Add(L);
	System.out.println("Sum is "+F);
}
static int Add(int K) {
	Scanner S2=new Scanner(System.in);
	System.out.println("Values of array");

	int sum=0;
	for(int i=1;i<K;i++)
	{
		if(i%2==1)
		{
			System.out.println(i);
			sum=sum+i;
		}
	}
	return sum;
}
}
