import java.util.Scanner;

public class FoPattern {
public static void main(String[] args) {
	Pattern();
}
static void Pattern()
{
	Scanner S=new Scanner(System.in);
	System.out.println("Enter a Limit");
	int L=S.nextInt();
	for(int i=1;i<=L;++i)
	{
		for(int j=1;j<=i;++j)
		{
			System.out.println(" *");
		}
		System.out.println("\n");
	}

}
}
