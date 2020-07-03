import java.util.Scanner;

public class AverageSample {
public static void main(String[] args) {
	Scanner SE=new Scanner(System.in);
	System.out.println("Enter 3 numbers");
	float a=SE.nextFloat();
	float b=SE.nextFloat();
	float c=SE.nextFloat();
	float A=(a+b+c)/3;
	System.out.println("Average is "+A);
}
}
