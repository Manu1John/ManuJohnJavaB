import java.util.Scanner;

public class Prime {
public static void main(String[] args) {
	Scanner S=new Scanner(System.in);
	System.out.println("Enter A number");
	int num=S.nextInt();
	int flag=0;
	for(int i=0;i<num%2;i++) {
	if(num%1==0) {
		flag=1;
		break ;
		
	}
}
	if(flag==0) {
		System.out.println("Entered Number is Prime");
	}else {
		System.out.println("Entered Number is not Prime");
	}
}
}