import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Calculator implements ActionListener{
	boolean IsOperatorClickd=true;
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
	JButton PlusButton;
	JButton SubButton;
	JButton ClearButton;
	String oldvalue;

public static void main(String[] args) {
	Calculator s= new Calculator();
	
}
public Calculator() {
	JFrame jf=new JFrame("Calculator Application");
	jf.setSize(600,600);
	jf.setLocation(300, 100);
	jf.setLayout(null);
	DisplayLabel=new JLabel("");
	DisplayLabel.setBounds(30, 50, 540, 40);
	DisplayLabel.setOpaque(true);
	DisplayLabel.setBackground(Color.black);
	DisplayLabel.setForeground(Color.white);
	DisplayLabel.setHorizontalAlignment(SwingConstants.RIGHT);
	jf.add(DisplayLabel);
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
	jf.setVisible(true);
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
	jf.add(EqualButton);
	DivButton=new JButton("/");
	DivButton.setBounds(330, 130, 80, 80);
	DivButton.addActionListener(this);
	jf.add(DivButton);
	MultiButton=new JButton("*");
	MultiButton.setBounds(330, 230, 80, 80);
	MultiButton.addActionListener(this);
	jf.add(MultiButton);
	PlusButton=new JButton("+");
	PlusButton.setBounds(330, 330, 80, 80);
	PlusButton.addActionListener(this);
	jf.add(PlusButton);
	SubButton=new JButton("-");
	SubButton.setBounds(330, 430, 80, 80);
	SubButton.addActionListener(this);
	jf.add(SubButton);
	ClearButton=new JButton("C");
	ClearButton.setBounds(430, 430, 80,80);
	ClearButton.addActionListener(this);
	jf.add(ClearButton);
	
	
	


	jf.setVisible(true);
	jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
@Override
public void actionPerformed(ActionEvent e) {

	// TODO Auto-generated method stub
	if(e.getSource()==SevenButton) {
		if(IsOperatorClickd) {
			DisplayLabel.setText("7");
			IsOperatorClickd=false;	
		}else {
	DisplayLabel.setText(DisplayLabel.getText()+"7");
		} 
	}else if(e.getSource()==EightButton) {
		if(IsOperatorClickd) {
			DisplayLabel.setText("8");
			IsOperatorClickd=false;
		}else {
		DisplayLabel.setText(DisplayLabel.getText()+"8");
		}
	}else if(e.getSource()==NineButton) {
		if(IsOperatorClickd) {
			DisplayLabel.setText("9");
			IsOperatorClickd=false;
		}else {
		DisplayLabel.setText(DisplayLabel.getText()+"9");
		}
	}else if(e.getSource()==FourButton) {
		if(IsOperatorClickd) {
			DisplayLabel.setText("4");
			IsOperatorClickd=false;
		}else {
		DisplayLabel.setText(DisplayLabel.getText()+"4");
		}
	}else if(e.getSource()==FiveButton) {
		if(IsOperatorClickd) {
			DisplayLabel.setText("5");
			IsOperatorClickd=false;
		}else {
		DisplayLabel.setText(DisplayLabel.getText()+"5");
		}
	}else if(e.getSource()==SixButton) {
		if(IsOperatorClickd) {
			DisplayLabel.setText("6");
			IsOperatorClickd=false;
		}else {
		DisplayLabel.setText(DisplayLabel.getText()+"6");                                     
		}
	}else if(e.getSource()==OneButton) {
		if(IsOperatorClickd) {
			DisplayLabel.setText("1");
			IsOperatorClickd=false;
		}else {
		DisplayLabel.setText(DisplayLabel.getText()+"1");
		}
	}else if(e.getSource()==TwoButton) {
		if(IsOperatorClickd) {
			DisplayLabel.setText("2");
			IsOperatorClickd=false;
		}else {
		DisplayLabel.setText(DisplayLabel.getText()+"2");
		}
	}else if(e.getSource()==ThreeButton) {
		if(IsOperatorClickd){
			DisplayLabel.setText("3");
			IsOperatorClickd=false;
		}else {
		DisplayLabel.setText(DisplayLabel.getText()+"3");
		}
	}else if(e.getSource()==DotButton) {
		if(IsOperatorClickd) {
			DisplayLabel.setText(".");
			IsOperatorClickd=false;
		}else {
		DisplayLabel.setText(DisplayLabel.getText()+".");
		}
	}else if(e.getSource()==ZeroButton) {
		if(IsOperatorClickd) {
			DisplayLabel.setText("0");
			IsOperatorClickd=false;
		}else {
		DisplayLabel.setText(DisplayLabel.getText()+"0");
		}
		if(e.getSource()==EqualButton) {
		String newValue=DisplayLabel.getText();
		float oldvalueF=Float.parseFloat(oldvalue);
		float newValueF=Float.parseFloat(newValue);	
		float Result=oldvalueF+newValueF;
		DisplayLabel.setText(Result+"");
	

		String newValue1=DisplayLabel.getText();
		float oldvalueg=Float.parseFloat(oldvalue);
		float newValueg=Float.parseFloat(newValue1);
		float Result1=oldvalueg-newValueg;
		DisplayLabel.setText(Result1+"");

		String newValue2=DisplayLabel.getText();
		float oldvalueh=Float.parseFloat(oldvalue);
		float newValue2h=Float.parseFloat(newValue2);
		float Result2=oldvalueh/newValue2h;
		DisplayLabel.setText(Result2+"");
	
		String newValue3=DisplayLabel.getText();
		float oldvaluej=Float.parseFloat(oldvalue);
		float newValue3j=Float.parseFloat(newValue3);
		float Result3=oldvaluej*newValue3j;
		DisplayLabel.setText(Result3+"");

		
	}else if(e.getSource()==DivButton) {	
		IsOperatorClickd=true;
		oldvalue=DisplayLabel.getText();

}else if(e.getSource()==MultiButton) {
	IsOperatorClickd=true;
	oldvalue=DisplayLabel.getText();
	
}else if(e.getSource()==PlusButton) {
	IsOperatorClickd=true;
	oldvalue=DisplayLabel.getText();
	
}else if(e.getSource()==SubButton){
	IsOperatorClickd=true;
	oldvalue=DisplayLabel.getText();
	
}else if(e.getSource()==ClearButton) {
	DisplayLabel.setText("");

}
	
}
}
}
