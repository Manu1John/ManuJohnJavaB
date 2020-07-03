import java.util.Scanner;

public class FrAverage {
public static void main(String[] args) {
	float A=Average();
	System.out.println("Average is :"+A);
}
static float Average() {
	Scanner S=new Scanner(System.in);
	System.out.println("enter 3 numbers");
	float n1=S.nextFloat();
	float n2=S.nextFloat();
	float n3=S.nextFloat();
	float R=(n1+n2+n3)/3;
	return R;
}
}
