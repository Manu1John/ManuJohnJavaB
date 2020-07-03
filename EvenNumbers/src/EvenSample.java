import java.util.Scanner;

public class EvenSample {
public static void main(String[] args) {
	Scanner S=new Scanner(System.in);
	System.out.println("Enetr a Limit");
	int L=S.nextInt();
	for(int i=0;i<=L;i++) {
		System.out.println("Even numbers");
		if(i%2==0) {
			System.out.println(" \n"+i);
		}
	}

	
	
}
}
