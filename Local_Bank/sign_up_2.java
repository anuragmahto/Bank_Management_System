package Local_Bank;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
// JCalender jar file 
import com.toedter.calendar.*;
import javax.swing.event.*;

public class Sign_Up_2 extends JFrame implements ActionListener{
//   We are making all variables global so that it can be accessed by the database
    long value_r;
    JTextField pan_tf, adhar_tf;
    JButton next; 
    JRadioButton sen, jun, y, n;
    JDateChooser date;
// We use to add a drop down    
    JComboBox religion_tf, inc_tf, edu_q_tf, occp_tf; 
    String form_no;
    
    Sign_Up_2(String form_no){
        this.form_no = form_no;
        setLayout(null);
        getContentPane().setBackground(Color.white); //  Change the background Color
        
        JLabel a_detail = new JLabel("Page 2: Personal Details");
        a_detail.setFont(new Font("Raleway", Font.ITALIC, 28));
        a_detail.setBounds(245, 25, 400, 50);
        add(a_detail);
        
        JLabel religion = new JLabel("Religion: ");
        religion.setFont(new Font("Raleway", Font.BOLD, 25));
        religion.setBounds(60, 100, 150, 45);
        add(religion);
        
        String arr[] = {"Hindu","Muslim","Sikh","Christian","Other"};
//  This command is used to add a drop_down box        
        religion_tf = new JComboBox(arr);
        religion_tf.setFont(new Font("Raleway", Font.BOLD, 25));
        religion_tf.setBounds(350, 100, 400, 45);
        religion_tf.setBackground(Color.WHITE);
        add(religion_tf);
        
        JLabel in = new JLabel("Income: ");
        in.setFont(new Font("Raleway", Font.BOLD, 25));
        in.setBounds(60, 180, 150, 45);
        add(in);
        
        String inc[] = {"Null","< 1,50,000","< 2,50,000","< 5,00,000","Upto 10,00,000"};
//  This command is used to add a drop_down box        
        inc_tf = new JComboBox(inc);
        inc_tf.setFont(new Font("Railway", Font.BOLD, 25));
        inc_tf.setBounds(350, 180, 400, 45);
        inc_tf.setBackground(Color.WHITE);
        add(inc_tf);
       
        JLabel edu = new JLabel("Educational -  ");
        edu.setFont(new Font("Raleway", Font.BOLD, 25));
        edu.setBounds(60, 260, 300, 45);
        add(edu);
        
        JLabel qual = new JLabel("Qualification: ");
        qual.setFont(new Font("Raleway", Font.BOLD, 25));
        qual.setBounds(60, 300, 250, 45);
        add(qual);
        
        String edu_q[] = {"Non-Graduate","Graduate","Post-Graduation","Doctrate","Others"};
//  This command is used to add a drop_down box        
        edu_q_tf = new JComboBox(edu_q);
        edu_q_tf.setFont(new Font("Railway", Font.BOLD, 25));
        edu_q_tf.setBounds(350, 290, 400, 45);
        edu_q_tf.setBackground(Color.WHITE);
        add(edu_q_tf);
        
        
        JLabel ocp = new JLabel("Occupation: ");
        ocp.setFont(new Font("Raleway", Font.BOLD, 25));
        ocp.setBounds(60, 360, 200, 45);
        add(ocp);
        
        String occp[] = {"Salaried","Self-Employed","Bussiness","Student","Retired","Others"};
//  This command is used to add a drop_down box        
        occp_tf = new JComboBox(occp);
        occp_tf.setFont(new Font("Railway", Font.BOLD, 25));
        occp_tf.setBounds(350, 360, 400, 45);
        occp_tf.setBackground(Color.WHITE);
        add(occp_tf);
        
        JLabel pan = new JLabel("PAN Number: ");
        pan.setFont(new Font("Railway", Font.BOLD, 25));
        pan.setBounds(60, 420, 300, 45);
        add(pan);
        
        pan_tf = new JTextField();
        pan_tf.setFont(new Font("Railway", Font.BOLD, 25));
        pan_tf.setBounds(350, 420, 400, 40);
        add(pan_tf);
        
        JLabel adhar = new JLabel("Aadhar Number: ");
        adhar.setFont(new Font("Railway", Font.BOLD, 25));
        adhar.setBounds(60, 480, 300, 45);
        add(adhar);
        
        adhar_tf = new JTextField();
        adhar_tf.setFont(new Font("Railway", Font.BOLD, 25));
        adhar_tf.setBounds(350, 480, 400, 40);
        add(adhar_tf);
        
        JLabel senior = new JLabel("Senior Citizen: ");
        senior.setFont(new Font("Railway", Font.BOLD, 25));
        senior.setBounds(60, 540, 300, 45);
        add(senior);
        
        sen = new JRadioButton("YES");
        sen.setFont(new Font("Monospaced", Font.CENTER_BASELINE, 23));
        sen.setBounds(350, 540, 130, 40);
        sen.setBackground(Color.WHITE);
        add(sen);
        
        jun = new JRadioButton("NO");
        jun.setFont(new Font("Monospaced", Font.CENTER_BASELINE, 23));
        jun.setBounds(520, 540, 170, 40);
        jun.setBackground(Color.WHITE);
        add(jun);
        
        ButtonGroup senior_status = new ButtonGroup();
        senior_status.add(sen); senior_status.add(jun);
        
        
        JLabel ex_acc = new JLabel("Exsisting Account: ");
        ex_acc.setFont(new Font("Railway", Font.BOLD, 25));
        ex_acc.setBounds(60, 600, 300, 45);
        add(ex_acc);
        
        y = new JRadioButton("YES");
        y.setFont(new Font("Monospaced", Font.CENTER_BASELINE, 23));
        y.setBounds(350, 600, 130, 40);
        y.setBackground(Color.WHITE);
        add(y);
        
        n = new JRadioButton("NO");
        n.setFont(new Font("Monospaced", Font.CENTER_BASELINE, 23));
        n.setBounds(520, 600, 170, 40);
        n.setBackground(Color.WHITE);
        add(n);
        
        ButtonGroup acc_status = new ButtonGroup();
        acc_status.add(y); acc_status.add(n);
        
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
        setTitle("Page-2");
    }
    
