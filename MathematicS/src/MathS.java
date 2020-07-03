import java.util.Scanner;

public class MathS {
public static void main(String[] args) {
	Scanner S1 =new Scanner(System.in);
	System.out.println("Enter 2 numbers");
	float a=S1.nextFloat();
	float b=S1.nextFloat();

	Sample S=new Sample();
	S.CalculateDisplay(a,b);

}
}
