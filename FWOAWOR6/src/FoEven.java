import java.util.Scanner;

public class FoEven {
public static void main(String[] args) {
	Even();
}
static void Even()
{
	Scanner S=new Scanner(System.in);
	System.out.println("Enter a Limit");
	int L=S.nextInt();
	System.out.println("Even Numbers are \n");
	for(int i=1;i<=L;i++)
	{
		if(i%2==0)
		{
			System.out.println(i);
		}
	}
}
}
