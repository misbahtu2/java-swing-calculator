import javax.swing.*;
import java.awt.*;
import javax.swing.border.LineBorder;

public class Calculator {

    JFrame jf;
    JLabel DisplayLabel;

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
    }

    public static void main(String[] args) {
        new Calculator();
    }
}
