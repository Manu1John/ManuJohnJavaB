package array;

import java.util.Scanner;

public class SampleArray {
public static void main(String[] args) {
	Scanner S=new Scanner(System.in);
	System.out.println("Enter a Limit");
	int L=S.nextInt();
	System.out.println("Enter values");
int i=0;
	int v[] =new int [L];
for( i=0;i<L;i++)	
{
v[i]=S.nextInt();
}
System.out.println("Values in Array");
for(i=0;i<L;i++)
{
	System.out.println(v[i]+"\t");
}
}
}
