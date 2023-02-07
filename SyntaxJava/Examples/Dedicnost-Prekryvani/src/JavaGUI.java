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
				
				B podTrida = new B(1, 2, 3);
				
				text = podTrida.show();
				
				text = text + "\n\nmetoda show ve tride B\n";
				text = text + "prekryje metodu ve tride A\n";
				
				t1.setText(text);	
			
			}
		});
		
		but2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				
				String text;
				
				B2 podTrida = new B2(1, 2, 3);
				
				text = podTrida.show();
				
				text = text + "\n\nmetoda show je ve tride B2 zakomentovana\n";
				text = text + "zobrazi se tudis metoda z tridy A";
				
				t2.setText(text);	
	        }
		});
		
        frame.add(t1);
		frame.add(t2);
			
	}

}