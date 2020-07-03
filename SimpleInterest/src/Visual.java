import java.util.Scanner;

public class Visual {

	Visual(){
	Scanner S=new Scanner(System.in);
	System.out.println("Enter Principle amount");
	int P=S.nextInt();
	System.out.println("Enter interest rate");
	float R=S.nextFloat();
	System.out.println("Enter Number of Years");
	float n=S.nextFloat();

	float SI;
	SI=(P*R*n/100);



		System.out.println(SI);
		
	}


}




