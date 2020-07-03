import java.util.Scanner;
public class hello {
hello(){
	Scanner S=new Scanner(System.in);
	System.out.println("Enter Size of Arrays");
	int L=S.nextInt();
	System.out.println("Enter values of array 1");
	int a[]=new int[L];
	int i;
	for(i=0;i<L;i++)
	{
		a[i]=S.nextInt();
	}
	System.out.println("Enter values of Array 2");
	int b[]=new int[L];
	for(i=0;i<L;i++)
	{
		b[i]=S.nextInt();
	}
	int temp;
	for(i=0;i<L;i++)
	{
		temp=a[i];
		a[i]=b[i];
		b[i]=temp;
	}
	System.out.println("Swapped values of Array 1");
	for(i=0;i<L;i++)
	{
		System.out.println(a[i]);
	}
	System.out.println("Swapped Values of Array 2");
	for(i=0;i<L;i++)
	{
		System.out.println(b[i]);
	}
}
}
