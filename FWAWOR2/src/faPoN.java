import java.util.Scanner;

public class faPoN {
public static void main(String[] args) {
	Scanner S=new Scanner(System.in);
	System.out.println("Enter a number");
	int num=S.nextInt();
	PON(num);
}
static void PON(int a)
{
	if(a>=0)
	{
		System.out.println("Positive Number");
	}
	else
	{
		System.out.println("Negative Number");
	}
}
}
