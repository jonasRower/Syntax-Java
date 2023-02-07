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

                text = "Vyuziti genericke tridy\n\n";

                Gen<Integer>iOb = new Gen<Integer>(88);
                text = text + iOb.showType();

                text = text + "\nobjekt ob nemusi byt pretypovavan\n          na integer\n";
                int v = iOb.getob();
                text = text + "\niOb: " + v;

                //nova instance tridy
                Gen<String> strOb = new Gen<String> ("test prace s generickou tridou");
                text = text + iOb.showType() + "\n";

                //promenna nemusi byt pretypovana
                text = text + strOb.getob();

                t1.setText(text);

            }
        });
		
        but2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){

                String text;

                text = "Vyuziti NEgenericke tridy\n\n";

                NonGen iOb = new NonGen(88);
                text = text + iOb.showType();


                text = text + "\nobjekt ob nutno pretypovat\n               na integer\n";
                int v = (Integer)iOb.getob();
                text = text + "\niOb: " + v;

                //nova instance tridy
                NonGen strOb = new NonGen ("test prace s negenerickou tridou");
                text = text + iOb.showType() + "\n";

                //promennou opet pretypovat
                text = text + (String)strOb.getob();

                t2.setText(text);

            }
        });
		
        frame.add(t1);
        frame.add(t2);
			
	}

}