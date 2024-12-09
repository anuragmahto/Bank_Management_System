package Local_Bank;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
// JCalender jar file 
import com.toedter.calendar.*;
import javax.swing.event.*;

public class Sign_Up_1 extends JFrame implements ActionListener{
//   We are making all variables global so that it can be accessed by the database
    long value_r;
    JTextField name_tf, fname_tf, email_tf, addr_tf, city_tf, state_tf, p_code_tf;
    JButton next; 
    JRadioButton m, f, ma, um, ot;
    JDateChooser date;
    
    Sign_Up_1(){
        setLayout(null);
        getContentPane().setBackground(Color.white); //  Change the background Color
        
        Random r = new Random();
        value_r = Math.abs((r.nextLong() % 9000L) + 1000L); 
        
        JLabel form_no = new JLabel("APPLICATION FORM NO: " + value_r);
        form_no.setFont(new Font("Raleway", Font.BOLD, 35));
        form_no.setBounds(110, 10, 720, 80);
        add(form_no);
        
        JLabel p_detail = new JLabel("Page 1: Personal Details");
        p_detail.setFont(new Font("Raleway", Font.ITALIC, 23));
        p_detail.setBounds(265, 65, 300, 50);
        add(p_detail);
        
        JLabel name = new JLabel("Name: ");
        name.setFont(new Font("Raleway", Font.BOLD, 25));
        name.setBounds(60, 150, 100, 45);
        add(name);
        
        name_tf = new JTextField();
        name_tf.setFont(new Font("Railway", Font.BOLD, 25));
        name_tf.setBounds(330, 150, 400, 40);
        add(name_tf);
        
        JLabel fname = new JLabel("Father's Name: ");
        fname.setFont(new Font("Raleway", Font.BOLD, 25));
        fname.setBounds(60, 200, 400, 45);
        add(fname);
        
        fname_tf = new JTextField();
        fname_tf.setFont(new Font("Railway", Font.BOLD, 25));
        fname_tf.setBounds(330, 200, 400, 40);
        add(fname_tf);
        
        JLabel dob = new JLabel("Date of Birth: ");
        dob.setFont(new Font("Raleway", Font.BOLD, 25));
        dob.setBounds(60, 250, 400, 45);
        add(dob);
        
        date = new JDateChooser();
        date.setFont(new Font("Railway", Font.BOLD, 25));
        date.setBounds(330, 250, 400, 40);
        date.setForeground(new Color(105,105,105));
        add(date);
       
        JLabel gen = new JLabel("Gender: ");
        gen.setFont(new Font("Raleway", Font.BOLD, 25));
        gen.setBounds(60, 300, 200, 45);
        add(gen);
        
        m = new JRadioButton("MALE"); // RadioButtons
        m.setFont(new Font("Monospaced", Font.CENTER_BASELINE, 25));
        m.setBounds(330, 300, 120, 40);
        m.setBackground(Color.white);
        add(m);
        
        f = new JRadioButton("FEMALE"); // RadioButtons
        f.setFont(new Font("Monospaced", Font.CENTER_BASELINE, 25));
        f.setBounds(460, 300, 150, 40);
        f.setBackground(Color.white);
        add(f);
        
        ButtonGroup gen_g = new ButtonGroup();
        gen_g.add(m); gen_g.add(f);
        
        JLabel email = new JLabel("Email ID: ");
        email.setFont(new Font("Raleway", Font.BOLD, 25));
        email.setBounds(60, 350, 300, 45);
        add(email);
        
        email_tf = new JTextField();
        email_tf.setFont(new Font("Railway", Font.BOLD, 25));
        email_tf.setBounds(330, 350, 400, 40);
        add(email_tf);
        
        JLabel mary = new JLabel("Marital Status: ");
        mary.setFont(new Font("Raleway", Font.BOLD, 25));
        mary.setBounds(60, 400, 400, 45);
        add(mary);
        
        ma = new JRadioButton("Married");
        ma.setFont(new Font("Monospaced", Font.CENTER_BASELINE, 23));
        ma.setBounds(330, 400, 130, 40);
        ma.setBackground(Color.WHITE);
        add(ma);
        
        um = new JRadioButton("Un-Married");
        um.setFont(new Font("Monospaced", Font.CENTER_BASELINE, 23));
        um.setBounds(460, 400, 170, 40);
        um.setBackground(Color.WHITE);
        add(um);
        
        ot = new JRadioButton("Other");
        ot.setFont(new Font("Monospaced", Font.CENTER_BASELINE, 23));
        ot.setBackground(Color.WHITE);
        ot.setBounds(630, 400, 120, 40);
        add(ot);
        
        ButtonGroup mary_status = new ButtonGroup();
        mary_status.add(ma); mary_status.add(um); mary_status.add(ot);
        
        JLabel addr = new JLabel("Address: ");
        addr.setFont(new Font("Raleway", Font.BOLD, 25));
        addr.setBounds(60, 450, 300, 45);
        add(addr);
        
        addr_tf = new JTextField();
        addr_tf.setFont(new Font("Railway", Font.BOLD, 18));
        addr_tf.setBounds(330, 450, 400, 50);
        add(addr_tf);
        
        JLabel city = new JLabel("City: ");
        city.setFont(new Font("Railway", Font.BOLD, 25));
        city.setBounds(60, 510, 300, 45);
        add(city);
        
        city_tf = new JTextField();
        city_tf.setFont(new Font("Railway", Font.BOLD, 25));
        city_tf.setBounds(330, 510, 400, 40);
        add(city_tf);
        
        JLabel state = new JLabel("State: ");
        state.setFont(new Font("Railway", Font.BOLD, 25));
        state.setBounds(60, 560, 300, 45);
        add(state);
        
        state_tf = new JTextField();
        state_tf.setFont(new Font("Railway", Font.BOLD, 25));
        state_tf.setBounds(330, 560, 400, 40);
        add(state_tf);
        
        JLabel p_code = new JLabel("Pin Code: ");
        p_code.setFont(new Font("Railway", Font.BOLD, 25));
        p_code.setBounds(60, 610, 300, 45);
        add(p_code);
        
        p_code_tf = new JTextField();
        p_code_tf.setFont(new Font("Railway", Font.BOLD, 25));
        p_code_tf.setBounds(330, 610, 400, 40);
        add(p_code_tf);
        
        next = new JButton("Next-Page");
        next.setForeground(Color.white);
        next.setBackground(Color.BLACK);
        next.setFont(new Font("Railway", Font.BOLD, 30));
        next.setBounds(480, 680, 250, 50);
// This is used to identify for which button action should be performed
        next.addActionListener(this); 
        add(next);
        
//  Trying to add styles in my button
        next.getModel().addChangeListener(new ChangeListener(){
            @Override
            public void stateChanged(ChangeEvent ev){
                ButtonModel model = (ButtonModel) ev.getSource();
                if(model.isRollover()){
                    next.setForeground(Color.YELLOW);
                    next.setBackground(Color.RED);
                }else if(model.isPressed()){
//  These two are not performing till now 
                    next.setForeground(Color.BLACK);
                    next.setBackground(Color.WHITE);
                }else{
                    next.setForeground(Color.BLACK);
                    next.setBackground(Color.ORANGE);
                }
            }
        });

        setSize(800, 800);
        setLocation(450, 70);
        setVisible(true);
        setTitle("Page-1");
    }
    
