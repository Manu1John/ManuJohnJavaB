import java.util.Scanner;

public class Sample {
public static void main(String[] args) {
	Scanner S=new Scanner(System.in);
	System.out.println("Enter 3 Numbers");
float n1=S.nextFloat();
float n2=S.nextFloat();
float n3=S.nextFloat();
Average A=new Average();
A.CalculateAverage(n1,n2,n3);
A.DisplayAverage();
}
}
