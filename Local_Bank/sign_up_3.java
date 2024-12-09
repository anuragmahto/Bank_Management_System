package Local_Bank;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class Sign_Up_3 extends JFrame implements ActionListener{
    JRadioButton sav, fix, cur, r_dep;
    JCheckBox atm, i_bank, mob_bank, e_mess, cheq, e_stat, confirm;
    JButton sub, can;
    String form_no;
    Sign_Up_3(String form_no){
        this.form_no = form_no;
        setLayout(null);
        getContentPane().setBackground(Color.white);
        
        JLabel acc_detail = new JLabel("Page 3: Accounts Details");
        acc_detail.setFont(new Font("Railway", Font.ITALIC, 28));
        acc_detail.setBounds(240, 20, 400, 50);
        add(acc_detail);
        
        JLabel acc_type = new JLabel("Accounts Type:-");
        acc_type.setFont(new Font("Railway", Font.BOLD, 28));
        acc_type.setBounds(30, 100, 400, 40);
        add(acc_type);
        
        
        sav = new JRadioButton("Savings Account");
        sav.setFont(new Font("Railway", Font.BOLD, 22));
        sav.setBounds(60, 150, 300, 40);
        sav.setBackground(Color.WHITE);
        add(sav);
        
        fix = new JRadioButton("Fixed Deposit Account");
        fix.setFont(new Font("Railway", Font.BOLD, 22));
        fix.setBounds(400, 150, 400, 40);
        fix.setBackground(Color.WHITE);
        add(fix);
        
        cur = new JRadioButton("Current Account");
        cur.setFont(new Font("Railway", Font.BOLD, 22));
        cur.setBounds(60, 200, 300, 40);
        cur.setBackground(Color.WHITE);
        add(cur);
        
        r_dep = new JRadioButton("Recurring Deposit Account");
        r_dep.setFont(new Font("Railway", Font.BOLD, 22));
        r_dep.setBounds(400, 200, 400, 40);
        r_dep.setBackground(Color.WHITE);
        add(r_dep);
        
        ButtonGroup acc_types = new ButtonGroup();
        acc_types.add(sav);acc_types.add(fix);acc_types.add(cur);acc_types.add(r_dep);
         
        JLabel card = new JLabel("Card Number: ");
        card.setFont(new Font("Railway", Font.BOLD, 28));
        card.setBounds(30, 270, 300, 40);
        add(card);
        
        JLabel mess = new JLabel("Your 16-Digit Card Number");
        mess.setFont(new Font("Railway", Font.BOLD, 16));
        mess.setBounds(30, 310, 300, 20);
        add(mess);
        
        JLabel dum_card = new JLabel("XXXX-XXXX-XXXX-7456");
        dum_card.setFont(new Font("Railway", Font.BOLD, 28));
        dum_card.setBounds(350, 270, 400, 40);
        add(dum_card);
        
        JLabel pin = new JLabel("Pin Number: ");
        pin.setFont(new Font("Railway", Font.BOLD, 28));
        pin.setBounds(30, 350, 300, 40);
        add(pin);
        
        JLabel mess_2 = new JLabel("Your 4-Digit Pin Number");
        mess_2.setFont(new Font("Railway", Font.BOLD, 16));
        mess_2.setBounds(30, 390, 300, 20);
        add(mess_2);
        
        JLabel dum_pin = new JLabel("XXXX");
        dum_pin.setFont(new Font("Railway", Font.BOLD, 28));
        dum_pin.setBounds(350, 350, 300, 40);
        add(dum_pin);
        
        JLabel serv_type = new JLabel("Services Required (Only 1):-");
        serv_type.setFont(new Font("Railway", Font.BOLD, 28));
        serv_type.setBounds(30, 440, 500, 40);
        add(serv_type);
        
        atm = new JCheckBox("ATM Card");
        atm.setBackground(Color.WHITE);
        atm.setFont(new Font("Railway", Font.BOLD, 22));
        atm.setBounds(60, 480, 200, 40);
        add(atm);
        
        i_bank = new JCheckBox("Internet Banking");
        i_bank.setBackground(Color.WHITE);
        i_bank.setFont(new Font("Railway", Font.BOLD, 22));
        i_bank.setBounds(60, 530, 300, 40);
        add(i_bank);
        
        mob_bank = new JCheckBox("Mobile Banking");
        mob_bank.setBackground(Color.WHITE);
        mob_bank.setFont(new Font("Railway", Font.BOLD, 22));
        mob_bank.setBounds(60, 580, 300, 40);
        add(mob_bank);
        
        e_mess = new JCheckBox("E-mails & Messages");
        e_mess.setBackground(Color.WHITE);
        e_mess.setFont(new Font("Railway", Font.BOLD, 22));
        e_mess.setBounds(400, 480, 500, 40);
        add(e_mess);
        
        cheq = new JCheckBox("Cheque Book");
        cheq.setBackground(Color.WHITE);
        cheq.setFont(new Font("Railway", Font.BOLD, 22));
        cheq.setBounds(400, 530, 300, 40);
        add(cheq);
        
        e_stat = new JCheckBox("E-Statement");
        e_stat.setBackground(Color.WHITE);
        e_stat.setFont(new Font("Railway", Font.BOLD, 22));
        e_stat.setBounds(400, 580, 300, 40);
        add(e_stat);
        
        confirm = new JCheckBox("I hereby declares that the above entered details are correct to the best of my knowledge.");
        confirm.setBackground(Color.WHITE);
        confirm.setFont(new Font("Railway", Font.PLAIN, 16));
        confirm.setBounds(30, 620, 750, 40);
        add(confirm);
        
        can = new JButton("Cancel");
        can.setForeground(Color.white);
        can.setBackground(Color.BLACK);
        can.setFont(new Font("Railway", Font.BOLD, 30));
        can.setBounds(50, 690, 200, 50);
        can.addActionListener(this);
        add(can);
        
        sub = new JButton("Submit");
        sub.setForeground(Color.white);
        sub.setBackground(Color.BLACK);
        sub.setFont(new Font("Railway", Font.BOLD, 30));
        sub.setBounds(550, 690, 200, 50);
        sub.addActionListener(this);
        add(sub);
        
        
        setSize(800, 800);
        setLocation(450, 70);
        setVisible(true);
        setTitle("Page-3");
    }
    
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == sub){
            String acc_type = null;
            if(sav.isSelected()){
                acc_type = "Savings Account";
            }else if(fix.isSelected()){
                acc_type = "Fixed Deposit Account";
            }else if(cur.isSelected()){
                acc_type = "Current Account";
            }else if(r_dep.isSelected()){
                acc_type = "Recurring Deposit Account";
            }
            
            Random r = new Random();
            String card_num = "" + Math.abs((r.nextLong() % 90000000L) + 5040936000000000L);
            String pin_num = "" + Math.abs((r.nextLong() % 9000L) + 1000L);
            
//  When you have selected only one option.
            String facility = "";
            if(atm.isSelected()){
                facility += " ATM Card";
            }else if(i_bank.isSelected()){
                facility += " Internet Banking";
            }else if(mob_bank.isSelected()){
                facility += " Mobile Banking";
            }else if(e_mess.isSelected()){
                facility += " E-mails & Messages";
            }else if(cheq.isSelected()){
                facility += " Cheque Book";
            }else if(e_stat.isSelected()){
                facility += " E-Statement";
            }

//      Trying to add multiple values but not working currently so adjust with that.            

//            StringBuilder f_build = new StringBuilder();
//            if(atm.isSelected()){
//                f_build.append(" ATM Card,");
//            }else if(i_bank.isSelected()){
//                f_build.append(" Internet Banking,");
//            }else if(mob_bank.isSelected()){
//                f_build.append(" Mobile Banking,");
//            }else if(e_mess.isSelected()){
//                f_build.append(" E-Mails & Messages,");
//            }else if(cheq.isSelected()){
//                f_build.append(" Cheque Book,");
//            }else if(e_stat.isSelected()){
//                f_build.append(" E-Statement,");
//            }
////  This is used to remove the comma after the last selected checkbox
//            if(f_build.length() > 0){
//                f_build.setLength(f_build.length() - 1);
//            }
//            String facility = f_build.toString();
            
//  Database entry process from here 
            try{
                Bank_db obj = new Bank_db();
                String query = "insert into Sign_Up_3 values('"+form_no+"','"+acc_type+"', '"+card_num+"','"+pin_num+"', '"+facility+"')";
                obj.s.executeUpdate(query);
                    
                String que = "insert into Log_details values('"+form_no+"', '"+card_num+"','"+pin_num+"')";
                obj.s.executeUpdate(que);
                    
//  This is used to change the title of the message pane                   
                JOptionPane.showMessageDialog(null, "Card_Number:- " + card_num + "\nPin_Number:- " + pin_num, "Sensitive Data", JOptionPane.INFORMATION_MESSAGE);
            }catch(Exception exc){
                System.out.println(exc);
            }
        }else if(e.getSource() == can){
            
        }
    }
    
    public static void main(String args[]){
        new Sign_Up_3(""); // Constructor
    }
}