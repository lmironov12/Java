package com.company;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class MainApp2 extends JFrame {
    private JButton button = new JButton("Click me!");
    private  JTextField input = new JTextField("Write sth..");
    private JLabel label = new JLabel("Input");
    private JRadioButton radio1 = new JRadioButton("1");
    private JRadioButton radio2= new JRadioButton("2");
    private JCheckBox check = new JCheckBox ("Check", false);

    public MainApp2(){
        super ("GUI WINDOW");
        int x, y, w, h;
        w = 400;
        h = 240;
        x = (1920/2) - w/2;
        y = (1080/2) - h/2;
        this.setBounds (x,y,w,h);
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container container = this.getContentPane();
        container.setLayout(new GridLayout(3,2,2,2));
        container.add(label);
        container.add(input);
        ButtonGroup group = new ButtonGroup();

        group.add(radio1);
        group.add(radio2);

        container.add(radio1);
        container.add(radio2);

        radio1.setSelected(true);

        container.add(check);
        button.addActionListener(new ButtonListener());
        container.add(button);
    }
    class ButtonListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e){
            String message = "";
            message += "Button clicked'\n";
            message += "Text from input is " + input.getText() + "\n";
            message += (radio1.isSelected()? "Radio1 " + "selected \n":"Radio2 "+ "selected  \n");
            message += (check.isSelected()? "Checked \n": "Unchecked \n");
            JOptionPane.showMessageDialog(null, message,"Output", JOptionPane.PLAIN_MESSAGE);
        }
    }
}

