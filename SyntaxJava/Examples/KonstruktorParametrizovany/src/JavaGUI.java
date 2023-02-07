import java.awt.Label;
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

        //obsluha tlacitek


        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(630, 250);
        frame.add(but1);
        frame.add(but2);
        frame.setLayout(null);
		
		
        Label l1 = new Label ("Pole A");
        Label l2 = new Label ("Pole B");
        
        final TextField t1 = new TextField ();
        final TextField t2 = new TextField (); 
        
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
                //inicializuji novou tridu
                novaTrida Trida = new novaTrida("10");

                String text;
                //vraci se hodnota
                text = Trida.VratPromennou();
                t1.setText(text); 
            }
        });

        but2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                //inicializuji novou tridu
                novaTrida2 Trida = new novaTrida2("20");

                String text;
                //v konstruktoru je deklarovana promenna, nevraci nic
                text = Trida.VratPromennou();
                t2.setText(text);
            }
        });
		
        frame.add(t1);
        frame.add(t2);
			
	}

}