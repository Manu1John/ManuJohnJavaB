import java.util.Scanner;

public class Nopat {
public static void main(String[] args) {
Scanner s=new Scanner(System.in);
System.out.println("Enter a Limit");
int L=s.nextInt();
for(int i=1;i<=L;++i)
{
	for(int j=0;j<i;++j)
		
	{
		System.out.println("\t"+j);

	}
	System.out.println("\n");
}
}

}
