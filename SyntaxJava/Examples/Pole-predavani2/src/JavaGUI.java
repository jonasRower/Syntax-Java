import java.awt.Font;
import java.awt.Label;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class JavaGUI {
	
    public static void main(String[] args) {

        JFrame frame = new JFrame("Java GUI");
        JButton but1 = new JButton("Program A");
        but1.setBounds(0, 0, 200, 30);
        JButton but2 = new JButton("Program B");
        but2.setBounds(300, 0, 200, 30);


        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(630, 250);
        frame.add(but1);
        frame.add(but2);
        frame.setLayout(null);


        Font font = new Font("monospaced", Font.PLAIN, 12);
		
        Label l1 = new Label ("Pole A");
        Label l2 = new Label ("Pole B");
        
        final TextArea t1 = new TextArea ();
        final TextArea t2 = new TextArea (); 
        
        l1.setBounds(0, 30, 100, 30);
        l2.setBounds(300, 30, 100, 30);
        
        t1.setBounds(0, 60, 300, 150);
        t2.setBounds(300, 60, 300, 150);       
        
        t1.setFont(font);
        t2.setFont(font);
        
        
        frame.add(l1);
        frame.add(l2);
		
        frame.add(t1);
        frame.add(t2);
		
		
        but1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){

                String text;

                TiskniPole Data = new TiskniPole();	
                text = Data.VratPole();

                text = text + "\n\nText se ziska z tridy TiskniPole\n"; 
                text = text + "z metody VratPole\n\n";
                text = text + "Data ve tride TiskniPole se ziskaji\n";
                text = text + "pomoci konstruktoru bez parametru,\n";
                text = text + "ktery ziska data z DefinujPole\n";

                t1.setText(text);
                
            }
        });
		
        but2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){

                String text;

                PoleHlavniProgram HlavniProgram = new PoleHlavniProgram();
                text = HlavniProgram.HlavniProgram();

                text = text + "\n\nKod je zapouzdren ve tride\n"; 
                text = text + "PoleHlavniProgram\n\n";
                text = text + "Zde se vykona kod:\n";
                text = text + "1) iniciailizuje se trida definujPole\n";
                text = text + "2) inicializuje se pole\n";
                text = text + "3) iniciailizuje se trida TiskniPole\n";
                text = text + "   pole se preda pomoci konstruktoru\n";

                t2.setText(text);

            }
        });
		
        frame.add(t1);
        frame.add(t2);
			
	}

}