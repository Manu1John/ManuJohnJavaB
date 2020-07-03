import java.util.Scanner;

public class SearchArray {
public static void main(String[] args) {
	Scanner S=new Scanner(System.in);
	System.out.println("Enter a limit");
	int L=S.nextInt();
	System.out.println("Enter values");
int i=0;
	int v[]=new int[L];
	for(i=0;i<L;i++)
	{
v[i]=S.nextInt();
	}
	System.out.println("Enter Search Key");
	int SA=S.nextInt();
	int flag=0;
	for(i=0;i<L;i++)
	{
		if(SA==v[i])
		{
			flag=1;
			break;
		}
	}
	if(flag==1)
	{
		System.out.println("value found at Position "+(i+1));
	}
	else
	{
		System.out.println("Value not Found");
	}
}


}
