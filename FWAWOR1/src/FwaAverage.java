import java.util.Scanner;

public class FwaAverage {
public static void main(String[] args) {
	Scanner S=new Scanner(System.in);
	System.out.println("Enter 3 Numbers");
	float n1=S.nextFloat();
	float n2=S.nextFloat();
	float n3=S.nextFloat();
	Average(n1,n2,n3);
}
static void Average(float a, float b,float c)
{
	float R=(a+b+c)/3;
	System.out.println("Average is "+R);
}
}
