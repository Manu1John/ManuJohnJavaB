
public class Hello {
public static void main(String[] args) {
	SampleThread st=new SampleThread();
	Thread t=new Thread(st);
	t.start();
}
}
