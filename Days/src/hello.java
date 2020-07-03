import java.util.Scanner;

public class hello {
public static void main(String[] args) {
	Scanner S1=new Scanner(System.in);
	System.out.println("Enter a Number");
	int num=S1.nextInt();
	Sample s=new Sample();
	s.DayDisplay(num);
}
}
