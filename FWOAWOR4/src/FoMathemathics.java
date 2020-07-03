import java.util.Scanner;

public class FoMathemathics {
public static void main(String[] args) {
	Maths();
}
static void Maths()
{
	Scanner S=new Scanner(System.in);
	System.out.println("Enter 2 Numbers");
	float n1=S.nextFloat();
	float n2=S.nextFloat();
	System.out.println("1 for Additon \n2 for Subtraction \n3 for Multiplication \n4 for Division \n Enter your Choice");
	int Choice=S.nextInt();
	float R;
	if(Choice==1)
	{
		R=n1+n2;
		System.out.println("Result is "+R);
	}
	else if(Choice==2)
	{
		R=n1-n2;
		System.out.println("Result is "+R);
	}
	else if(Choice==3)
	{
		R=n1*n2;
		System.out.println("Result is "+R);
	}
	else if(Choice==4)
	{
		R=n1/n2;
		System.out.println("Result is "+R);
	}
	else
	{
		System.out.println("You are fool");
	}
}
}
