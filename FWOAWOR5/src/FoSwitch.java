import java.util.Scanner;

public class FoSwitch {
public static void main(String[] args) {
	Switch();
}
static void Switch()
{
	Scanner S=new Scanner(System.in);
	System.out.println("1 for Porrotta \n2 for Chappthi \n3 for Manthi \n4 for Biriyani \n Enter your Choice");
	int C=S.nextInt();
	if(C==1)
	{
		System.out.println("You have Selected porrotta");
	}
	else if(C==2)
		{
		System.out.println("You have Selected Chappathi");
		}
	else if(C==3)
	{
		System.out.println("You have Selected Manthi");
	
		}
	else if(C==4)
	{
		System.out.println("You have Selected Biriyani");
	}
	else
	{
		System.out.println("Get Lost");
	}
}
}
