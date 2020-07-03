import java.util.Scanner;

public class FoarAverage {
public static void main(String[] args) {
	
	 Average();
}
static void Average() {
	
	System.out.println("Enter 3 Numbers");
	Scanner S =new Scanner(System.in);
float a=S.nextFloat();
float b=S.nextFloat();
float c=S.nextFloat();
float d=(a+b+c)/3;
	System.out.println("Average is "+d);
}
}
