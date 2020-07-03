
public class TextScanner {
Hello b;
public TextScanner(Hello b) {
	this.b=b;

}
void Scan() {
	String text="Scaned text";
			b.onText(text);
}
}
