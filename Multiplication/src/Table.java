import java.util.Scanner;

public class Table {
public static void main(String[] args) {
	Scanner S1=new Scanner(System.in);
	System.out.println("Enter a Number");
	int N=S1.nextInt();
	Multiply M=new Multiply();
	M.Mode(N);
}

}
