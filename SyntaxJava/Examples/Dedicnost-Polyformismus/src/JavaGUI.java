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
                text = "Polyformysmus\n\n";

                Utvar f = new Utvar(10, 10);
                Pravouhelnik r = new Pravouhelnik(20, 10);
                Trojuhelnik t = new Trojuhelnik(30, 10);

                Utvar figref;
                figref = r;
                text = text + "Plocha je " + figref.plocha() + "\n";

                figref = t;
                text = text + "Plocha je " + figref.plocha() + "\n";

                figref = f;
                text = text + "Plocha je " + figref.plocha() + "\n";


                t1.setText(text);

                //kod se opakuje, ackoliv se pouzivaji data ruznych trid
                // - to je polyformyzmus

            }
        });

        but2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
				
                String text;
                text = "Ukazka abstraktnich trid\n\n";

                //Utvar2 f = new Utvar2(10, 10);
                Pravouhelnik2 r = new Pravouhelnik2(20, 10);
                Trojuhelnik2 t = new Trojuhelnik2(30, 10);

                Utvar2 figref;
                figref = r;
                text = text + "Plocha je " + figref.plocha() + "\n";

                figref = t;
                text = text + "Plocha je " + figref.plocha() + "\n";


                t2.setText(text);
				
            }
        });
		
        frame.add(t1);
        frame.add(t2);
			
	}

}