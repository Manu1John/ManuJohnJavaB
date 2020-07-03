import java.util.Scanner;

public class Sample {
public static void main(String[] args) {
	Scanner S1=new Scanner(System.in);
	System.out.println("Enter your Marks of Five Subject");
	float a=S1.nextFloat();
	float b=S1.nextFloat();
	float c=S1.nextFloat();
	float d=S1.nextFloat();
	float e=S1.nextFloat();
	Hello H=new Hello();
	H.CalculateGrade(a,b,c,d,e);
	
}

}
