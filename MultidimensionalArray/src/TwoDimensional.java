import java.util.Scanner;

public class TwoDimensional {
public static void main(String[] args) {
	Scanner S=new Scanner(System.in);
	System.out.println("Enter a Limit");
	int L=S.nextInt();
	System.out.println("Enter values");
	int v[][]=new int[L][L];
	int i=0,j=0;
	for(i=0;i<L;i++)
	{
		for(j=0;j<L;j++)
		{
			v[i][j]=S.nextInt();
		}
	}
	System.out.println("Entered values are \n");
	for(i=0;i<L;i++)
	{
		for(j=0;j<L;j++)
		{
			System.out.println(v[i][j]+" ");
		}
		System.out.println("\t");
	}
}
}
