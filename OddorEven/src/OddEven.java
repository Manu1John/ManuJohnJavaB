import java.util.Scanner;

public class OddEven {
public static void main(String[] args) {
	Scanner S=new Scanner(System.in);
	System.out.println("Enter a number");
	int num=S.nextInt();
	if(num%2==0)
	{
		System.out.println("Even Number");
	}
	else
	{
		System.out.println("Odd Number");
	}
}
}
