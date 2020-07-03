import java.util.Scanner;

public class FoSumArray {
public static void main(String[] args) {
	ArraySum();
}
static void ArraySum()
{
	Scanner S=new Scanner(System.in);
	System.out.println("Enter a limit");
	int L=S.nextInt();
	System.out.println("Enter Values");
	int i;
	int v[]=new int[L];
	for(i=0;i<L;i++)
	{
		v[i]=S.nextInt();
	}
	System.out.println("Entered values of Array");
	for(i=0;i<L;i++)
	{
		System.out.println(v[i]);
	}
	System.out.println("Sum of Array");
	int Sum=0;
	for(i=0;i<L;i++)
	{
		Sum=Sum+v[i];
	}
	System.out.println("Sum is"+Sum);
}
}