    public void actionPerformed(ActionEvent ae){
//  The next line is not used because it will always give 0. so better comment it
//        String form_no = "" + value_r; // Long value converted into string
        String religion = (String) religion_tf.getSelectedItem();
        String in = (String) inc_tf.getSelectedItem();
        String qual = (String) edu_q_tf.getSelectedItem();
        String ocp = (String) occp_tf.getSelectedItem();
        
        String senior = null;
        if(sen.isSelected()){
            senior = "YES";
        }else if(sen.isSelected()){
            senior = "NO";
        }
        String ex_acc = null;
        if(y.isSelected()){
            ex_acc = "YES";
        }else if(n.isSelected()){
            ex_acc = "NO";
        }
        String pan = pan_tf.getText();
        String adhar = adhar_tf.getText();
        
//  Now we have to apply a hit to the database 
        try{
            if(!pan.equals(pan.toUpperCase())){
                JOptionPane.showMessageDialog(null, "PAN Number should be in Capital Letters.");
            }else if(pan.equals(pan.toUpperCase())){
                
//  Now the conditions matched                
                Bank_db obj = new Bank_db(); // Object Creation for database
                String query = "insert into Sign_Up_2 values('"+form_no+"', '"+religion+"', '"+in+"', '"+qual+"', '"+ocp+"', '"+senior+"', '"+ex_acc+"', '"+pan+"', '"+adhar+"')";
                obj.s.executeUpdate(query);
                
                setVisible(false);
                new Sign_Up_3(form_no).setVisible(true);
            }else{
                Bank_db obj = new Bank_db(); // Object Creation for database
//  Database name is [Local_Bank] & table name is {Sign_Up}
                String query = "insert into Sign_Up_2 values('"+form_no+"', '"+religion+"', '"+in+"', '"+qual+"', '"+ocp+"', '"+senior+"', '"+ex_acc+"', '"+pan+"', '"+adhar+"')";
                obj.s.executeUpdate(query);
            }
        }catch (Exception e){
            System.out.println(e);
        }
    }
    
    public static void main(String args[]){
        new Sign_Up_2(""); // Constructor which is passing Enpty String.
    }
}
