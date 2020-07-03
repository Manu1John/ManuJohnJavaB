
public class Sample extends Hello {
	
	public static void main(String[] args) {
		Sample S=new Sample();
	}
	Sample(){
		TextScanner ts=new TextScanner(this);
		ts.Scan();
	}
void onText(String name) {
	System.out.println(name);
}

}
