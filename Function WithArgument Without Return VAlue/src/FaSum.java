import java.util.Scanner;

public class FaSum {
public static void main(String[] args) {
	Scanner SC=new Scanner(System.in);
	System.out.println("Enter 2 Numbers");
	int num1=SC.nextInt();
	int num2=SC.nextInt();
	sum(num1,num2);
}
static void sum(int a,int b)
{
	int c;
	c=a+b;
	System.out.println("Result is "+c);
}
}
