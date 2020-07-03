import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;






public class Calculator implements ActionListener {
	boolean isOperatorClicked=false;
JFrame jf;
	JLabel DisplayLabel;
	JButton SevenButton;
	JButton EightButton;
	JButton NineButton;
	JButton FourButton;
	JButton FiveButton;
	JButton SixButton;
	JButton OneButton;
	JButton TwoButton;
	JButton ThreeButton;
	JButton DotButton;
	JButton ZeroButton;
	JButton EqualButton;
	JButton DivButton;
	JButton MultiButton;
	JButton SubButton;
	JButton PlusButton;
	JButton ClearButton;
public Calculator(){
    jf=new JFrame("Calculator");
	jf.setLayout(null);
	jf.setSize(600, 600);
	jf.setLocation(300, 150);
	DisplayLabel=new JLabel(" ");
	DisplayLabel.setBounds(30, 50, 540, 40);
	DisplayLabel.setBackground(Color.gray);	
	DisplayLabel.setOpaque(true);
	jf.add(DisplayLabel);
	DisplayLabel.setHorizontalAlignment(SwingConstants.RIGHT);
	DisplayLabel.setForeground(Color.white);
	jf.setVisible(true);
	jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	SevenButton=new JButton("7");
	SevenButton.setBounds(30, 130, 80, 80);
	SevenButton.addActionListener(this);
	jf.add(SevenButton);
    EightButton=new JButton("8");
	EightButton.setBounds(130, 130, 80, 80);
	EightButton.addActionListener(this);
	jf.add(EightButton);
	NineButton=new JButton("9"); 
	NineButton.setBounds(230, 130, 80, 80);
	NineButton.addActionListener(this);
	jf.add(NineButton);
    FourButton=new JButton("4");
	FourButton.setBounds(30, 230, 80, 80);
	FourButton.addActionListener(this);
	jf.add(FourButton);
    FiveButton=new JButton("5");
	FiveButton.setBounds(130, 230, 80, 80);
	FiveButton.addActionListener(this);
	jf.add(FiveButton);
	SixButton=new JButton("6");
	SixButton.setBounds(230, 230, 80, 80);
	SixButton.addActionListener(this);
	jf.add(SixButton);
	OneButton=new JButton("1");
	OneButton.setBounds(30, 330, 80, 80);
	OneButton.addActionListener(this);
	jf.add(OneButton);
	TwoButton=new JButton("2");
	TwoButton.setBounds(130, 330, 80, 80);
	TwoButton.addActionListener(this);
	jf.add(TwoButton);
	ThreeButton=new JButton("3");
	ThreeButton.setBounds(230, 330, 80, 80);
	ThreeButton.addActionListener(this);
	jf.add(ThreeButton);
	DotButton=new JButton(".");
	DotButton.setBounds(30, 430, 80, 80);
	DotButton.addActionListener(this);
	jf.add(DotButton);
	ZeroButton=new JButton("0");
	ZeroButton.setBounds(130, 430, 80, 80);
	ZeroButton.addActionListener(this);
	jf.add(ZeroButton);
    EqualButton=new JButton("=");
	EqualButton.setBounds(230, 430, 80, 80);
	EqualButton.addActionListener(this);
	EqualButton.setFont(new Font("Arial", Font.PLAIN, 40));
	jf.add(EqualButton);
	DivButton=new JButton("/");
	DivButton.setBounds(330, 130, 80, 80);
	DivButton.addActionListener(this);
	jf.add(DivButton);
	MultiButton=new JButton("*");
	MultiButton.setBounds(330, 230, 80, 80);
	MultiButton.addActionListener(this);
	jf.add(MultiButton);
	SubButton=new JButton("-");
	SubButton.setBounds(330, 330, 80, 80);
	SubButton.addActionListener(this);
	jf.add(SubButton);
	PlusButton=new JButton("+");
	PlusButton.setBounds(330, 430, 80, 80);
	PlusButton.addActionListener(this);
	jf.add(PlusButton);
	ClearButton=new JButton("Clear");
	ClearButton.setBounds(430, 430, 80, 80);
	ClearButton.addActionListener(this);
	jf.add(ClearButton);
}
public static void main(String[] args) {
	new Calculator();
}
@Override
public void actionPerformed(ActionEvent e) {

if(e.getSource()==SevenButton) {
	if(isOperatorClicked) {
		
	}
	DisplayLabel.setText(DisplayLabel.getText()+"7");
}else if(e.getSource()==EightButton){
	DisplayLabel.setText(DisplayLabel.getText()+"8");
}else if(e.getSource()==NineButton){
	DisplayLabel.setText(DisplayLabel.getText()+"9");
}else if(e.getSource()==FourButton){
	DisplayLabel.setText(DisplayLabel.getText()+"4");
}else if(e.getSource()==FiveButton){
	DisplayLabel.setText(DisplayLabel.getText()+"5");
}else if(e.getSource()==SixButton){
	DisplayLabel.setText(DisplayLabel.getText()+"6");
}else if(e.getSource()==OneButton){
	DisplayLabel.setText(DisplayLabel.getText()+"1");
}else if(e.getSource()==TwoButton){
	DisplayLabel.setText(DisplayLabel.getText()+"2");
}else if(e.getSource()==ThreeButton){
	DisplayLabel.setText(DisplayLabel.getText()+"3");
}else if(e.getSource()==DotButton){
	DisplayLabel.setText(DisplayLabel.getText()+".");
}else if(e.getSource()==ZeroButton){
	DisplayLabel.setText(DisplayLabel.getText()+"0");
}else if(e.getSource()==EqualButton) {

}else if(e.getSource()==DivButton) {
	
}else if(e.getSource()==MultiButton) {
	
}else if(e.getSource()==SubButton) {
	
}else if(e.getSource()==PlusButton) {
	isOperatorClicked=true;
}else if(e.getSource()==ClearButton) {
	DisplayLabel.setText("");
}
}
}