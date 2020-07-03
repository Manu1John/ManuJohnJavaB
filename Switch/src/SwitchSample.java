import java.util.Scanner;

public class SwitchSample {
public static void main(String[] args) {
	Scanner S=new Scanner(System.in);
	
	System.out.println("1 for Porrotta \n2 for Chappathi \n3 for Manthi \n4 for Biriyani");
	int C=S.nextInt();
	switch(C)
	{
	case 1:
		System.out.println("You have selected porrotta");
		break;
	case 2:
		System.out.println("You have selected Chappathi");
		break;
	case 3:
		System.out.println("You have selected Manthi");
		break;
	case 4:
		System.out.println("You have selected Biriryani");
		break;
	default :
		System.out.println("Idiot");
	}
	
	
}
}