    public void actionPerformed(ActionEvent ae){
        String form_no = "" + value_r; // Long value converted into string
        String name = name_tf.getText();
        String fname = fname_tf.getText();
        String dob = ((JTextField) date.getDateEditor().getUiComponent()).getText();
        String gen = null;
        if(m.isSelected()){
            gen = "MALE";
        }else if(f.isSelected()){
            gen = "FEMALE";
        }
        String email = email_tf.getText();
        String mary = null;
        if(ma.isSelected()){
            mary = "Married";
        }else if(um.isSelected()){
            mary = "Un-Married";
        }else if(ot.isSelected()){
            mary = "Other";
        }
        String addr = addr_tf.getText();
        String city = city_tf.getText();
        String state = state_tf.getText();
        String p_code = p_code_tf.getText();
        
//  Now we have to apply a hit to the database 
        try{
// Trying some validation stuffs [This is not necessary, it totally depends on you. ]
            if(name.equals("")){
                JOptionPane.showMessageDialog(null, "Name is a Mendatory Field.!!");
            }
            else if(fname.equals("")){
                JOptionPane.showMessageDialog(null, "Father's Name is a Mendatory Field.!!");
            }else if(!name.equals("") && !fname.equals("")){
                
                Bank_db obj = new Bank_db(); // Object Creation for database
//  Database name is [Local_Bank] & table name is {Sign_Up}
                String query = "insert into Sign_Up values('"+form_no+"', '"+name+"', '"+fname+"', '"+dob+"', '"+gen+"', '"+email+"', '"+mary+"', '"+addr+"', '"+city+"', '"+state+"', '"+p_code+"')";
                obj.s.executeUpdate(query);
                
                setVisible(false);
                new Sign_Up_2(form_no).setVisible(true);
            }
            else{
                Bank_db obj = new Bank_db(); // Object Creation for database
//  Database name is [Local_Bank] & table name is {Sign_Up}
                String query = "insert into Sign_Up values('"+form_no+"', '"+name+"', '"+fname+"', '"+dob+"', '"+gen+"', '"+email+"', '"+mary+"', '"+addr+"', '"+city+"', '"+state+"', '"+p_code+"')";
                obj.s.executeUpdate(query); 
            }
        }catch (Exception e){
            System.out.println(e);
        }
    }
    
    public static void main(String args[]){
        new Sign_Up_1(); // Constructor
    }
}
