import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import java.awt.Color;
public class Calculator{
    public Calculator(){
        final JFrame jf=new JFrame("Calculator");
        jf.setLayout(null);       //we are not using layout settings
        jf.setSize(340,520);      //setting size of the calculator window
        jf.setLocation(390,100);  //setting location of the calculator window when it opens 
        jf.setResizable(false); //to make window non-maximisable
        final JLabel displayLabel=new JLabel("hello");    //creating object for diplay screen
        displayLabel.setBounds(30,50,280,70); //setting size of the screen
        jf.add(displayLabel);      //added diplay screen to the object jf using add function
        displayLabel.setBackground(Color.white);  //setting color for display screen
        displayLabel.setOpaque(true);  
        displayLabel.setHorizontalAlignment(SwingConstants.RIGHT);//to set text on right side of the display screen
        displayLabel.setForeground(Color.BLUE);         //setting color for the text in display
//adding each number buttons------------------------------------------------------------------------------
        final JButton sevenButton= new JButton("7");
        sevenButton.setBounds(30,170,80,40);
        jf.add(sevenButton);

        final JButton eightButton= new JButton("8");
        eightButton.setBounds(130,170,80,40);
        jf.add(eightButton);

        final JButton nineButton= new JButton("9");
        nineButton.setBounds(230,170,80,40);
        jf.add(nineButton);

        final JButton fourButton= new JButton("4");
        fourButton.setBounds(30,220,80,40);
        jf.add(fourButton);

        final JButton fiveButton= new JButton("5");
        fiveButton.setBounds(130,220,80,40);
        jf.add(fiveButton);

        final JButton sixButton= new JButton("6");
        sixButton.setBounds(230,220,80,40);
        jf.add(sixButton);

        final JButton oneButton= new JButton("1");
        oneButton.setBounds(30,270,80,40);
        jf.add(oneButton);

        final JButton twoButton= new JButton("2");
        twoButton.setBounds(130,270,80,40);
        jf.add(twoButton);

        final JButton threeButton= new JButton("3");
        threeButton.setBounds(230,270,80,40);
        jf.add(threeButton);

        final JButton dotButton= new JButton(".");
        dotButton.setBounds(30,320,80,40);
        jf.add(dotButton);

        final JButton zeroButton= new JButton("0");
        zeroButton.setBounds(130,320,80,40);
        jf.add(zeroButton);

        final JButton clearButton= new JButton("C");
        clearButton.setBounds(230,320,80,40);
        jf.add(clearButton); 

        final JButton plusButton= new JButton("+");
        plusButton.setBounds(30,370,80,40);
        jf.add(plusButton);

        final JButton minusButton= new JButton("-");
        minusButton.setBounds(130,370,80,40);
        jf.add(minusButton);

        final JButton equalButton= new JButton("=");
        equalButton.setBounds(230,370,80,90);
        jf.add(equalButton); 

        final JButton multiplicationButton= new JButton("*");
        multiplicationButton.setBounds(30,420,80,40);
        jf.add(multiplicationButton);

        final JButton divisionButton= new JButton("/");
        divisionButton.setBounds(130,420,80,40);
        jf.add(divisionButton);


        jf.setVisible(true);      //otherwise the window will not occur
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //setting default close operation for the window


    }

    public static void main(final String[] args) {
        new Calculator();
    }
}