import java.util.Scanner;

public class foLarger {
public static void main(String[] args) {
	Greatest();
}
static void Greatest()
{
	Scanner s=new Scanner(System.in);
	System.out.println("Enter 2 Numbers");
	int n1=s.nextInt();
	int n2=s.nextInt();
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
