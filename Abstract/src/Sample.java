
public class Sample extends Hello {

	@Override
	void onText(String text) {
		System.out.println(text);
		// TODO Auto-generated method stub
		
	}

	public static void main(String[] args) {
		Sample S=new Sample();
	}
	Sample(){
		TextScanner ts= new TextScanner(this);
		ts.Scan();
	}









}

