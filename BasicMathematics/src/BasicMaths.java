import java.util.Scanner;

public class BasicMaths {
public static void main(String[] args) {
	Scanner S=new Scanner(System.in);
	System.out.println("Enter 2 Numbers");
	int a=S.nextInt();
	int b=S.nextInt();
	System.out.println("1 for Addition \n2 for Subtraction \n3 for Division \n4 for Multiplication \n Enter your choice");
	int C=S.nextInt();

	if(C==1)
	{
		int R=a+b;
		System.out.println("Result is "+R);
	}
	else if(C==2)
	{
		int R=a-b;
		System.out.println("REsult is "+R);
	}
	else if(C==3)
	{
		float R=a/b;
		System.out.println("Result is "+R);
	}
	else if(C==4)
	{
		int R=a*b;
		System.out.println("Result is "+R);
	}
	else
	{
		System.out.println("You are fool");
	}
}
}
