import javax.swing.*;
import java.awt.*;
import javax.swing.border.LineBorder;

public class Calculator {

    JFrame jf;
    JLabel DisplayLabel;
    
    JButton oneButton, twoButton, threeButton, fourButton, fiveButton;
    JButton sixButton, sevenButton, eightButton, nineButton, zeroButton;


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
        
        sevenButton = new JButton("7");
        sevenButton.setBounds(30,130,80,80);
        sevenButton.setFont(new Font("Arial", Font.PLAIN, 40));
        jf.add(sevenButton);

        eightButton = new JButton("8");
        eightButton.setBounds(130,130,80,80);
        eightButton.setFont(new Font("Arial", Font.PLAIN, 40));
        jf.add(eightButton);

        nineButton = new JButton("9");
        nineButton.setBounds(230,130,80,80);
        nineButton.setFont(new Font("Arial", Font.PLAIN, 40));
        jf.add(nineButton);

        
    }

    
    
    public static void main(String[] args) {
        new Calculator();
    }
}
