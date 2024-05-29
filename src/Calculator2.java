import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calculator2 implements ActionListener{

    double num1=0,num2=0,result=0;
    int calculation;
    JFrame frame=new JFrame("Calculator");
    JLabel label=new JLabel();
    JTextField textField=new JTextField();
    JRadioButton onRadioButton=new JRadioButton("ON");
    JRadioButton offRadioButton=new JRadioButton("OFF");
    JButton buttonZero=new JButton("0");
    JButton buttonOne=new JButton("1");
    JButton buttonTwo=new JButton("2");
    JButton buttonThree=new JButton("3");
    JButton buttonFour=new JButton("4");
    JButton buttonFive=new JButton("5");
    JButton buttonSix=new JButton("6");
    JButton buttonSeven=new JButton("7");
    JButton buttonEight=new JButton("8");
    JButton buttonNine=new JButton("9");
    JButton buttonDec=new JButton(".");
    JButton buttonPlus=new JButton("+");
    JButton buttonMinus=new JButton("-");
    JButton buttonMul=new JButton("x");
    JButton buttonDiv=new JButton("/");
    JButton buttonPer=new JButton("%");
    JButton buttonClr=new JButton("C");
    JButton buttonDel=new JButton("DEL");
    JButton buttonSqr=new JButton("X\u00B2");
    JButton buttonRec=new JButton("1/X");
    JButton buttonEqu=new JButton("=");
    JButton buttonRoot=new JButton("\u221A");
    JButton buttonPie=new JButton("\u03c0");
    JButton buttonNeg=new JButton("(-)");





    Calculator2(){
      prepareGui();
      addComponents();
      addActionEvent();
    }
    public void prepareGui(){
        frame.setSize(360,600);
        frame.getContentPane().setLayout(null);
        frame.getContentPane().setBackground(Color.BLACK);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void addComponents(){
        JLabel titleLabel = new JLabel("JAVA-swing-Calculator");
        titleLabel.setBounds(10, 0, 200, 20);
        titleLabel.setForeground(Color.white);
        frame.add(titleLabel);

        label.setBounds(250,0,50,50);
        label.setForeground(Color.white);
        frame.add(label);

        textField.setBounds(10,21,325,67);
        textField.setFont(new Font("Arial",Font.BOLD,20));
        textField.setHorizontalAlignment(SwingConstants.RIGHT);
        frame.add(textField);

        onRadioButton.setBounds(10,105,60,40);
        onRadioButton.setSelected(true);
        onRadioButton.setFont(new Font("Arial",Font.BOLD,14));
        onRadioButton.setBackground(Color.black);
        onRadioButton.setForeground(Color.white);
        onRadioButton.setFocusable(false);
        frame.add(onRadioButton);

        offRadioButton.setBounds(10,130,60,40);
        offRadioButton.setSelected(false);
        offRadioButton.setFont(new Font("Arial",Font.BOLD,14));
        offRadioButton.setBackground(Color.black);
        offRadioButton.setForeground(Color.white);
        offRadioButton.setFocusable(false);
        frame.add(offRadioButton);

        ButtonGroup buttonGroup=new ButtonGroup();
        buttonGroup.add(onRadioButton);
        buttonGroup.add(offRadioButton);

        buttonPie.setBounds(10,180,70,50);
        buttonPie.setFont(new Font("Arial",Font.BOLD,20));
        frame.add(buttonPie);

        buttonPer.setBounds(95,180,70,50);
        buttonPer.setFont(new Font("Arial",Font.BOLD,35));
        frame.add(buttonPer);

        buttonDec.setBounds(180,180,70,50);
        buttonDec.setFont(new Font("Arial",Font.BOLD,35));
        frame.add(buttonDec);

        buttonDiv.setBounds(265,180,70,50);
        buttonDiv.setFont(new Font("Arial",Font.BOLD,35));
        frame.add(buttonDiv);

        buttonRoot.setBounds(10,245,70,50);
        buttonRoot.setFont(new Font("Arial",Font.BOLD,35));
        frame.add(buttonRoot);

        buttonRec.setBounds(95,245,70,50);
        buttonRec.setFont(new Font("Arial",Font.BOLD,20));
        frame.add(buttonRec);

        buttonSqr.setBounds(180,245,70,50);
        buttonSqr.setFont(new Font("Arial",Font.BOLD,20));
        frame.add(buttonSqr);

        buttonMinus.setBounds(265,245,70,50);
        buttonMinus.setFont(new Font("Arial",Font.BOLD,35));
        frame.add(buttonMinus);

        buttonSeven.setBounds(10,310,70,50);
        buttonSeven.setFont(new Font("Arial",Font.BOLD,35));
        frame.add(buttonSeven);

        buttonEight.setBounds(95,310,70,50);
        buttonEight.setFont(new Font("Arial",Font.BOLD,35));
        frame.add(buttonEight);

        buttonNine.setBounds(180,310,70,50);
        buttonNine.setFont(new Font("Arial",Font.BOLD,35));
        frame.add(buttonNine);

        buttonMul.setBounds(265,310,70,50);
        buttonMul.setFont(new Font("Arial",Font.BOLD,35));
        frame.add(buttonMul);

        buttonFour.setBounds(10,375,70,50);
        buttonFour.setFont(new Font("Arial",Font.BOLD,35));
        frame.add(buttonFour);

        buttonFive.setBounds(95,375,70,50);
        buttonFive.setFont(new Font("Arial",Font.BOLD,35));
        frame.add(buttonFive);

        buttonSix.setBounds(180,375,70,50);
        buttonSix.setFont(new Font("Arial",Font.BOLD,35));
        frame.add(buttonSix);

        buttonPlus.setBounds(265,375,70,50);
        buttonPlus.setFont(new Font("Arial",Font.BOLD,35));
        frame.add(buttonPlus);

        buttonOne.setBounds(10,440,70,50);
        buttonOne.setFont(new Font("Arial",Font.BOLD,35));
        frame.add(buttonOne);

        buttonTwo.setBounds(95,440,70,50);
        buttonTwo.setFont(new Font("Arial",Font.BOLD,35));
        frame.add(buttonTwo);

        buttonThree.setBounds(180,440,70,50);
        buttonThree.setFont(new Font("Arial",Font.BOLD,35));
        frame.add(buttonThree);

        buttonEqu.setBounds(265,440,70,115);
        buttonEqu.setFont(new Font("Arial",Font.BOLD,35));
        frame.add(buttonEqu);

        buttonZero.setBounds(10,505,240,50);
        buttonZero.setFont(new Font("Arial",Font.BOLD,35));
        frame.add(buttonZero);

        buttonClr.setBounds(95,115,70,50);
        buttonClr.setFont(new Font("Arial",Font.BOLD,35));
        buttonClr.setBackground(new Color(135, 206, 250));
        frame.add(buttonClr);

        buttonDel.setBounds(180,115,70,50);
        buttonDel.setFont(new Font("Arial",Font.BOLD,15));
        buttonDel.setBackground(new Color(135, 206, 250));
        frame.add(buttonDel);

        buttonNeg.setBounds(265,115,70,50);
        buttonNeg.setFont(new Font("Arial",Font.BOLD,35));
        buttonNeg.setBackground(new Color(135, 206, 250));
        frame.add(buttonNeg);
    }

    public void addActionEvent(){
        onRadioButton.addActionListener(this);
        offRadioButton.addActionListener(this);
        buttonZero.addActionListener(this);
        buttonOne.addActionListener(this);
        buttonTwo.addActionListener(this);
        buttonThree.addActionListener(this);
        buttonFour.addActionListener(this);
        buttonFive.addActionListener(this);
        buttonSix.addActionListener(this);
        buttonSeven.addActionListener(this);
        buttonEight.addActionListener(this);
        buttonNine.addActionListener(this);
        buttonPlus.addActionListener(this);
        buttonMinus.addActionListener(this);
        buttonMul.addActionListener(this);
        buttonDiv.addActionListener(this);
        buttonPer.addActionListener(this);
        buttonPie.addActionListener(this);
        buttonSqr.addActionListener(this);
        buttonRec.addActionListener(this);
        buttonRoot.addActionListener(this);
        buttonNeg.addActionListener(this);
        buttonDec.addActionListener(this);
        buttonDel.addActionListener(this);
        buttonClr.addActionListener(this);
        buttonEqu.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e){

        Object source=e.getSource();
        if(source==onRadioButton){
            enable();
        }
        else if(source==offRadioButton){
            disable();
        }
        else if(source==buttonClr){
            label.setText("");
            textField.setText("");
        }
        else if(source==buttonDel){
            int len=textField.getText().length();
            int nmbr=len-1;
            if(len>0){
                StringBuilder back=new StringBuilder(textField.getText());
                back.deleteCharAt(nmbr);
                textField.setText(back.toString());
            }
            if(textField.getText().endsWith(""));
            label.setText("");
        }
        else if(source==buttonZero){
            if(textField.getText().equals("0")){
                return;
            }else{
                textField.setText(textField.getText()+"0");
            }
        }
        else if(source==buttonOne)
        {
            textField.setText(textField.getText()+"1");
        }
        else if(source==buttonTwo)
        {
            textField.setText(textField.getText()+"2");
        }
        else if(source==buttonThree)
        {
            textField.setText(textField.getText()+"3");
        }
        else if(source==buttonFour)
        {
            textField.setText(textField.getText()+"4");
        }
        else if(source==buttonFive)
        {
            textField.setText(textField.getText()+"5");
        }
        else if(source==buttonSix)
        {
            textField.setText(textField.getText()+"6");
        }
        else if(source==buttonSeven)
        {
            textField.setText(textField.getText()+"7");
        }
        else if(source==buttonEight)
        {
            textField.setText(textField.getText()+"8");
        }
        else if(source==buttonNine)
        {
            textField.setText(textField.getText()+"9");
        }
        else if(source==buttonDec)
        {
            if(textField.getText().contains(".")){
                return;
            }else{
                textField.setText(textField.getText()+".");
            }
        }
        else if(source==buttonPlus)
        {
            String str=textField.getText();
            num1=Double.parseDouble(textField.getText());
            calculation=1;
            textField.setText("");
            label.setText(str+"+");
        }
        else if(source==buttonMinus)
        {
            String str=textField.getText();
            num1=Double.parseDouble(textField.getText());
            calculation=2;
            textField.setText("");
            label.setText(str+"-");
        }
        else if(source==buttonMul)
        {
            String str=textField.getText();
            num1=Double.parseDouble(textField.getText());
            calculation=3;
            textField.setText("");
            label.setText(str+"x");
        } else if(source==buttonDiv)
        {
            String str=textField.getText();
            num1=Double.parseDouble(textField.getText());
            calculation=4;
            textField.setText("");
            label.setText(str+"/");
        }
        else if(source==buttonSqr)
        {
            num1=Double.parseDouble(textField.getText());
            double square=Math.pow(num1,2);
            String str=Double.toString(square);
            if(str.endsWith(".0")){
                textField.setText(str.replace(".0",""));
            }else{
                textField.setText(str);
            }

        }
        else if(source==buttonRoot)
        {
            num1=Double.parseDouble(textField.getText());
            double base=Math.sqrt(num1);
            String str=Double.toString(base);
            textField.setText(str);
        }
        else if(source==buttonRec)
        {
            num1=Double.parseDouble(textField.getText());
            double rec=1/num1;
            String str=Double.toString(rec);
            if(str.endsWith(".0")){
                textField.setText(str.replace(".0",""));
        }
        else{
                textField.setText(str);
        }
        }
        else if(source==buttonPer)
        {
            String str=textField.getText();
            num1=Double.parseDouble(textField.getText());
            calculation=5;
            textField.setText("");
            label.setText(str+"%");
        }
        else if(source==buttonNeg)
        {
            double num = Double.parseDouble(textField.getText());
            num = -num;
            textField.setText(Double.toString(num));
        }
        else if(source==buttonPie)
        {
            textField.setText(Double.toString(Math.PI));
        }
        else if(source==buttonEqu){
            num2=Double.parseDouble(textField.getText());
            switch(calculation){
                case 1:
                    result=num1+num2;
                    break;
                case 2:
                    result=num1-num2;
                    break;
                case 3:
                    result=num1*num2;
                    break;
                case 4:
                    result=num1/num2;
                    break;
                case 5:
                    result=(num1*num2)/100;
                    break;
            }if(Double.toString(result).endsWith(".0")){
                textField.setText(Double.toString(result).replace(".0",""));
            }else{
                textField.setText(Double.toString(result));
            }
            label.setText("");
            num1=result;
        }



    }



    public void enable(){
        onRadioButton.setEnabled(false);
        offRadioButton.setEnabled(true);
        textField.setEnabled(true);
        label.setEnabled(true);
        buttonClr.setEnabled(true);
        buttonDel.setEnabled(true);
        buttonNeg.setEnabled(true);
        buttonPlus.setEnabled(true);
        buttonMinus.setEnabled(true);
        buttonMul.setEnabled(true);
        buttonDiv.setEnabled(true);
        buttonZero.setEnabled(true);
        buttonOne.setEnabled(true);
        buttonTwo.setEnabled(true);
        buttonThree.setEnabled(true);
        buttonFour.setEnabled(true);
        buttonFive.setEnabled(true);
        buttonSix.setEnabled(true);
        buttonSeven.setEnabled(true);
        buttonEight.setEnabled(true);
        buttonNine.setEnabled(true);
        buttonRoot.setEnabled(true);
        buttonPer.setEnabled(true);
        buttonSqr.setEnabled(true);
        buttonPie.setEnabled(true);
        buttonDec.setEnabled(true);
        buttonEqu.setEnabled(true);
        buttonRec.setEnabled(true);
    }

    public void disable(){
        onRadioButton.setEnabled(true);
        offRadioButton.setEnabled(false);
        textField.setEnabled(false);
        label.setEnabled(false);
        buttonClr.setEnabled(false);
        buttonDel.setEnabled(false);
        buttonNeg.setEnabled(false);
        buttonPlus.setEnabled(false);
        buttonMinus.setEnabled(false);
        buttonMul.setEnabled(false);
        buttonDiv.setEnabled(false);
        buttonZero.setEnabled(false);
        buttonOne.setEnabled(false);
        buttonTwo.setEnabled(false);
        buttonThree.setEnabled(false);
        buttonFour.setEnabled(false);
        buttonFive.setEnabled(false);
        buttonSix.setEnabled(false);
        buttonSeven.setEnabled(false);
        buttonEight.setEnabled(false);
        buttonNine.setEnabled(false);
        buttonRoot.setEnabled(false);
        buttonPer.setEnabled(false);
        buttonSqr.setEnabled(false);
        buttonPie.setEnabled(false);
        buttonDec.setEnabled(false);
        buttonEqu.setEnabled(false);
        buttonRec.setEnabled(false);
    }

}
