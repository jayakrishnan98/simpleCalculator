import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import java.awt.Color;
public class Calculator{
    public Calculator(){
        JFrame jf=new JFrame("Calculator");
        jf.setLayout(null);       //we are not using layout settings
        jf.setSize(600,600);      //setting size of the calculator window
        jf.setLocation(390,100);  //setting location of the calculator window when it opens 
        jf.setVisible(true);      //otherwise the window will not occur
        JLabel displayLabel=new JLabel("hello");    //creating object for diplay screen
        displayLabel.setBounds(30,50,540,70); //setting size of the screen
        jf.add(displayLabel);      //added diplay screen to the object jf using add function
        displayLabel.setBackground(Color.white);  //setting color for display screen
        displayLabel.setOpaque(true);  
        displayLabel.setHorizontalAlignment(SwingConstants.RIGHT);//to set text on right side of the display screen
        displayLabel.setForeground(Color.BLUE);         //setting color for the text in display
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //setting default close operation for the window
//adding each number buttons
        JButton sevenButton= new JButton("7");
        sevenButton.setBounds(30,170,80,40);
        jf.add(sevenButton);

        JButton eightButton= new JButton("8");
        eightButton.setBounds(130,170,80,40);
        jf.add(eightButton);

        JButton nineButton= new JButton("9");
        nineButton.setBounds(230,170,80,40);
        jf.add(nineButton);

        JButton fourButton= new JButton("4");
        fourButton.setBounds(30,220,80,40);
        jf.add(fourButton);

        JButton fiveButton= new JButton("5");
        fiveButton.setBounds(130,220,80,40);
        jf.add(fiveButton);

        JButton sixButton= new JButton("6");
        sixButton.setBounds(230,220,80,40);
        jf.add(sixButton);

        JButton oneButton= new JButton("1");
        oneButton.setBounds(30,270,80,40);
        jf.add(oneButton);

        JButton twoButton= new JButton("2");
        twoButton.setBounds(130,270,80,40);
        jf.add(twoButton);

        JButton threeButton= new JButton("3");
        threeButton.setBounds(230,270,80,40);
        jf.add(threeButton);

        JButton dotButton= new JButton(".");
        dotButton.setBounds(30,320,80,40);
        jf.add(dotButton);

        JButton zeroButton= new JButton("0");
        zeroButton.setBounds(130,320,80,40);
        jf.add(zeroButton);

        JButton equalButton= new JButton("=");
        equalButton.setBounds(230,320,80,40);
        jf.add(equalButton);

        JButton plusButton= new JButton("+");
        plusButton.setBounds(30,370,80,40);
        jf.add(plusButton);

        JButton minusButton= new JButton("-");
        minusButton.setBounds(130,370,80,40);
        jf.add(minusButton);

        JButton divisionButton= new JButton("/");
        divisionButton.setBounds(230,370,80,40);
        jf.add(divisionButton);

        JButton multiplicationButton= new JButton("*");
        multiplicationButton.setBounds(30,420,80,40);
        jf.add(multiplicationButton);

        JButton clearButton= new JButton("C");
        clearButton.setBounds(130,420,80,40);
        jf.add(clearButton);       


    }

    public static void main(String[] args) {
        new Calculator();
    }
}