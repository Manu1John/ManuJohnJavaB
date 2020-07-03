import java.util.Scanner;

public class Larger {
public static void main(String[] args) {
	Scanner S=new Scanner(System.in);
	System.out.println("Enter 2 Numbers");
	int n1=S.nextInt();
	int n2=S.nextInt();
	if(n1>n2)
	{
		System.out.println("Greatest Number is "+n1);
	}
	else
	{
		System.out.println("Greatest Number is "+n2);
	}
}
}
