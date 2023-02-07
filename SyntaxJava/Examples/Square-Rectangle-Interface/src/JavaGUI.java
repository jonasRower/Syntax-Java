import java.awt.Label;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.security.auth.callback.Callback;
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

                String Text = "JE IMPLEMENTOVANO ROZHRANI\n\n";

                IntShape mystack;  //vytvoreni referencni promenne rozhrani

                RectangleInterface rec = new RectangleInterface(10, 20); 
                SquareInterface squ = new SquareInterface(10);

                mystack = rec;	

                double WidthRect;
                double WidthSquare;

                double HeightRect;
                double HeightSquare;

                double getAreaRect;
                double getAreaSquare;

                WidthRect = mystack.getWidth();
                HeightRect = mystack.getHeight();
                getAreaRect = mystack.getArea();

                mystack = squ;

                WidthSquare = mystack.getWidth();
                HeightSquare = mystack.getHeight();
                getAreaSquare = mystack.getArea();


                Text = Text + "Šířka obdélníka: " + WidthRect + "\n";
                Text = Text + "Výška obdélníka: " +  HeightRect + "\n";

                Text = Text + "Šířka čtverce  : " +  WidthSquare + "\n";
                Text = Text + "Výška čtverce  : " +  HeightSquare + "\n";

                Text = Text + "Obsah obdélníka: " +  getAreaRect + "\n";
                Text = Text + "Obsah čtverce  : " +  getAreaSquare + "\n";

                t1.setText(Text); 
				
            }
        });
		
        but2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){

                String Text;
                Text = "Proměnné jsou získány\npřes abstraktní třídu\n\n";

                // creating Rectangle object 
                ShapeAbstract s1 = new RectangleAbstract(10, 20); 

                // creating Square object 
                ShapeAbstract s2 = new SquareAbstract(10); 

                double WidthRect;
                double WidthSquare;

                double HeightRect;
                double HeightSquare;

                double getAreaRect;
                double getAreaSquare;


                // getting width and height of s1 
                WidthRect = s1.getWidth();
                HeightRect = s1.getHeight();

                WidthSquare = s2.getWidth();
                HeightSquare = s2.getHeight();

                getAreaRect = s1.getArea();
                getAreaSquare = s2.getArea();


                Text = Text + "Šířka obdélníka: " + WidthRect + "\n";
                Text = Text + "Výška obdélníka: " +  HeightRect + "\n";

                Text = Text + "Šířka čtverce  : " +  WidthSquare + "\n";
                Text = Text + "Výška čtverce  : " +  HeightSquare + "\n";

                Text = Text + "Obsah obdélníka: " +  getAreaRect + "\n";
                Text = Text + "Obsah čtverce  : " +  getAreaSquare + "\n";

                t2.setText(Text);
            }
        });
		
        frame.add(t1);
        frame.add(t2);
			
	}
}