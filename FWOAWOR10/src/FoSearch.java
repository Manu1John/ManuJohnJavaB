import java.util.Scanner;

public class FoSearch {
public static void main(String[] args) {
	Array();
}
static void Array()
{
	Scanner S=new Scanner(System.in);
	System.out.println("Enter a Limit");
	int L=S.nextInt();
	System.out.println("Enter Values");
	int i=0;
	int v[]=new int [L];
	for(i=0;i<L;i++)
	{
		v[i]=S.nextInt();
	}
	System.out.println("Entered Values are");
	for(i=0;i<L;i++)
	{
		System.out.println(v[i]);
	}
System.out.println("Enter a Search Key");
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
	System.out.println("Value founfd at position "+(i+1));
}
else
{
	System.out.println("Value not Found");
}
}
}
