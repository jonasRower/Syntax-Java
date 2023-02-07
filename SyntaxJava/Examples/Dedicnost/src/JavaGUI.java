import java.awt.Label;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class JavaGUI {
	
    public static void main(String[] args) {
		
        final JFrame frame = new JFrame("Java GUI");
        JButton but1 = new JButton("Program A");
        but1.setBounds(0, 0, 200, 30);
        JButton but2 = new JButton("Program B");
        but2.setBounds(300, 0, 200, 30);

        //obsluha tlacitek


        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(630, 250);
        frame.add(but1);
        frame.add(but2);
        frame.setLayout(null);
		
		
        Label l1 = new Label ("Pole A");
        Label l2 = new Label ("Pole B");
        
        final TextArea t1 = new TextArea ();
        final TextArea t2 = new TextArea (); 
        
        l1.setBounds(0, 30, 100, 30);
        l2.setBounds(300, 30, 100, 30);
        
        t1.setBounds(0, 60, 300, 150);
        t2.setBounds(300, 60, 300, 150);       
        
        t1.setText("");
       
        frame.add(l1);
        frame.add(l2);
		
        frame.add(t1);
        frame.add(t2);
		
		
        but1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){

                String text;

                KrabiceHmotnost krabicehm = new KrabiceHmotnost(100,5);

                String obj;
                String hmot;

                obj = "" + krabicehm.VratObjemKrabice();
                hmot = "" + krabicehm.hmotnost;
                text = "Objem krabice :  " + obj + "\n" + "Hmotnost krabice :  " + hmot;

                t1.setText(text);
            }
        });
		
        but2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){

                String text;

                //krabicehm neni vyuzita, jelikoz ziskavam promenne pouze z objemu
                KrabiceHmotnost krabicehm = new KrabiceHmotnost(100,5);
                KrabiceObjem krabiceObj = new KrabiceObjem();

                String obj;
                String hmot;

                obj = "" + krabiceObj.VratObjemKrabice();
                //hmot = "" + krabiceObj.hmotnost;
                //	-> nelze, jelikoz hmotnost dedi od objemu, ne obzacene
                hmot = "hmotnost dedi od objemu, ne obracene";
                text = "Objem krabice :  " + obj + "\n" + "Hmotnost krabice :  " + hmot;

                t2.setText(text);
            }
        });
		
        frame.add(t1);
        frame.add(t2);
			
	}

}