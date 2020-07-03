import java.util.Scanner;

public class PrimeNumber {
public static void main(String[] args) {
	Scanner S=new Scanner(System.in);
	System.out.println("Enter a number");
	int a=S.nextInt();
	int flag=0;
for(int i=0;i<a%2;i++)
{
	if(a%i==0)
	{
		flag=1;
		break;
	}
	if(flag==0)
	{
		System.out.println("Prime Number");
	}
	else
	{
		System.out.println("Not Prime");
	}
}
}
}
