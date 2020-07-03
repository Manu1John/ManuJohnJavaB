
public class Hello {

void CalculateGrade(float q,float w,float e,float r,float t) {
	float Total;
	Total=q+w+e+r+t;
	System.out.println("Total Mark is"+Total);
float P;
P=(q+w+e+r+t)/5;
System.out.println("Percentage"+P);
if(P>=90)
{
	System.out.println("Grade A");
}
else if(P>=80)
{
	System.out.println("Grade B");
}
else if(P>=70)
{
	System.out.println("Grade C");
}
else if(P>=60)
{
	System.out.println("Grade D");
}
else if(P>=50)
{
	System.out.println("Grade E");
	
}
else
{
	System.out.println("Grade F =Fuck\n");
	System.out.println("You are Failed");
}
}
}
