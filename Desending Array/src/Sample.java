
import java.util.Scanner;
public class Sample extends Array{

	void CalculateArray() {
		Scanner S=new Scanner(System.in);
	

	System.out.println("Enter Array limit");
	int L=S.nextInt();
	int i;
	int v[]=new int[L];
System.out.println("Enter Values");


for(i=0;i<L;i++)
{
v[i]=S.nextInt();
}

int temp;
for( i=0;i<L-1;i++)
{
	for(int j=i+1;j<L;j++)
	{
		if(v[i]<v[j])
		{
			temp=v[i];
			v[i]=v[j];
			v[j]=temp;
		}
	}
}

System.out.println("Sorted arrays are \n");
Scanner S3=new Scanner(System.in);


for(i=0;i<L;i++)
{

	System.out.println(v[i]);
}


}



}


