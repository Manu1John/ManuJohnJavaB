import java.util.Scanner;

public class FaSwitch {
public static void main(String[] args) {
	Scanner S=new Scanner(System.in);
	System.out.println("1 for Porrotta \n2 for Chappathi \n3 for Mantthi \n4 for Biriyani \n enter your Choice");
	int G=S.nextInt();
	Selection(G);
}
static void Selection(int C){
	switch(C) {
	case 1:
		System.out.println("You have Selected Porrotta");
		break;
	case 2:
		System.out.println("You have Selected Chappathi");
		break;
	case 3:
		System.out.println("You have Selected Manthi");
		break;
	case 4:
		System.out.println("you have Selected Biriyani");
		break;
	default:
		System.out.println("Auf dem Kopf Stehan");
	}
}
}
