import java.util.Scanner;

public class FoMultiDimensional {
public static void main(String[] args) {
	TwoDimensional();
}
static void TwoDimensional()
{
	Scanner S=new Scanner(System.in);
	System.out.println("Enter Array Limit");
	int L=S.nextInt();
	System.out.println("Enter Values");
	int i;
	int j;
	int V[][]=new int[L][L];
	for(i=0;i<L;i++)
	{
		for(j=0;j<L;j++)
		{
			V[i][j]=S.nextInt();
		}
	}
	System.out.println("Entered values are \n");
	for(i=0;i<L;i++)
	{
		for(j=0;j<L;j++)
		{
			System.out.println("\t"+V[i][j]);
		}
		System.out.println("\n");
	}
}
}
