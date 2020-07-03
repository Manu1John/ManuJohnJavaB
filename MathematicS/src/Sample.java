import java.util.Scanner;

public class Sample {
void CalculateDisplay(float n1,float n2){
	Scanner S2=new Scanner(System.in);
	System.out.println("1 for Additon \n2 for Subtraction \n3 for Division \n4 for Multiplication \n Enter Your Choice");
	int C=S2.nextInt();
	float R;
	switch(C) {
	case 1:
		R=n1+n2;
		System.out.println("Result is "+R);
		break;
	case 2:
		R=n1-n2;
		System.out.println("Result is "+R);
		break;
	case 3:
		R=n1/n2;
		System.out.println("Result is "+R);
		break;
	case 4:
		R=n1*n2;
		System.out.println("Result is "+R);
		break;
	default:
		System.out.println("Wrong Entery");
	
	
	
	}
	
	
	
	
	}
}

