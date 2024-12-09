package Local_Bank;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Login extends JFrame implements ActionListener{
    // Globally declared
    JButton sign_in, sign_up, clear; 
    JTextField card_field;
    JPasswordField pin_field;
    Login(){
        setLayout(null);
//  Image Loaded Successfully
        ImageIcon i2 = new ImageIcon("/home/anurag/Downloads/bank-removebg.png");
//  Ajusting the Size & Location
        Image i1 = i2.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i1);
        JLabel l1 = new JLabel(i3);
        l1.setBounds(70,20,100,100);
        add(l1);
        
        getContentPane().setBackground(Color.white);
        
/* By default my background is white so I don't need to change.
    //  Try to change the background color
        getContentPane().setBackground(Color.red);
*/
        JLabel l2 = new JLabel("Welcome to Local Bank");
        l2.setFont(new Font("Osward", Font.BOLD, 32)); // To change fonts
        l2.setBounds(155, 7, 450, 120);
        add(l2);
        
        JLabel card = new JLabel("Card No: ");
        card.setFont(new Font("Osward", Font.BOLD, 25));
        card.setBounds(150, 150, 200, 60);
        add(card);
        
        card_field = new JTextField();
        card_field.setFont(new Font("Arial", Font.PLAIN, 20));
        card_field.setBounds(310, 160, 200, 40);
        add(card_field);
        
        JLabel pin = new JLabel("   PIN : ");
        pin.setFont(new Font("OSward", Font.BOLD, 25));
        pin.setBounds(150, 230, 100, 60);
        add(pin);
        
//        JTextField pin_field = new JTextField();
//  We will use the password field for security reasons. Now the password you will enter will be secured
        pin_field = new JPasswordField();
        pin_field.setFont(new Font("Arial", Font.BOLD, 20));
        pin_field.setBounds(310, 240, 200, 40);
        add(pin_field);
        
        sign_in = new JButton("SIGN IN");
        sign_in.setBounds(250, 330, 110,45);
        sign_in.setBackground(Color.black); // Color change in background
        sign_in.setForeground(Color.white); // Color change in foreground
        sign_in.addActionListener(this);  // to get source value 
        add(sign_in);
        
        clear = new JButton("CLEAR");
        clear.setBounds(400, 330, 110, 45);
        clear.setBackground(Color.black); // Color change in background
        clear.setForeground(Color.white); // Color change in foreground
        clear.addActionListener(this);
        add(clear);
        
        sign_up = new JButton("SIGN UP");
        sign_up.setBounds(250, 400, 260, 45);
        sign_up.setBackground(Color.black); // Color change in background
        sign_up.setForeground(Color.white); // Color change in foreground
        sign_up.addActionListener(this);
        add(sign_up);

/* We have the option to execute an action by defining a method outside the constructor and 
 * converting locally defined variables into global variables. 
 * Initially, I am not implementing this method and am adhering to the approach I learned earlier.*/

    //  Actions of Buttons  [OLD WAY]
//        clear.addActionListener(new ActionListener(){
//            @Override
//            public void actionPerformed(ActionEvent e){
//            card_field.setText("");
//            pin_field.setText("");
//            }
//        });
//        
//        sign_in.addActionListener(new ActionListener(){
//            @Override
//            public void actionPerformed(ActionEvent e){
//                
//            }
//        });
//        
//        sign_out.addActionListener(new ActionListener(){
//            @Override
//            public void actionPerformed(ActionEvent e){
//                
//            }
//        });
        
//  Here we can't use setLayout method. We have apply separately
        setSize(700,700);
        setLocation(450,120);
        setVisible(true);
        setTitle("AUTOMATED TELLER MACHINE");
    }
    
//    [Updated version we will make a method]
    public void actionPerformed(ActionEvent ev){
            if(ev.getSource() == clear){
                card_field.setText("");
                pin_field.setText("");
            }
            else if(ev.getSource() == sign_in){
                
            }else if(ev.getSource() == sign_up){
                setVisible(false); // To close this current window
//  Create an obj of Sign_Up_1
                new Sign_Up_1().setVisible(true);
            }
        }
    
    public static void main(String args[]){
        new Login(); // Constructor
    }
}