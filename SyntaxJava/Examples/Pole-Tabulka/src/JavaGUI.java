import java.awt.Font;
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

        Font font = new Font("monospaced", Font.PLAIN, 12);
		
		
        Label l1 = new Label ("Pole A");
        Label l2 = new Label ("Pole B");
        
        final TextArea t1 = new TextArea ();
        final TextArea t2 = new TextArea (); 
       
        t1.setFont(font);
        t2.setFont(font);
        
        //t1.setFont(new Font("monospaced", Font.PLAIN, 12));
        
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

                novaTrida trida = new novaTrida();

                String textPole;
                textPole = trida.VratPole();

                t1.setText(textPole);  
            }
        });
		
        but2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){

                //Inicializuje tridu s polem
                Pole2D tridaPole2D = new Pole2D();

                //Naplni tridu s daty
                tridaPole2D.definujPole();

                //Inicializuje tridu pro tisk pole
                novaTrida trida = new novaTrida();

                String textPole;
                textPole = trida.VratPole2D();

                t2.setText(textPole);

            }

        });
		
        frame.add(t1);
        frame.add(t2);
			
	}

}