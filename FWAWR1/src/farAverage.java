import java.util.Scanner;

public class farAverage {
public static void main(String[] args) {
	Scanner S=new Scanner(System.in);
	System.out.println("Enter 3 numbers");
	float n1=S.nextFloat();
	float n2=S.nextFloat();
	float n3=S.nextFloat();
	float R=Average(n1,n2,n3);
	System.out.println("Average is"+R);
	
}
static float Average(float a,float b,float c) {
	float d=(a+b+c)/3;
	return d;
}

}
