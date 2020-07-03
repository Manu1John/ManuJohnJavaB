import java.util.Scanner;

public class Sample1 {
public static void main(String[] args) {
	Scanner S1=new Scanner(System.in);

	System.out.println("Enter 2 Numbers");
	int n1=S1.nextInt();
	int n2=S1.nextInt();
Sum1 S=new Sum1();
S.CalculateSum(n1,n2);
S.DisplaySum();
}
}
