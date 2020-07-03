import java.util.Scanner;

public class FaoOdd {
public static void main(String[] args) {
	Scanner S=new Scanner(System.in);
	System.out.println("Enter a Limit");
	int J=S.nextInt();
	Odd(J);
}
static void Odd(int L) {
	System.out.println("Odd numbers are \n");
	for(int i=1;i<L;i++)
	{
		if(i%2==1)
		{
			System.out.println(i);
		}
	}
}
}
