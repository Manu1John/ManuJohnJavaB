
public class B extends A {
int a;
/*
B(){
	System.out.println("B Constractor");
}*/
B(int a){
	super(10);
	System.out.println("B Constractor Argument");
}
void Display() {
	System.out.println("Its B");
	a=20;
	super.a=30;
	int C=a+super.a;
	System.out.println(C);
}
void BaseDisplay() {
	super.Display();
}
public static void main(String[] args) {
	B b=new B(10);
	/*b.Display();
	b.BaseDisplay();
	*/
}
}
