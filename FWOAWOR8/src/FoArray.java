import java.util.Scanner;

public class FoArray {
public static void main(String[] args) {
	Array();
}
static void Array()
{
	Scanner S=new Scanner(System.in);
	System.out.println("Enter array Limit");
	int L=S.nextInt();
	System.out.println("Enter values ");
	int v[]=new int[L];
	int i=0;
	for(i=0;i<L;i++)
	{
		v[i]=S.nextInt();
	}
	System.out.println("Entered values of array");
	for(i=0;i<L;i++)
	{
		System.out.println(v[i]);
	}

}
}
