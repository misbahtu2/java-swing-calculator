import javax.swing.*;
import java.awt.*;
import javax.swing.border.LineBorder;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator implements ActionListener {

	
	boolean isOperatorClicked = false;
	String Oldvalue;
	String operation;



	JFrame jf;
	JLabel DisplayLabel;

	JButton oneButton, twoButton, threeButton, fourButton, fiveButton;
	JButton sixButton, sevenButton, eightButton, nineButton, zeroButton;
	JButton plusButton, minusButton, mulButton, divButton;
	JButton equalButton, dotButton, clearButton;


	public Calculator() {
		jf = new JFrame("Calculator");
		jf.setLayout(null);
		jf.setSize(550, 600);
		jf.setLocation(450, 100);

		DisplayLabel = new JLabel("");
		DisplayLabel.setBounds(30, 50, 480, 50);
		DisplayLabel.setFont(new Font("Serif", Font.PLAIN, 40));
		DisplayLabel.setBorder(new LineBorder(Color.BLACK, 2));
		DisplayLabel.setHorizontalAlignment(SwingConstants.RIGHT);

		jf.add(DisplayLabel);
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		sevenButton=new JButton("7");
		sevenButton.setBounds(30,130,80,80);
		sevenButton.setFont(new Font("Arial", Font.PLAIN, 40));
		sevenButton.addActionListener(this);
		jf.add(sevenButton);
		
		 eightButton=new JButton("8");
		eightButton.setBounds(130,130,80,80);
		eightButton.setFont(new Font("Arial", Font.PLAIN, 40));
		eightButton.addActionListener(this);
		jf.add(eightButton);
		
		 nineButton=new JButton("9");
		nineButton.setBounds(230,130,80,80);
		nineButton.setFont(new Font("Arial", Font.PLAIN, 40));
		nineButton.addActionListener(this);
		jf.add(nineButton);
		
		 fourButton=new JButton("4");
		fourButton.setBounds(30,230,80,80);
		fourButton.setFont(new Font("Arial", Font.PLAIN, 40));
		fourButton.addActionListener(this);
		jf.add(fourButton);
		
		 fiveButton=new JButton("5");
		fiveButton.setBounds(130,230,80,80);
		fiveButton.setFont(new Font("Arial", Font.PLAIN, 40));
		fiveButton.addActionListener(this);
		jf.add(fiveButton);
		
		sixButton=new JButton("6");
		sixButton.setBounds(230,230,80,80);
		sixButton.setFont(new Font("Arial", Font.PLAIN, 40));
		sixButton.addActionListener(this);
		jf.add(sixButton);
		
		 oneButton=new JButton("1");
		oneButton.setBounds(30,330,80,80);
		oneButton.setFont(new Font("Arial", Font.PLAIN, 40));
		oneButton.addActionListener(this);
		jf.add(oneButton);
		
          twoButton=new JButton("2");
		twoButton.setBounds(130,330,80,80);
		twoButton.setFont(new Font("Arial", Font.PLAIN, 40));
		twoButton.addActionListener(this);
		jf.add(twoButton);
		
		 threeButton=new JButton("3");
		 threeButton.setBounds(230,330,80,80);
		 threeButton.setFont(new Font("Arial", Font.PLAIN, 40));
		threeButton.addActionListener(this);
		jf.add(threeButton);
		
		
		 dotButton=new JButton(".");
		dotButton.setBounds(30,430,80,80);
		dotButton.setFont(new Font("Arial", Font.PLAIN, 40));
		dotButton.addActionListener(this);
		jf.add(dotButton);
		
		 zeroButton=new JButton("0");
		zeroButton.setBounds(130,430,80,80);
		zeroButton.setFont(new Font("Arial", Font.PLAIN, 40));
		zeroButton.addActionListener(this);
		jf.add(zeroButton);
		
		 equalButton=new JButton("=");
		equalButton.setBounds(230,430,180,80);
		equalButton.setFont(new Font("Arial", Font.PLAIN, 40));
		equalButton.addActionListener(this);
		jf.add(equalButton);
		
		 divButton=new JButton("÷");
		divButton.setBounds(330,130,80,80);
		divButton.setFont(new Font("Arial", Font.PLAIN, 40));
		divButton.addActionListener(this);
		jf.add(divButton);
		
		 mulButton=new JButton("×");
		mulButton.setBounds(330,230,80,80);
		mulButton.setFont(new Font("Arial", Font.PLAIN, 40));
		mulButton.addActionListener(this);
		jf.add(mulButton);
		
		 minusButton=new JButton("−");
		minusButton.setBounds(330,330,80,80);
		minusButton.setFont(new Font("Arial", Font.PLAIN, 40));
		minusButton.addActionListener(this);
		jf.add(minusButton);
		
		 plusButton=new JButton("+");
		plusButton.setBounds(430,130,80,280);
		plusButton.setFont(new Font("Arial", Font.PLAIN, 40));
		plusButton.addActionListener(this);
		jf.add(plusButton);
		
		 clearButton=new JButton("Clear");
		 clearButton.setBounds(430,430,80,80);
		 clearButton.setFont(new Font("Arial", Font.PLAIN, 19));
		 clearButton.addActionListener(this);
			jf.add(clearButton);


	}

	public static void main(String[] args) {
		new Calculator();
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()== sevenButton) {
			
			if(isOperatorClicked) {
				DisplayLabel.setText("7");
				isOperatorClicked=false;
				
				 
			}else {
				
			
			DisplayLabel.setText(DisplayLabel.getText()+"7");
			}
		}else if(e.getSource()== eightButton) {
			if(isOperatorClicked) {
				DisplayLabel.setText("8");
				isOperatorClicked=false;
				
				 
			}else {
				
			
			DisplayLabel.setText(DisplayLabel.getText()+"8");
			}
		}else if(e.getSource()== nineButton) {
			if(isOperatorClicked) {
				DisplayLabel.setText("9");
				isOperatorClicked=false;
				
				 
			}else {
				
			
			DisplayLabel.setText(DisplayLabel.getText()+"9");
			}
		}else if(e.getSource()== fourButton) {
			if(isOperatorClicked) {
				DisplayLabel.setText("4");
				isOperatorClicked=false;
				
				 
			}else {
				
			
			DisplayLabel.setText(DisplayLabel.getText()+"4");
			}
		}else if(e.getSource()== fiveButton) {
			if(isOperatorClicked) {
				DisplayLabel.setText("5");
				isOperatorClicked=false;
				
				 
			}else {
				
			
			DisplayLabel.setText(DisplayLabel.getText()+"5");
			}
		}else if(e.getSource()== sixButton) {
			if(isOperatorClicked) {
				DisplayLabel.setText("6");
				isOperatorClicked=false;
				
				 
			}else {
				
			
			DisplayLabel.setText(DisplayLabel.getText()+"6");
			}
		}else if(e.getSource()== oneButton) {
			if(isOperatorClicked) {
				DisplayLabel.setText("1");
				isOperatorClicked=false;
				
				 
			}else {
				
			
			DisplayLabel.setText(DisplayLabel.getText()+"1");
			}
		}else if(e.getSource()== twoButton) {
			if(isOperatorClicked) {
				DisplayLabel.setText("2");
				isOperatorClicked=false;
				
				 
			}else {
				
			
			DisplayLabel.setText(DisplayLabel.getText()+"2");
			}
		}else if(e.getSource()== threeButton) {
			if(isOperatorClicked) {
				DisplayLabel.setText("3");
				isOperatorClicked=false;
				
				 
			}else {
				
			
			DisplayLabel.setText(DisplayLabel.getText()+"3");
			}
		}else if(e.getSource()== divButton) {
			isOperatorClicked=true;
			Oldvalue=DisplayLabel.getText();
			operation = "÷";
		
		}else if(e.getSource()== mulButton) {
			isOperatorClicked=true;
			Oldvalue=DisplayLabel.getText();
			operation = "×";
			
		}else if(e.getSource()== minusButton) {
			isOperatorClicked=true;
			Oldvalue=DisplayLabel.getText();
			operation = "−";
			
		}else if(e.getSource()== plusButton) {
			isOperatorClicked=true;
			Oldvalue=DisplayLabel.getText();
			operation = "+";
			
		}else if(e.getSource()== zeroButton) {
			if(isOperatorClicked) {
				DisplayLabel.setText("0");
				isOperatorClicked=false;
				
				 
			}else {
				
			
			DisplayLabel.setText(DisplayLabel.getText()+"0");
			}
		}else if(e.getSource()== dotButton) {
			if(isOperatorClicked) {
				DisplayLabel.setText(".");
				isOperatorClicked=false;
				
				 
			}else {
				
			
			DisplayLabel.setText(DisplayLabel.getText()+".");
			}
		}else if(e.getSource()== equalButton) {
			
			String newValue=DisplayLabel.getText();		
			
			float oldValueF=Float.parseFloat(Oldvalue);
			float newValueF=Float.parseFloat(newValue);
			
			float result= 0 ;
			
			switch (operation) {
			case "+":
				result=oldValueF+newValueF;
				break;
			case"-":
				result=oldValueF-newValueF;
				break;
			case"×":
				result=oldValueF*newValueF;
				break;
			case"÷":
				result=oldValueF/newValueF;
				break;
			}
			
			DisplayLabel.setText(result+"");
			
			
		}else if(e.getSource()== clearButton) {
			DisplayLabel.setText("");
		}
		
		
	}
}
